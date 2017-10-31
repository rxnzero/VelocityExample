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
        /*  먼저 엔진을 얻고 초기화를 한다.  */

        VelocityEngine ve = new VelocityEngine();
        ve.init();

        /*  다음으로 템플릿을 얻어낸다.  */

        Template t = ve.getTemplate( "templates/helloworld.vm" );

        /*  컨텍스트를 생성하고 데이터를 추가한다. */

        VelocityContext context = new VelocityContext();

        context.put("name", "World");

        /* 이제 StringWriter 안으로 템플릿을 표현한다. */

        StringWriter writer = new StringWriter();

        t.merge( context, writer );

        /* World를 보여준다. */

        System.out.println( writer.toString() );    
    }
}
