package combined.javaconfig.annotation.tc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Radio radio =  context.getBean("radio",Radio.class);
		
		radio.print();
		
	}

}
