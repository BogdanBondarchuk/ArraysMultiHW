package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] ticket = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose your winning ticket: ");
        int win = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < ticket.length; i++) {
            for (int j = 0; j < ticket[i].length; j++) {
                if (ticket[1][1] == win) {
                    System.out.printf("You win! Ticket %d is at row %d and column %d.%n",
                            win, 1, 1);
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("Sorry, your number is not on the ticket. Good luck in next try!");
        }
    }
}


