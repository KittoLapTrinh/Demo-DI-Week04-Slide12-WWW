package vn.edu.iuh.fit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import vn.edu.iuh.fit.models.Person;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
//        Person p1 = ctx.getBean("p1", Person.class);
//        p1.show();
//
//        Person p2 = ctx.getBean("p2", Person.class);
//        p2.show();

        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Person p1 = context.getBean("p1", Person.class);
        System.out.println(p1);



    }
}