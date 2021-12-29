package com.github.hyagomv.controller;

import java.io.IOException;

import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named("hello")
public class HelloBean {

	public String goToIndex1() {
		return "index1";
	}
	
	public String goToIndex2() {
		return "index2?faces-redirect=true";
	}
	
	public void goToIndex3() {
		try {
			FacesContext.getCurrentInstance().getExternalContext().redirect("index3.xhtml");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
