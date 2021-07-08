package chapter2;

import java.util.Scanner;

public class SeasonSentenceAssignment {
    public static void main(String[] args) {
        System.out.println("Please enter season of the year: ");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        System.out.println("Please enter how many cups of coffee drank in that season: ");
        int wholeNumber = scanner.nextInt();

        System.out.println("what is the adjective used to describe the season? : ");
        String adjective = scanner.next();

        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + wholeNumber + " cups of coffee.");

    }

}
