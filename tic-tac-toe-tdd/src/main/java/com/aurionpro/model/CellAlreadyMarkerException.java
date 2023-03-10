package com.aurionpro.model;

public class CellAlreadyMarkerException extends RuntimeException {
	public  CellAlreadyMarkerException(String msg) {
		this.getMessage();
	}
	
	@Override
	public String getMessage() {
		return this.getClass().getName() + " " ;
	}
	
	@Override
	public String toString() {
		return "Cell is already full: ";
	}

}
