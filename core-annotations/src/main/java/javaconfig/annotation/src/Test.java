package javaconfig.annotation.src;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		
		Passport passport = context.getBean("passport",Passport.class);
		
		System.out.println(passport);
	}

}
