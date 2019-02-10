package com.annon.lifecyclestereotype;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:com/annon/lifecyclestereotype/lifecycle.properties")
public class Math {
	private int a;
	private int b;
	private int sum;

	public Math(@Value("${a}") int a) {
		this.a = a;
	}

	@Value("${b}")
	public void setB(int b) {
		this.b = b;
	}

	@PostConstruct
	public void init() {
		this.sum = a + b;
	}

	@PreDestroy
	public void release() {
		System.out.println("destroyed...");
	}

	@Override
	public String toString() {
		return "Math [a=" + a + ", b=" + b + ", sum=" + sum + "]";
	}

}
