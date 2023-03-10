package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ResultAnalyzerTest {

	Board board;
	ResultAnalyzer result;
	Cell[] cell;

	@BeforeEach
	void init() {
		result = new ResultAnalyzer();
		board = result.getBoard();
		cell = board.getCell();
	}

	@Test
	void testAnalyzeResult_CheckTestHorizontalWinRow1() throws CellAlreadyMarkerException {

		cell[0].setMark(Marktype.X);
		cell[1].setMark(Marktype.X);
		cell[2].setMark(Marktype.X);
		assertEquals(ResultType.WIN, result.analyzeResult());
	}
	
	@Test
	void testAnalyzeResult_CheckTestHorizontalWinRow2() throws CellAlreadyMarkerException {

		cell[3].setMark(Marktype.X);
		cell[4].setMark(Marktype.X);
		cell[5].setMark(Marktype.X);
		assertEquals(ResultType.WIN, result.analyzeResult());
	}
	
	@Test
	void testAnalyzeResult_CheckTestHorizontalWinRow3() throws CellAlreadyMarkerException {

		cell[6].setMark(Marktype.X);
		cell[7].setMark(Marktype.X);
		cell[8].setMark(Marktype.X);
		assertEquals(ResultType.WIN, result.analyzeResult());
	}
	
	@Test
	void testAnalyzeResult_CheckTestVerticalWin() throws CellAlreadyMarkerException {

		cell[0].setMark(Marktype.X);
		cell[3].setMark(Marktype.X);
		cell[6].setMark(Marktype.X);
		assertEquals(ResultType.WIN, result.analyzeResult());
	}
	
	@Test
	void testAnalyzeResult_CheckTestVerticalWin1() throws CellAlreadyMarkerException {

		cell[1].setMark(Marktype.X);
		cell[4].setMark(Marktype.X);
		cell[7].setMark(Marktype.X);
		assertEquals(ResultType.WIN, result.analyzeResult());
	}
	
	@Test
	void testAnalyzeResult_CheckTestVerticalWin2() throws CellAlreadyMarkerException {

		cell[2].setMark(Marktype.X);
		cell[5].setMark(Marktype.X);
		cell[8].setMark(Marktype.X);
		assertEquals(ResultType.WIN, result.analyzeResult());
	}
	
	@Test
	void testAnalyzeResult_CheckTestDiagonalWin1() throws CellAlreadyMarkerException {

		cell[0].setMark(Marktype.X);
		cell[4].setMark(Marktype.X);
		cell[8].setMark(Marktype.X);
		assertEquals(ResultType.WIN, result.analyzeResult());
	}
	
	@Test
	void testAnalyzeResult_CheckTestDiagonalWin2() throws CellAlreadyMarkerException {

		cell[2].setMark(Marktype.X);
		cell[4].setMark(Marktype.X);
		cell[6].setMark(Marktype.X);
		assertEquals(ResultType.WIN, result.analyzeResult());
	}
	
	@Test
	void testAnalyzeResult_CheckTestProgress() throws CellAlreadyMarkerException {

		cell[2].setMark(Marktype.X);
		cell[4].setMark(Marktype.O);
		cell[6].setMark(Marktype.X);
		cell[1].setMark(Marktype.X);
		cell[5].setMark(Marktype.X);
		cell[7].setMark(Marktype.O);
		assertEquals(ResultType.PROGRESS, result.analyzeResult());
	}
	
	@Test
	void testAnalyzeResult_CheckTestDraw() throws CellAlreadyMarkerException {

		cell[0].setMark(Marktype.X);
		cell[1].setMark(Marktype.X);
		cell[2].setMark(Marktype.O);
		cell[3].setMark(Marktype.O);
		cell[4].setMark(Marktype.O);
		cell[5].setMark(Marktype.X);
		cell[6].setMark(Marktype.X);
		cell[7].setMark(Marktype.O);
		cell[8].setMark(Marktype.X);
		assertEquals(ResultType.DRAW, result.analyzeResult());
	}
	

}
