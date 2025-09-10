package Loop;

import java.util.Random;
import java.util.Scanner;
public class W13_01_GuessNumber {
    public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    Random rand = new Random();

    int answer = rand.nextInt(3) + 1; // Random number between 1 and 10
    
    //System.out.println("Random number is geneated :" + answer);

    int countGuess = 0;
    boolean win = false;

    while(countGuess < 3){
        System.out.print("Plese Enter guess number(1-10):");
        int guess = kb.nextInt();
        
        if (answer == guess) {
            System.out.println("Correct! You' ve guessd the number .");
            System.out.println("===================!!WIN!!=======================");
            win = true;
            break;
        }else{
            System.out.println("Incorect guess. Try again.");
            System.out.println("===================!!LOSE!!======================");
        }
        countGuess++;
        }
        if(win ==  false)
            System.out.println("Game Over. the correct number was: " + answer);
        
            kb.close();
            
    }
}