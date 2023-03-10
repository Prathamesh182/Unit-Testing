package com.aurionpro.model;

public class Game {
	private Player currentPlayer;
	private Player[] players = new Player[2];
	private ResultAnalyzer analyzer;
	private Board board;
	private Marktype mark;
	
	public Game(Player[] players) {
		super();
		this.currentPlayer = players[0];
		this.players = players;
		this.analyzer = new ResultAnalyzer();
		this.board=analyzer.getBoard();
		
	}
	public Player getCurrentPlayer() {
		return currentPlayer;
	}
	public void setCurrentPlayer(Player currentPlayer) {
		this.currentPlayer = currentPlayer;
	}
	public Player[] getPlayers() {
		return players;
	}
	public void setPlayers(Player[] players) {
		this.players = players;
	}
	public ResultAnalyzer getAnalyzer() {
		return analyzer;
	}
	public void setAnalayzer(ResultAnalyzer analyzer) {
		this.analyzer = analyzer;
	}
	
	public void play(int loc) {
		board.setCellMark(loc, currentPlayer.getMark());
		ResultType result = analyzer.analyzeResult();
		try {
			if(result == ResultType.PROGRESS) {
				switchPlayer();
				
			}
			if(result == ResultType.WIN) {
				System.out.println(currentPlayer.getName()+" :Wins ");
				
			}
			if(result == ResultType.DRAW) {
				System.out.println("Draw: ");
				
			}
		} catch (CellAlreadyMarkerException e) {
			System.out.println(e.getMessage());
		}
		catch(InvalidLocationException e) {
			System.out.println(e.getMessage());
		}
	}
	
	private void switchPlayer() {
		if(currentPlayer == players[0]) {
			currentPlayer = players[1];
		}else {
			currentPlayer = players[0];
		}
		
	}
	
}
