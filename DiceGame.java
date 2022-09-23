/*
*  This program is based on a dice roll game.
*
* @author  Rodas Nega
* @version 1.0
* @since   2022-09-22
*/

import java.util.Scanner;

/**
 * The function randomizes numbers 1-6 and sees if it matches with user input.
*/
final class DiceGame {

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private DicGame() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(String[] args) {

        final int max = 6;
        final int min = 1;
        final int dicesix = 6;
        final int diceone = 1;
        final int dice = (int) (Math.random() * max + min);
        int attempts = 1;

        while (true) {
            try {
                // input
                final Scanner userInput = new Scanner(System.in);
                System.out.print("Pick a number (1-6): ");
                final float player = userInput.nextFloat();
                // process & output
                if (player > dicesix || player < diceone) {
                    System.out.print("\nThat is an invalid number.");
                } else if (player == dice) {
                    System.out.print("\nYou guessed right!");
                    System.out.print("\nIt took you " + attempts + " tries.");
                    break;
                } else if (player > dice) {
                    System.out.println("\nYou guessed too high, try again.");
                } else if (player < dice) {
                    System.out.print("\nYou guessed too low, try again.");
                }
                attempts += 1;
            } catch (java.util.InputMismatchException ex) {
                System.out.print("\nThat is an invalid input.");
                System.out.println("\nDone.");
            }
        }
    }
}
