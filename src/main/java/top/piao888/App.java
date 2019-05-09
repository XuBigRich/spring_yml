package top.piao888;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.piao888.domain.Xhz;
import top.piao888.domain.XhzInterface;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("application.yml");
//        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        XhzInterface xhzInterface=(Xhz)ac.getBean("xhz");
        System.out.println(xhzInterface.hello("wrold！"));
    }
}
