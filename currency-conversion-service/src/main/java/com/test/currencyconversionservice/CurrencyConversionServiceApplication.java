package com.test.currencyconversionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@SpringBootApplication
@EnableFeignClients(basePackages = { "com.test.currencyconversionservice" })
@EnableDiscoveryClient
public class CurrencyConversionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConversionServiceApplication.class, args);
	}

	@Bean
	public Sampler defauSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}
}
