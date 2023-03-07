package com.aurionpro.model;

public class Board {
	private Cell[] cell = new Cell[9];

	public Board() {
		for (int i = 0; i < cell.length; i++) {
			cell[i] = new Cell();
		}
	}

	public boolean isBoardFull() {

		for (Cell x : cell) {
			if (x.getMark() == Marktype.EMPTY) {
				return false;

			}
		}

		return true;
	}
	
	public void setCellMark(int location,Marktype mark) {
		if(location<0 || location>8) {
			throw new InvalidLocationException("Invalid Location");
			
		}
		cell[location].setMark(mark);
	}

	public Cell[] getCell() {
		return cell;
	}

	
}
