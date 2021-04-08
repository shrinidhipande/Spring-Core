package combined.javaconfig.annotation.tc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Tuner {
	
	@Value("FM")
	private String type;
	
	public String toString() {
		return type;
	}
	
}
