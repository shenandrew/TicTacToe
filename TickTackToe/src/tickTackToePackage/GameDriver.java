package tickTackToePackage;
//Shivam and Andrew
public class GameDriver {

	public static void main(String[] args) {
		
		Player player1 = new Player("Bob", 1);
		Player player2 = new Player("Jack", 2);
		Board board = new Board();
				while(board.checkCondition())
				{
					if(board.checkAvailability())
					{
						player1.setMarker();
						player1.checkwinner();
					}
					if(!board.checkAvailability())
					{
						player2.setMarker();
						player2.checkwinner();
					}
					
				}

			}

		}

}

}
