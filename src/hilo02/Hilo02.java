package hilo02;

import java.util.Scanner;

public class Hilo02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int randomized = (int)(Math.random()*100 +1);
		 //System.out.println(randomized);
		int guess = 0;
		while (guess != randomized){
			System.out.println("Guess a number between 1 and 100 : ");
			guess = scan.nextInt();
		//	System.out.println("You entered "+ guess + ".");
			if(guess< randomized)
				System.out.println( guess + " is too low. Try again.");
			else if (guess > randomized)
				System.out.println(guess + " is too high. Try again. ");
			else
				System.out.println(guess + " is correct. You win! ");
		}

	}

}
