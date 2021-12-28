package com.github.hyagomv.constroller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.github.hyagomv.model.HelloBean;

@Named("hello")
@RequestScoped
public class HelloConstroller {

	@Inject
	HelloBean bean;

	public HelloConstroller() {
		System.out.println("Call?");
	}

	public HelloBean getBean() {
		return bean;
	}

	public void setBean(HelloBean bean) {
		this.bean = bean;
	}

}
