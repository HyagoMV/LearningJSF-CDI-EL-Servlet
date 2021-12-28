package com.github.hyagomv.controller;

import javax.inject.Named;


@Named("hello")
public class HelloController {

	private Letra letra = Letra.A;

	public Letra getLetra() {
		return letra;
	}

	public void setLetra(Letra letra) {
		this.letra = letra;
	}

}

enum Letra {
	A
}
