package codtech;
import java.util.Scanner;
public class Task1 {
	private static final int SIZE = 3;
    private static final char EMPTY = '-';
    private static char[][] board = new char[SIZE][SIZE];
    private static char currentPlayer = 'X';


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        initializeBoard();
		        displayBoard();

		        Scanner scanner = new Scanner(System.in);
		        boolean gameEnded = false;

		        while (!gameEnded) {
		            System.out.println("Player " + currentPlayer + "'s turn. Enter row and column (0-2): ");
		            int row = scanner.nextInt();
		            int col = scanner.nextInt();

		            if (isValidMove(row, col)) {
		                board[row][col] = currentPlayer;
		                displayBoard();

		                if (isWinningMove(row, col)) {
		                    System.out.println("Player " + currentPlayer + " wins!");
		                    gameEnded = true;
		                } else if (isBoardFull()) {
		                    System.out.println("It's a draw!");
		                    gameEnded = true;
		                } else {
		                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
		                }
		            } else {
		                System.out.println("Invalid move. Please try again.");
		            }
		        }

		        scanner.close();
		    }

		    private static void initializeBoard() {
		        for (int i = 0; i < SIZE; i++) {
		            for (int j = 0; j < SIZE; j++) {
		                board[i][j] = EMPTY;
		            }
		        }
		    }

		    private static void displayBoard() {
		        for (int i = 0; i < SIZE; i++) {
		            for (int j = 0; j < SIZE; j++) {
		                System.out.print(board[i][j] + " ");
		            }
		            System.out.println();
		        }
		    }

		    private static boolean isValidMove(int row, int col) {
		        return row >= 0 && row < SIZE && col >= 0 && col < SIZE && board[row][col] == EMPTY;
		    }

		    private static boolean isWinningMove(int row, int col) {
		        // Check row
		        if (board[row][0] == board[row][1] && board[row][1] == board[row][2]) {
		            return true;
		        }
		        // Check column
		        if (board[0][col] == board[1][col] && board[1][col] == board[2][col]) {
		            return true;
		        }
		        // Check diagonals
		        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[1][1] != EMPTY) {
		            return true;
		        }
		        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[1][1] != EMPTY) {
		            return true;
		        }
		        return false;
		    }

		    private static boolean isBoardFull() {
		        for (int i = 0; i < SIZE; i++) {
		            for (int j = 0; j < SIZE; j++) {
		                if (board[i][j] == EMPTY) {
		                    return false;
		                }
		            }
		        }
		        return true;
		    }
		
}
	


