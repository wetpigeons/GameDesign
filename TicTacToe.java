
import java.util.Scanner;


public class TicTacToe {
    public static char[][] grid = {{'1','2','3'},{'4','5','6'},{'7','8','9'}};
    public static int turn = 0;
    public static boolean playing = true;
    public static void main(String[] args) {
        printBoard();
        while (playing) {
            for (int i = 1; i <= 9; i++) {
                turn++;
                if ((i % 2) != 0) {
                    turn('X');
                } else{
                    turn('O');
                }
                printBoard();
                checkWin();
                if(playing==false){
                    break;
                }
            }
        }
    }
    public static void printBoard(){
        System.out.println("(" + grid[0][0] + ")" + "(" + grid[0][1] + ")" + "(" + grid[0][2] + ")");
        System.out.println("(" + grid[1][0] + ")" + "(" + grid[1][1] + ")" + "(" + grid[1][2] + ")");
        System.out.println("(" + grid[2][0] + ")" + "(" + grid[2][1] + ")" + "(" + grid[2][2] + ")");
    }
    public static void turn(char player){
        System.out.println(player + "'s Turn! Where would you like to go?\nPlease choose any of the numbers above.");
        Scanner input = new Scanner(System.in);
        char response = input.next().charAt(0);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i][j] == response) {
                    grid[i][j] = player;
                    return;
                }
            }
        }
        System.out.println("Invalid! Please try again.");
        printBoard();
        turn(player);
    }
    public static void checkWin(){
        if     ((grid[0][0] == 'X' && grid[0][1] == 'X' && grid[0][2] == 'X') ||
                (grid[1][0] == 'X' && grid[1][1] == 'X' && grid[1][2] == 'X') ||
                (grid[2][0] == 'X' && grid[2][1] == 'X' && grid[2][2] == 'X') ||
                (grid[0][0] == 'X' && grid[1][0] == 'X' && grid[2][0] == 'X') ||
                (grid[0][1] == 'X' && grid[1][1] == 'X' && grid[2][1] == 'X') ||
                (grid[0][2] == 'X' && grid[1][2] == 'X' && grid[2][2] == 'X') ||
                (grid[0][0] == 'X' && grid[1][1] == 'X' && grid[2][2] == 'X') ||
                (grid[0][2] == 'X' && grid[1][1] == 'X' && grid[2][0] == 'X')) {
            playing = false;
            System.out.println("X has won!");
        } if   ((grid[0][0] == 'O' && grid[0][1] == 'O' && grid[0][2] == 'O') ||
                (grid[1][0] == 'O' && grid[1][1] == 'O' && grid[1][2] == 'O') ||
                (grid[2][0] == 'O' && grid[2][1] == 'O' && grid[2][2] == 'O') ||
                (grid[0][0] == 'O' && grid[1][0] == 'O' && grid[2][0] == 'O') ||
                (grid[0][1] == 'O' && grid[1][1] == 'O' && grid[2][1] == 'O') ||
                (grid[0][2] == 'O' && grid[1][2] == 'O' && grid[2][2] == 'O') ||
                (grid[0][0] == 'O' && grid[1][1] == 'O' && grid[2][2] == 'O') ||
                (grid[0][2] == 'O' && grid[1][1] == 'O' && grid[2][0] == 'O')) {
            playing = false;
            System.out.println("O has won.");
        } else if (turn==9){
            playing = false;
            System.out.println("It's a tie.");
        }
    }
}
