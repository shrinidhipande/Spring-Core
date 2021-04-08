package com.loan.beans;

import java.io.IOException;
import java.util.Properties;

import com.loan.cache.Cache;

public class EmiCalculator {

	LoanEstimate loanEstimate = null;
	Cache cache = null;
	
	public void setLoanEstimate(LoanEstimate loanEstimate) {
		this.loanEstimate = loanEstimate;
	}
	
	public EmiCalculator(Cache cache) {
		this.cache = cache;
	}
	
	public double calculate() {
		String city = loanEstimate.getCity();
		long amount = loanEstimate.getAmount();
		int tenureInMonths = loanEstimate.getTenureInMonth();
		
		Properties props = cache.get("cities");
		Double emi = 0.0;
		if(props.containsKey(city)) {
			double interest = Double.parseDouble(props.getProperty(city));
			emi = (((amount * interest) / 100) + amount) / tenureInMonths;
		}
		
		return emi;
	}
	
}
