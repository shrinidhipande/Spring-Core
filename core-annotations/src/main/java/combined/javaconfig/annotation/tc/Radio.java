package combined.javaconfig.annotation.tc;

//We dont have source code of this class
public class Radio {
	
	private Tuner tuner;
	
	public void setTuner(Tuner tuner) {
		this.tuner = tuner;
	}
	
	public void print() {
		System.out.println("Radioi started with Tuner "+tuner);
	}
	
	
}
