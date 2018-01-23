package tickTackToePackage;

public class Board {
	private int[][] gameBoard;
	
	public Board() {
		gameBoard = new int[3][3];
	}
	
	public void setSpace(int id, int row, int col) {
		gameBoard[row][col] = id;
	}
}
