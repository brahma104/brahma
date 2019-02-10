package com.sdi.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:app-values.properties")
public class Chain {
	@Value("${chain.chainId}")
	private int chainId;
	@Value("${chain.chainType}")
	private String chainType;

	public int getChainId() {
		return chainId;
	}

	public String getChainType() {
		return chainType;
	}

}
