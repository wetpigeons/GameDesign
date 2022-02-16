import java.util.Scanner;

public class RockPaperScissors {
    //global variables
    public static int pC = 0;
    public static int cC = 0;

    public static void main(String[] args) {
        int playerWins = 0;
        int computerWins = 0;
        int playerScore = 0;
        int computerScore = 0;
        //while(wins<5)
        //playerChoice
        //computerChoice
        //checkWin
        //random
        System.out.println("Welcome to Rock, Paper, Scissors!\nIf you beat the computer 5 times, you score a point!\nIf the computer wins 5 times, it scores a point.\nThe first to 3 points wins the game.\n");

        while ((playerScore < 3) && (computerScore < 3)) {
            while ((playerWins < 5) && (computerWins < 5)) {
                pC = playerChoice();
                while (pC != 0) {
                    cC = computerChoice();
                    if ((pC == 1 && cC == 3) || (pC == 2 && cC == 1) || (pC == 3 && cC == 2)) {
                        playerWins += 1;
                        System.out.println("You won this round!\nPlayer: " + playerWins + " Computer: " + computerWins);
                    } else if ((pC == 1 && cC == 2) || (pC == 2 && cC == 3) || (pC == 3 && cC == 1)) {
                        computerWins += 1;
                        System.out.println("You lost this round.\nPlayer: " + playerWins + " Computer: " + computerWins);
                    } else {
                        System.out.println("It's a tie.\nPlayer: " + playerWins + " Computer: " + computerWins);
                    }
                    break;
                }
            }
            if (playerWins == 5) {
                playerScore += 1;
                System.out.println("You won a point! You now have " + playerScore + " point(s).");
                playerWins = 0;
                computerWins = 0;

            }
            if (computerWins == 5) {
                computerScore += 1;
                System.out.println("The computer won a point. It is now at " + computerScore + " point(s).");
                playerWins = 0;
                computerWins = 0;
            }
        }
        if (playerScore == 3) {
            System.out.println("You won the game!");
        }
        if (computerScore == 3) {
            System.out.println("The computer won the game.");
        }
    }

    public static int playerChoice() {
        System.out.println("Please choose rock, paper, or scissors. \n(r = rock, p = paper, s = scissors)");
        Scanner sc = new Scanner(System.in);
        char choice = 0;
        try {
            choice = sc.nextLine().charAt(0);
        } catch (Exception e) {
            System.out.println("Please input a character.");
            return 0;
        }
        if (choice == 'r') {
            System.out.println("You chose rock!");
            return 1;
        }
        if (choice == 'p') {
            System.out.println("You chose paper!");
            return 2;
        }
        if (choice == 's') {
            System.out.println("You chose scissors!");
            return 3;
        } else {
            System.out.println("Not a valid input! Please try again.");
            return 0;
        }
    }

    public static int computerChoice() {
        cC = random(1, 3);
        if (cC == 1) System.out.println("The computer chose rock!");
        if (cC == 2) System.out.println("The computer chose paper!");
        if (cC == 3) System.out.println("The computer chose scissors!");
        return cC;
    }

    public static int random(int min, int max) {
        int range = max - min + 1;
        return (int) (range * Math.random()) + min;
    }
}
