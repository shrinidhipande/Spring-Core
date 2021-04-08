package comined.javaconfig.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//We have sourcecode of this class.

@Component("myRadio")
public class Radio {
	
	
	private Tuner tuner;

	@Autowired
	public void setTuner(Tuner tuner) {
		this.tuner = tuner;
	}

	@Override
	public String toString() {
		return "Radio [tuner=" + tuner + "]";
	}
	
	
	

}
