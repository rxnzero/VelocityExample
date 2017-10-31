package kr.co.dhlee.velocity;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

public class PetStoreEmail
{
    public static void main( String[] args )
        throws Exception
    {
        /*  first, get and initialize an engine  */

        VelocityEngine ve = new VelocityEngine();
        ve.init();

        /*  organize our data  */

        ArrayList list = new ArrayList();
        Map map = new HashMap();

        map.put("name", "horse");
        map.put("price", "$100.00");
        list.add( map );

        map = new HashMap();
        map.put("name", "dog");
        map.put("price", "$59.99");
        list.add( map );

        map = new HashMap();
        map.put("name", "bear");
        map.put("price", "$3.99");
        list.add( map );

        /*  add that list to a VelocityContext  */
        
        VelocityContext context = new VelocityContext();
        context.put("petList", list);

        /*  get the Template  */

        Template t = ve.getTemplate( "templates/voclass.vm" );
        //[역자 주] 한글을 사용한다면 Template t = ve.getTemplate("petstoreemail.vm","KSC5601");을 사용한다.

        /*  now render the template into a Writer  */

        StringWriter writer = new StringWriter();

        t.merge( context, writer );

        /* use the output in your email body */
//        sendEmail( writer.toString() );
      System.out.println( writer.toString() );
    }
}