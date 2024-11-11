package Demo;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String args[]){
        //what is  bean factory --> all classes onjects  are called as beans and we get it from bean factory
        // what is application context
        //application context extends bean factory

        ApplicationContext context = new ApplicationContext();
        Doctor doc=new Doctor();
        doc.assist();
    }
}
