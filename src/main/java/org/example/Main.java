package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int guess;
        int randomNum = random.getRandomNum();

        System.out.println("Please enter a guess between 1 - 1.000.000: ");
        do{
            try{
                System.out.println(randomNum);
                guess = scanner.nextInt();
                if(guess == randomNum){
                    System.out.println("You found the random number!");
                    break;
                }else if(guess > randomNum && guess-10 <= randomNum){
                    System.out.println("Guess is very close but a tiny bit high, please try again: ");
                }
                else if(guess >= randomNum && guess-1000 < randomNum){
                    System.out.println("Guess is close but a little high, please try again: ");
                }else if(guess >= randomNum && guess -50000 < randomNum){
                    System.out.println("Guess is high, please try again: ");
                }else if(guess > randomNum){
                    System.out.println("Guess is Very high, please try again: ");
                }else if(guess +10 >= randomNum){
                    System.out.println("Guess is very close but a tiny bit low, please try again: ");
                }else if(guess +1000 >= randomNum){
                    System.out.println("Guess is close but a little low, please try again: ");
                }else if(guess +50000 >= randomNum){
                    System.out.println("Guess is low, please try again: ");
                }else{
                    System.out.println("Guess is Very low, please try again: ");
                }

            }catch (InputMismatchException e){
                System.out.println("Invalid input, only integers allowed!");
                break;
            }
        }while (true);



    }
}