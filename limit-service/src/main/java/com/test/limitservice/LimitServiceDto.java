package com.test.limitservice;

public class LimitServiceDto {
	
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

	public LimitServiceDto(String maximum, String minimum) {
		this.maximum = maximum;
		this.minimum = minimum;
	}

	

	

}
