package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BoardTest {
	Board board;
	Cell[] cell;

	@BeforeEach
	void init() {
		board = new Board();
		cell = board.getCell();
	}

	@Test
	void test_allCellsEmpty() {
		boolean flag = true;
		for (Cell x : cell) {
			if (x.getMark() != Marktype.EMPTY) {
				flag = false;
				break;
			}

		}
		assertTrue(flag);

	}

	@Test
	void testSetCellMark_markAtLocation() {
		board.setCellMark(4, Marktype.X);
		assertEquals(Marktype.X, cell[4].getMark());
	}
	
	@Test
	void testSetCellMark_InvalidLocation() {
		assertThrows(InvalidLocationException.class,()->board.setCellMark(10, Marktype.X));
	}
	
	@Test
	void testisBoardFull() {
		for(int i=0;i<9;i++) {
		board.setCellMark(i, Marktype.X);
		}
		assertEquals(true,board.isBoardFull());
	}
	
	@Test
	void testSetCellMark_CellAlreadyMarkerException() {
		board.setCellMark(1, Marktype.X);
		assertThrows(CellAlreadyMarkerException.class,()->board.setCellMark(1, Marktype.X));
		
	}
}
