package com.guthub.hyagomv;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class Example {

	private String fruta = "EMPTY";

	public void foo() {
		fruta = "Maça";
	}

	public String getFruta() {
		return fruta;
	}

}
