package projects03;

import java.util.Scanner;

public class GuessingGame {
public static void main(String[] args) {
	guess();
}
static void guess() {
	Scanner in = new Scanner(System.in);
	int random = (int) (Math.random() * 101);
	System.out.println("Guess a magic number between 0 and 100!");
	int guess = in.nextInt();
	for (int i = 0; i != random; i = guess) {
		if (guess < random) {
			System.out.println("Too low! Try again ");
			guess = in.nextInt();
		} else if (guess > random) {
			System.out.println("Too high! Try again");
			guess = in.nextInt();
		}

	}
	System.out.println("Great you found the magic number: " + random);

}
}
