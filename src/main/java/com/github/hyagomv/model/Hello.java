package com.github.hyagomv.model;

import java.util.Set;

public class Hello {
	private Set<String> msgs = Set.of("Hello World!", "Bye World!");

	public Set<String> getMsgs() {
		return msgs;
	}

	public void setMsgs(Set<String> msgs) {
		this.msgs = msgs;
	}

}
