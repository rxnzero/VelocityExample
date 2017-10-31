package kr.co.dhlee.velocity;

import java.io.StringWriter;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;


public class HelloWorld
{
    public static void main( String[] args )
        throws Exception
    {
        /*  ���� ������ ��� �ʱ�ȭ�� �Ѵ�.  */

        VelocityEngine ve = new VelocityEngine();
        ve.init();

        /*  �������� ���ø��� ����.  */

        Template t = ve.getTemplate( "templates/helloworld.vm" );

        /*  ���ؽ�Ʈ�� �����ϰ� �����͸� �߰��Ѵ�. */

        VelocityContext context = new VelocityContext();

        context.put("name", "World");

        /* ���� StringWriter ������ ���ø��� ǥ���Ѵ�. */

        StringWriter writer = new StringWriter();

        t.merge( context, writer );

        /* World�� �����ش�. */

        System.out.println( writer.toString() );    
    }
}
