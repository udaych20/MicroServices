package com.test.currencyconversionservice;

import java.math.BigDecimal;

public class CurrencyConversionBean {
	
	private Long id;
	
	private String from;
	
	private String to;
	
	private BigDecimal  conversionMultiple;
	
	private BigDecimal quantity;
	
	private BigDecimal calculatedTotalAmount;
	
	private int port;
	
	public CurrencyConversionBean() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getCalculatedTotalAmount() {
		return calculatedTotalAmount;
	}

	public void setCalculatedTotalAmount(BigDecimal calculatedTotalAmount) {
		this.calculatedTotalAmount = calculatedTotalAmount;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public CurrencyConversionBean(Long id, String from, String to, BigDecimal conversionMultiple, BigDecimal quantity,
			BigDecimal calculatedTotalAmount, int port) {
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
		this.quantity = quantity;
		this.calculatedTotalAmount = calculatedTotalAmount;
		this.port = port;
	}

	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	
	
	

}
