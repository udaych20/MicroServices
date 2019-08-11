package com.test.currencyconversionservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="currency-exchange-service", decode404 = true)
@RibbonClient("currency-exchange-service")
public interface CurrencyConversionProxy {
	@GetMapping("currency-exchange/from/{from}/to/{to}")
	public CurrencyConversionBean retriveExchangeValue(@PathVariable("from") String from, @PathVariable("to") String to);
}
