package tickTackToePackage;
//Shivam and Andrew

import java.util.Scanner;

public class GameDriver {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String name;
		System.out.println("Welcome to Tic Tac Toe for Two Players!");

		System.out.println("Please input your name, Player 1: ");
		name = input.nextLine();
		Player player1 = new Player(name, 1);
		System.out.println("You will be X's");

		System.out.println("Please input your name, Player 2: ");
		name = input.nextLine();
		Player player2 = new Player(name, 2);
		System.out.println("You will be O's");

		System.out.println("The game will be played with each player filling in spots of");
		System.out.print(" the board by inputting coordinates\n. Top left is (0, 0), ");
		System.out.println("bottom right is (2, 2).");
		System.out.println("Input coordinates in the format 'x, y'");

		Board board = new Board();

		boolean cont = false;
		int moveCounter = 0;
		while (board.checkCondition()) {
			if (board.checkAvailability()) {
				System.out.println(player1.getName() + ", please input a coordinate.");
				String input1 = input.nextLine();
				int num1 = Integer.parseInt(input1.substring(0, 1));
				int num2 = Integer.parseInt(input1.substring(2, 3));
				cont = false;
				while (!cont) {
					if (board.getSpace(num1, num2) == 0) {
						board.setSpace(player1.getID(), num1, num2);
						cont = true;
					} else {
						System.out.println("That space is already filled.");
						System.out.println("Please choose a different one.");
					}
				}
				moveCounter++;
			}
			if (board.checkAvailability()) {
				System.out.println(player2.getName() + ", please input a coordinate.");
				String input2 = input.nextLine();
				int num1 = Integer.parseInt(input2.substring(0, 1));
				int num2 = Integer.parseInt(input2.substring(2, 3));
				cont = false;
				while (!cont) {
					if (board.getSpace(num1, num2) == 0) {
						board.setSpace(player2.getID(), num1, num2);
						cont = true;
					} else {
						System.out.println("That space is already filled.");
						System.out.println("Please choose a different one.");
					}
				}
				moveCounter++;
			}
			if (!board.checkAvailability()) {
				if (moveCounter % 2 == 0 && board.checkCondition()) {
					System.out.println("Congradulations, " + player2.getName() + ", you Won!");
				} else if (board.checkCondition()) {
					System.out.println("Congradulations, " + player1.getName() + ", you Won!");
				} else {
					System.out.println("It was a tie!");
				}
			}

		}

	}
}
