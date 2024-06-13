package com.spring;


    	import org.springframework.context.ApplicationContext;
    	import org.springframework.context.support.ClassPathXmlApplicationContext;

    	import com.springJdbc.Entity.Student;
    	import com.springJdbc.dao.StudentDao;

    	
    	public class App 
    	{
    	    public static void main( String[] args )
    	    {
    	        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
    	        StudentDao dao=context.getBean("studentDao",StudentDao.class);
    	          Student s=new Student();
    	          s.setId(101);
    	          s.setSname("Vikash");
    	          s.setAddress("Indore");
    	           int result=dao.insert(s);
    	           System.out.println("Student added"+ result);
    	    }

        
    }

