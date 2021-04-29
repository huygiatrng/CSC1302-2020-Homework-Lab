//Name: Gia Huy Truong
//Date: 2/17/2021
//Homework3 - Task 1: Making TicTacToe 3x3 board
//Task 1 files: TicTac.java

import java.util.*;

public class TicTac {
	
	//method to show the table
	public static void toShow(char[][] table) {
		System.out.println("-------------");
		for(int i = 0; i<table.length; i++) {
			for(int j = 0; j < table[0].length;j++) {
				
				if(table[i][j] == '\0') {								//Checking if a position is empty, set it '-' 
					table[i][j] = '-';
				}
				System.out.print("| "+table[i][j]+" ");
			}
			System.out.println("|\n-------------");
		}
	}
	
	//method to check if it is a winner
	public static boolean checkWinner(char[][] table, int num1, int num2) {
		char playerMark = table[num1][num2];						// based on latest position where latest player entered, then check it in cases
        return (table[0][0] == playerMark && table[0][1] == playerMark && table[0][2] == playerMark || // 1st row
                table[1][0] == playerMark && table[1][1] == playerMark && table[1][2] == playerMark || // 2nd row
                table[2][0] == playerMark && table[2][1] == playerMark && table[2][2] == playerMark || // 3rd row
                table[0][0] == playerMark && table[1][0] == playerMark && table[2][0] == playerMark || // 1st column
                table[0][1] == playerMark && table[1][1] == playerMark && table[2][1] == playerMark || // 2nd column
                table[0][2] == playerMark && table[1][2] == playerMark && table[2][2] == playerMark || // 3rd column
                table[0][0] == playerMark && table[1][1] == playerMark && table[2][2] == playerMark || // diagonal     
                table[2][0] == playerMark && table[1][1] == playerMark && table[0][2] == playerMark);  // diagonal );
	}
	
	//method to check if entered position is available or not
	public static boolean checkAvailability(int num1, int num2, char[][] table, int player) {
		if (0<num1 && num1>=(table.length) || (0<num2 && num2>=(table.length))){
			return false;
		}else {
			if(table[num1][num2]== '-') {
				if(player%2==1) {
					table[num1][num2] = 'X';
				}else {
					table[num1][num2] = 'O';
				}
				return true;
			}else {
				return false;
			}
		}
	}
	
	//MAIN
	public static void main(String[] args) {
		char[][] table = new char[3][3];																//create 2D array for information x and y of table
		try (Scanner input = new Scanner(System.in)) {
			System.out.println(table[0][0]);
			boolean haveWinner = false;																		// variable to check if it is a winner
			System.out.println("Welcome to play TicTacToe game! We have the following 3x3 empty table.");
			int num1;
			int num2;
			int player = 1;										 											// variable to check what player is playing, X or O				
			boolean valid = false;
			toShow(table);
			while(haveWinner == false) {
				 do{																						//Ask player to enter position 
					System.out.print("Enter the row index:   ");
					num1 = input.nextInt();
					System.out.print("Enter the column index:   ");
					num2 = input.nextInt();
					if(checkAvailability(num1,num2,table, player)==false) {									// checking whether that position is available or not, if not, ask player to enter position again
						valid = false;
						System.out.println("The position you entered is no longer available or is unavailable. Please enter again!");
					}else {
						valid = true;
					}
				} while(valid == false);
				
				//show table every time 1 position has been confirmed.
				toShow(table);																				
				if(checkWinner(table,num1, num2)==true) {
					haveWinner = true;
					System.out.println("We have a winner! Congrats!");
				}else {
					player++;
				}
			}
		}
	}

}
