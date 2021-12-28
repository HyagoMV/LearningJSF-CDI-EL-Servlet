package com.github.hyagomv.controller;

import javax.inject.Inject;
import javax.inject.Named;

import com.github.hyagomv.model.Hello;

@Named("hello")
public class HelloController {

	@Inject
	private Hello hello;

	public Hello getHello() {
		return hello;
	}

	public void setHello(Hello hello) {
		this.hello = hello;
	}

}
