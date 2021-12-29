package com.github.hyagomv.model;

import java.util.Map;

public class Hello {
	private Map<Integer, String> msgs = Map.of(0, "Hello World!", 1, "Bye World!");

	public Map<Integer, String> getMsgs() {
		
		return msgs;
	}

	public void setMsgs(Map<Integer, String> msgs) {
		this.msgs = msgs;
	}

}
