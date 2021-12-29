package com.github.hyagomv.controller;

import java.io.Serializable;

import javax.el.LambdaExpression;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named("hello")
public class HelloBean {

	private boolean show;

	public void foo(LambdaExpression lambda, int x) {
		System.out.println(
				lambda.invoke(FacesContext.getCurrentInstance().getELContext(), x)
				);
	}

}
