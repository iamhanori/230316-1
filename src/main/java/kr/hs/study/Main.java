package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        TestBean1 obj1 = ctx.getBean("t1", TestBean1.class);
        System.out.println("obj1 : "+obj1);
        obj1.prData();

        // int
        TestBean1 obj2 = ctx.getBean("t2", TestBean1.class);
        System.out.println("obj2 : "+obj2);
        obj2.prData();

        // double
        TestBean1 obj3 = ctx.getBean("t3", TestBean1.class);
        System.out.println("obj3 : "+obj3);
        obj3.prData();

        // String
        TestBean1 obj4 = ctx.getBean("t4", TestBean1.class);
        System.out.println("obj4 : "+obj4);
        obj4.prData();

        ctx.close();
    }
}