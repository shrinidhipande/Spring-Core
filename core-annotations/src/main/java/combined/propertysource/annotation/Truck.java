package combined.propertysource.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:combined/propertysource/annotation/truckdtls.properties")
public class Truck {

	@Value("${truckNo1}")
	private String truckNo;
	
	@Value("${driverName1}")
	private String driverName;
	
	public String getTruckNo() {
		return truckNo;
	}
	public void setTruckNo(String truckNo) {
		this.truckNo = truckNo;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	
	@Override
	public String toString() {
		return "Truck [truckNo=" + truckNo + ", driverName=" + driverName + "]";
	}
	
	
		
}
