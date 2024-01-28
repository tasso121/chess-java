package boardgame;

public class Board {
	
	private int rows;
	private int clumns;
	private Piece[][]pieces;
	
	public Board(int rows, int clumns) {
		this.rows = rows;
		this.clumns = clumns;
		pieces = new Piece[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getClumns() {
		return clumns;
	}

	public void setClumns(int clumns) {
		this.clumns = clumns;
	}
	
	
	
}
