package javaconfig.annotation.src;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Passport {
	
	@Value("#{annotation.passportNo}")
	private String passportNo;
	
	@Value("#{annotation.passportHolderName}")
	private String passportHolderName;
	
	@Value("#{annotation.country}")
	private String country;
	
	@Override
	public String toString() {
		return "Passport [passportNo=" + passportNo + ", passportHolderName=" + passportHolderName + ", country="
				+ country + "]";
	}
	
	
	
}
