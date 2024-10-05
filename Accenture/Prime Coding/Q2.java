
Two players A and B are playing the game of Rock, Paper and scissors.
Player A
chooses a move represented by String M and the move can be one of the
following: Bock,
paper or scissors
where 1- Rock beats scissors
2- Scissor beats paper
3- Paper beats rock
Your task is to find and return a string value representing the winning move for B.

import java.util.Scanner;

public class Main {

    public static String findWinningMove(String moveA) {
        // Determine the winning move for Player B based on Player A's move
        switch (moveA.toLowerCase()) {
            case "rock":
                return "paper";  // Paper beats Rock
            case "paper":
                return "scissors";  // Scissors beats Paper
            case "scissors":
                return "rock";  // Rock beats Scissors
            default:
                return "Invalid move";  // In case of an invalid input
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Player A's move (rock, paper, or scissors): ");
        String moveA = sc.nextLine();

        String winningMoveB = findWinningMove(moveA);
        System.out.println("Player B should choose: " + winningMoveB);
    }
}

