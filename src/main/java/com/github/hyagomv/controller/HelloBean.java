package com.github.hyagomv.controller;

import javax.inject.Inject;
import javax.inject.Named;

import com.github.hyagomv.model.Hello;

@Named("hello")
public class HelloBean {

	@Inject
	private
	Hello msg;
	
	public void fazAlgo(int step) {
		System.out.println("Step " + step);
		System.out.println("Step " + ++step);
	}
	
	public void fazAlgo(String step) {
		System.out.println("Step " + step);
	}

	public Hello getMsg() {
		return msg;
	}

	public void setMsg(Hello msg) {
		this.msg = msg;
	}

}
