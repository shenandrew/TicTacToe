package tickTackToePackage;

public class Board {
	private int[][] gameBoard;
	
	public Board() {
		gameBoard = new int[3][3];
	}
	
	public void setSpace(int id, int row, int col) {
		gameBoard[row][col] = id;
	}
	
	
	//Returns the value of the specific space
	//Srujan
	public int getSpace(int row, int col) {
		return 0;
	}
	
	
	//Checks if there is a winning condition on the board (3 in a row)
	//Saket
	public boolean checkCondition() {
		return false;
	}
	
	//Checks if there are empty spaces on the board left
	//Andrew
	public boolean checkAvailability() {
		return false;
	}
	
	//Prints out the board in X's and O's
	//Maggie
	public void getBoard() {
		
	}
	
}
