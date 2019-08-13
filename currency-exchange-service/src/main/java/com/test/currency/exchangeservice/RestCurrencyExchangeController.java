package com.test.currency.exchangeservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestCurrencyExchangeController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private ExchangeValueRepository repository;

	@Autowired
	private Environment environment;

	@GetMapping("currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retriveExchangeValue(@PathVariable String from, @PathVariable String to) {
		ExchangeValue exchangeValue = repository.findByFromAndTo(from, to);
		exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		System.out.println("Json ---- " + exchangeValue);
		logger.info("ExchangeValue -> {}", exchangeValue);
		return exchangeValue;

	}
}
