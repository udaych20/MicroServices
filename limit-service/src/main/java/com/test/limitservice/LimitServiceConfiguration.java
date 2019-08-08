package com.test.limitservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limit-service")
public class LimitServiceConfiguration {
	
	private String maximum;
	
	private String minimum;

	public String getMaximum() {
		return maximum;
	}

	public void setMaximum(String maximum) {
		this.maximum = maximum;
	}

	public String getMinimum() {
		return minimum;
	}

	public void setMinimum(String minimum) {
		this.minimum = minimum;
	}

	public LimitServiceConfiguration(String maximum, String minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}
	
	public LimitServiceConfiguration() {
		// TODO Auto-generated constructor stub
	}
}
