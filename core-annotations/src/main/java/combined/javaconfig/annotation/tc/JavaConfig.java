package combined.javaconfig.annotation.tc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= {"combined.javaconfig.annotation.tc"})
public class JavaConfig {

	@Bean
	public Radio radio(Tuner tuner) {
		
		Radio radio = new Radio();
		radio.setTuner(tuner);
		return radio; 
		
	}
	
}
