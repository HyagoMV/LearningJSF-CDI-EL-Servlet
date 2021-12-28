package com.github.hyagomv.model;

import java.util.List;

public class Hello {
	private List<String> msgs = List.of("Hello World!", "Bye World!");

	public List<String> getMsgs() {
		return msgs;
	}

	public void setMsgs(List<String> msgs) {
		this.msgs = msgs;
	}

}
