package kr.co.dhlee.velocity;

import java.io.FileReader;
import java.io.StringWriter;
import java.util.Set;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ClassGenerator
{
    public static void main( String[] args )
        throws Exception
    {
        /*  ���� ������ ��� �ʱ�ȭ�� �Ѵ�.  */

        VelocityEngine ve = new VelocityEngine();
        ve.init();

        /*  �������� ���ø��� ����.  */

        Template t = ve.getTemplate( "templates/voclass.vm" );

        /*  ���ؽ�Ʈ�� �����ϰ� �����͸� �߰��Ѵ�. */
                
        VelocityContext context = new VelocityContext();

        JSONParser parser = new JSONParser();
        Object obj = parser.parse(new FileReader(
                "./templates/sample.json"));

        JSONObject jsonObject = (JSONObject) obj;
        
        Set<String> keys = jsonObject.keySet();
        
        for(String key : keys ) {
          context.put(key, jsonObject.get(key));
        }


        /* ���� StringWriter ������ ���ø��� ǥ���Ѵ�. */

        StringWriter writer = new StringWriter();

        t.merge( context, writer );

        /* World�� �����ش�. */

        System.out.println( writer.toString() );    
    }
}
