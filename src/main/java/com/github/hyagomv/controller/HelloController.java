package com.github.hyagomv.controller;

import javax.inject.Inject;
import javax.inject.Named;

import com.github.hyagomv.model.Hello;

@Named("hello")
public class HelloController {

	@Inject
	private Hello msg;

	public Hello getMsg() {
		return msg;
	}

	public void setMsg(Hello msg) {
		this.msg = msg;
	}

	
}
