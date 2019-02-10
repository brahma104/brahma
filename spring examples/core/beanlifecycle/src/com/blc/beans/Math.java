package com.blc.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Math implements InitializingBean, DisposableBean {
	private int a;
	private int b;
	private int sum;

	public Math(int a) {
		this.a = a;
	}

	/*public void init() {
		this.sum = this.a + this.b;
	}*/

	public void setB(int b) {
		this.b = b;
	}

	/*public void release() {
		System.out.println("releasing...");
	}*/
	
	

	@Override
	public String toString() {
		return "Math [a=" + a + ", b=" + b + ", sum=" + sum + "]";
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroying...");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		this.sum = this.a + this.b;
	}

}









