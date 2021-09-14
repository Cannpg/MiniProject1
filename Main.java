/*
Parker Cann
x
x
Mini Project 1
September xx, 2021 */

import java.util.Scanner;  // Import the Scanner class
import java.util.Random; // Import the Random class

class Main {

  public static void main(String[] args) {
    System.out.println("Welcome to the guessing game!");

//create scanner
    Scanner myScan = new Scanner(System.in);
//Create range variables
    System.out.println("Please enter any positive whole number:");
    int maxRng = myScan.nextInt() - 1;
    int minRng = 0;
    System.out.println("A random number to guess has been generated.");

    System.out.println("Please guess a number between " + minRng + " and " + maxRng + ".");

    //create random variable
    Random rand = new Random();
    //define random number
    int value = rand.nextInt(maxRng - minRng) + minRng;
    //System.out.println(value);
    //define guess variable
    int guess = 0;

    playGame(value, guess);

    myScan.close();

  }


  public static void playGame(int value, int guess) {
    //loop counter
    int loopCounter = 0;
    //create new scanner
    Scanner myScan = new Scanner(System.in);

    //set up
    while (guess != value){
      System.out.println("Enter a guess: ");
      guess = myScan.nextInt();
      loopCounter++;
      //System.out.println(loopCounter);
      if(guess >  value){
        System.out.println("Your guess is higher.");
      }
      else if(guess < value){
        System.out.println("Your guess is lower.");
      }
      else{
        System.out.println("Great, you win! It took you " + loopCounter + " tries.");
      }
    }
  }
}

