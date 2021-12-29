package com.github.hyagomv.controller;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named("hello")
@ViewScoped
public class HelloBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private boolean show;

	public void foo() {
		show = !show;
		System.out.println(show);
	}

	public boolean isShow() {
		return show;
	}

	public void setShow(boolean show) {
		this.show = show;
	}

}
