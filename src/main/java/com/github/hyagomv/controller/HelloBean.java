package com.github.hyagomv.controller;

import javax.faces.event.ActionEvent;
import javax.inject.Named;

@Named("hello")
public class HelloBean {

	public void foo(ActionEvent event) {
		System.out.println(event.getSource());
	}

}
