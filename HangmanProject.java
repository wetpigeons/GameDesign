import java.util.Scanner;
public class HangmanProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What word does do you want the player to guess?");
        String word = sc.nextLine();
        System.out.println("\f");
        //pick word

        boolean playing = true;
        int numberOfLetters = word.length();
        int numberOfGuesses = 0;
        int lettersCorrect = 0;
        boolean plop = false;
        boolean[] guess = new boolean[numberOfLetters];
        for (int i = 0; i < numberOfLetters; i++) {
            guess[i] = false;
        }
        //create array for whether letter at that place is correct

        while (playing) {
            System.out.println("Guesses remaining: " + (6 - numberOfGuesses));
            for (int i = 0; i < numberOfLetters; i++) {
                if (guess[i]) {
                    System.out.print(word.charAt(i));
                } else {
                    System.out.print("-");
                }
            }
            //print letters and dashes

            System.out.println("\nPlease enter a guess: ");
            char letter = sc.nextLine().charAt(0);
            //guess
                plop = false;
                for (int i = 0; i < numberOfLetters; i++) {
                    if (letter == word.charAt(i)) {
                        if (!guess[i]) {
                            guess[i] = true;
                            lettersCorrect++;
                            plop = true;
                        } else {
                            plop = true;
                            System.out.println("You already guessed that letter!");
                            break;
                        }
                    }
                }
                if (!plop) {
                    numberOfGuesses++;
                }
                //test guess
                if (lettersCorrect == numberOfLetters) {
                    System.out.println(word);
                    System.out.println("You win!");
                    playing = false;
                } else if (numberOfGuesses == 6) {
                    System.out.println("You lost. The word was: " + word);
                    playing = false;
                }
            }
        }
    }
