package com.github.hyagomv.controller;

import javax.inject.Named;

@Named("hello")
public class HelloBean {

	public void fazAlgo() {
		System.out.println("Step 1");
		System.out.println("Step 2");
	}

}
