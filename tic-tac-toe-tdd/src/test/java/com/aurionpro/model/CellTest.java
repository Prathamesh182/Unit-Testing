package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CellTest {

	Cell cell;

	@BeforeEach
	void init() {
		cell = new Cell();

	}

	@Test
	void testGetMark_checkIsEmpty() {
		assertEquals(Marktype.EMPTY, cell.getMark());

	}

	@Test
	void testSetMark_setXOToCell() {
		cell.setMark(Marktype.X);
		assertEquals(Marktype.X,cell.getMark());
		
	
	}
	@Test
	void testSetMark_CellAlreadyMarkerException() {
		cell.setMark(Marktype.X);
		assertThrows(CellAlreadyMarkerException.class,()->cell.setMark(Marktype.X));
	}
	
	

}
