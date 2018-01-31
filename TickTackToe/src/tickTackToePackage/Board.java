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
	//Andrew
	public boolean checkCondition() {
		//Check each row
		for(int i = 0; i < 3; i++) {
			if(gameBoard[i][0] == gameBoard[i][1] && gameBoard[i][0] == gameBoard[i][2] && gameBoard[i][0] != 0) {
				return true;
			}
		}
		//Check each column
		for(int j = 0; j < 3; j++) {
			if(gameBoard[0][j] == gameBoard[1][j] && gameBoard[0][j] == gameBoard[2][j] && gameBoard[0][j] != 0) {
				return true;
			}
		}
		//Check diagonals
		if(gameBoard[0][0] == gameBoard[1][1] && gameBoard[0][0] == gameBoard[2][2] && gameBoard[0][0] != 0) {
			return true;
		}
		if(gameBoard[0][2] == gameBoard[1][1] && gameBoard[0][2] == gameBoard[2][0] && gameBoard[1][1] != 0) {
			return true;
		}
		return false;
	}
	
	//Checks if there are empty spaces on the board left
	//Saket
	public boolean checkAvailability() {
		return false;
	}
	
	//Prints out the board in X's and O's
	//Maggie
	public void getBoard() {
		
	}
	
}
