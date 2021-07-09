package chapter4;

import java.util.Scanner;

/*
* FOR LOOP
* LOOP BREAK
* search a string to determine if it contains the letter 'A'
*/
public class LetterSearch {

    public static void main(String[] args) {
        //get text
        System.out.println("Enter some text");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();

        boolean letterFound = false;

        //Search entered text for letter A
        for(int i = 0; i<text.length(); i++){
            char currentLetter = text.charAt(i);
            if(currentLetter == 'A' || currentLetter == 'a'){
                letterFound = true;
                break;
            }
        }
        if (letterFound){
            System.out.println("This text contains the letter A");
        }else {
            System.out.println("This text does not contain the letter 'A'");
        }



        /*for(int i = text.length(); i<0; i--){
            char currentLetter = text.charAt(i);
            if(currentLetter == 'A' || currentLetter == 'a'){
                letterFound = true;
                break;
            }
        }
        if (letterFound){
            System.out.println("This text contains the letter A");
        }else {
            System.out.println("This text does not contain the letter 'A'");
        }*/
    }
}

