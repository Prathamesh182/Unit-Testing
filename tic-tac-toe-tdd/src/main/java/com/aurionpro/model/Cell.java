package com.aurionpro.model;

public class Cell {
	private Marktype mark;
	
	public Cell() {
		this.mark=Marktype.EMPTY;
		
	}

	public Marktype getMark() {
		return mark;
	}

	public void setMark(Marktype mark)throws CellAlreadyMarkerException {
		if(!isEmpty()) {
			throw new CellAlreadyMarkerException("Cell is alread full");
		}
		this.mark = mark;
	}
	
	public boolean isEmpty() {
		if(mark==Marktype.EMPTY) {
			return true;
		}
		return false;
	}
	
	

}
