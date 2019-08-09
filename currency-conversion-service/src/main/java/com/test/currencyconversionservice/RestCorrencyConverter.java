package com.test.currencyconversionservice;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestCorrencyConverter {

	@Autowired
	private CurrencyConversionProxy proxy;

	@GetMapping("currency-convert/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean currencyConvert(@PathVariable String from, @PathVariable String to,
			@PathVariable BigDecimal quantity) {

		Map<String, String> uriVriable = new HashMap<>();
		uriVriable.put("from", from);
		uriVriable.put("to", to);
		ResponseEntity<CurrencyConversionBean> resEntity = new RestTemplate().getForEntity(
				"http://localhost:8000/currency-exchange/from/{from}/to/{to}", CurrencyConversionBean.class,
				uriVriable);
		CurrencyConversionBean bean = resEntity.getBody();
		return new CurrencyConversionBean(bean.getId(), bean.getFrom(), bean.getTo(), bean.getConversionMultiple(),
				bean.getQuantity(), quantity.multiply(bean.getConversionMultiple()), bean.getPort());
	}

	@GetMapping("currency-convert-feign/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean currencyConvertfeign(@PathVariable String from, @PathVariable String to,
			@PathVariable BigDecimal quantity) {

		CurrencyConversionBean bean = proxy.retriveExchangeValue(from, to);
		System.out.println("from --- "+ from);
		System.out.println("to --- "+ to);
		System.out.println("quantity --- "+ quantity);
		return new CurrencyConversionBean(bean.getId(), from, to, bean.getConversionMultiple(), quantity,
				quantity.multiply(bean.getConversionMultiple()), bean.getPort());
	}
}
