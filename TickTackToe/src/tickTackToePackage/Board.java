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
	//Returns true if there is a winner
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
	//Yo
	//Checks if there are empty spaces on the board left
	//Returns true if there are spaces left
	//Saket
	public boolean checkAvailability() {
			for (int i=0; i <=3; i++) {
				for(int j =0; j <=3; j++) {
				if((gameBoard[i][j] !=  1) || (gameBoard [i][j] != 2)) {
					return true;
				}
				}
			}
		
		return false;
		}
	
	//Prints out the board in X's and O's
	//Maggie
	public void getBoard() {
		for(int row = 0; row<1; row++) {
			for(int col = 0; col < gameBoard[row].length;col++) {
				if(gameBoard[row][col]==1) {
					System.out.print("| X |");
				}else if(gameBoard[row][col]==2) {
					System.out.print("| O |");
				}else {
					System.out.print("|   |");
				}
			}
		}
		System.out.println();
		System.out.println("---------------");
		for(int row = 1; row<2; row++) {
			for(int col = 0; col < gameBoard[row].length;col++) {
				if(gameBoard[row][col]==1) {
					System.out.print("| X |");
				}else if(gameBoard[row][col]==2) {
					System.out.print("| O |");
				}else {
					System.out.print("|   |");
				}
			}
		}
		System.out.println();
		System.out.println("---------------");
		for(int row = 2; row<3; row++) {
			for(int col = 0; col < gameBoard[row].length;col++) {
				if(gameBoard[row][col]==1) {
					System.out.print("| X |");
				}else if(gameBoard[row][col]==2) {
					System.out.print("| O |");
				}else {
					System.out.print("|   |");
				}
			}
		}
	}
	
}
