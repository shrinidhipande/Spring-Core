package comined.javaconfig.annotation;


//We dont have sourcecode of this class So we will use javaConfig for this class
//javaconfig for put this class as bean definition

public class Tuner {
	
	private String band;

	public void setBand(String band) {
		this.band = band;
	}

	@Override
	public String toString() {
		return "Tuner [band=" + band + "]";
	}
	
	
}