package comined.javaconfig.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= {"comined.javaconfig.annotation"})
public class JavaConfig {

	@Bean
	public Tuner tuner() {
		Tuner tuner = new Tuner();
		tuner.setBand("AM");
		return tuner;
	}
	
}
