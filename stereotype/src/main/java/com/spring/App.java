package com.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
             ApplicationContext context = new ClassPathXmlApplicationContext("spconfig.xml");
        		Person p = (Person) context.getBean("per");
        		System.out.println(p);	
        	}
      
}
