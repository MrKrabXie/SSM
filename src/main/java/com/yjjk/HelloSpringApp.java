package com.yjjk;

import com.yjjk.entity.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        // 创建Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 从容器中获取Bean
        HelloWorld helloWorld = context.getBean("helloWorld", HelloWorld.class);

        // 调用Bean的方法
        System.out.println(helloWorld.sayHello());
    }
}
