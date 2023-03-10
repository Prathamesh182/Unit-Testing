package com.aurionpro.model;

public class Player {
	private String name;
	private Marktype mark;
	
	public Player(String name) {
		super();
		this.name = name;
		this.mark=Marktype.EMPTY;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Marktype getMark() {
		return mark;
	}
	public void setMark(Marktype mark) {
		this.mark = mark;
	}
	
	
	
}
