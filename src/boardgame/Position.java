package boardgame;

public class Position {

	private int row;
	private int clumn;
	
	
	public Position(int row, int clumn) {
		this.row = row;
		this.clumn = clumn;
	}
	
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getClumn() {
		return clumn;
	}
	public void setClumn(int clumn) {
		this.clumn = clumn;
	}

	@Override
	public String toString() {
		return  row + ", " + clumn;
	}
		
	
}
