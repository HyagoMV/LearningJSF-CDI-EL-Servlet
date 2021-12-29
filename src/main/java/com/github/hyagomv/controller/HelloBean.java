package com.github.hyagomv.controller;

import javax.inject.Named;

@Named("hello")
public class HelloBean {

	private String[] strings = { "A", "B" };

	public String[] getStrings() {
		return strings;
	}

	public void setStrings(String[] strings) {
		this.strings = strings;
	}

}
