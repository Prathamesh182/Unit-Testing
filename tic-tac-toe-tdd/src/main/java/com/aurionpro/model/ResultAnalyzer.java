package com.aurionpro.model;

public class ResultAnalyzer {
	private Board board;
	private ResultType result;

	public ResultAnalyzer() {
		this.board = new Board();
		this.result = ResultType.PROGRESS;
	}

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}

	public ResultType getResult() {
		return result;
	}

	public void setResult(ResultType result) {
		this.result = result;
	}

	private void horizontalWinCheck() {
		Cell[] cell = board.getCell();
		if (cell[0].getMark() == Marktype.X && cell[1].getMark() == Marktype.X && cell[2].getMark() == Marktype.X) {
			result = ResultType.WIN;
		}
		if (cell[3].getMark() == Marktype.X && cell[4].getMark() == Marktype.X && cell[5].getMark() == Marktype.X) {
			result = ResultType.WIN;

		}
		if (cell[6].getMark() == Marktype.X && cell[7].getMark() == Marktype.X && cell[8].getMark() == Marktype.X) {
			result = ResultType.WIN;

		}

		if (cell[0].getMark() == Marktype.O && cell[1].getMark() == Marktype.O && cell[2].getMark() == Marktype.O) {
			result = ResultType.WIN;

		}
		if (cell[3].getMark() == Marktype.O && cell[4].getMark() == Marktype.O && cell[5].getMark() == Marktype.O) {
			result = ResultType.WIN;

		}
		if (cell[6].getMark() == Marktype.O && cell[7].getMark() == Marktype.O && cell[8].getMark() == Marktype.O) {
			result = ResultType.WIN;

		}
	}

	private void verticalWinCheck() {
		Cell[] cell = board.getCell();
		if (cell[0].getMark() == Marktype.X && cell[3].getMark() == Marktype.X && cell[6].getMark() == Marktype.X) {
			result = ResultType.WIN;

		}
		if (cell[1].getMark() == Marktype.X && cell[4].getMark() == Marktype.X && cell[7].getMark() == Marktype.X) {
			result = ResultType.WIN;

		}

		if (cell[2].getMark() == Marktype.X && cell[5].getMark() == Marktype.X && cell[8].getMark() == Marktype.X) {
			result = ResultType.WIN;

		}
		if (cell[1].getMark() == Marktype.O && cell[4].getMark() == Marktype.O && cell[7].getMark() == Marktype.O) {
			result = ResultType.WIN;

		}
		if (cell[2].getMark() == Marktype.O && cell[5].getMark() == Marktype.O && cell[8].getMark() == Marktype.O) {
			result = ResultType.WIN;

		}
		if (cell[0].getMark() == Marktype.O && cell[3].getMark() == Marktype.O && cell[6].getMark() == Marktype.O) {
			result = ResultType.WIN;

		}
	}

	private void diagonalWinCheck() {
		Cell[] cell = board.getCell();
		if (cell[0].getMark() == Marktype.X && cell[4].getMark() == Marktype.X && cell[8].getMark() == Marktype.X) {
			result = ResultType.WIN;

		}
		if (cell[2].getMark() == Marktype.X && cell[4].getMark() == Marktype.X && cell[6].getMark() == Marktype.X) {
			result = ResultType.WIN;

		}

		if (cell[0].getMark() == Marktype.O && cell[4].getMark() == Marktype.O && cell[8].getMark() == Marktype.O) {
			result = ResultType.WIN;
		}
		if (cell[2].getMark() == Marktype.O && cell[4].getMark() == Marktype.O && cell[6].getMark() == Marktype.O) {
			result = ResultType.WIN;

		}

	}

	public ResultType analyzeResult() {
		horizontalWinCheck();
		verticalWinCheck();
		diagonalWinCheck();
		if (result != ResultType.WIN) {
			if (board.isBoardFull()) {
				result = ResultType.DRAW;

			}

		}

		return result;
	}

}
