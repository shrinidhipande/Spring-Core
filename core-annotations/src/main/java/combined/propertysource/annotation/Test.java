package combined.propertysource.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext("combined.propertysource.annotation");
		Truck truck = context.getBean("truck",Truck.class);
		System.out.println(truck);
	}

}
