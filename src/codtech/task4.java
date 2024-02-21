package codtech;

public class task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubTask4.java
	Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int maxAttempts = 5;
        int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int attempts = 0;
        int guess;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have chosen a number between 1 and 100. Try to guess it within " + maxAttempts + " attempts.");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess == randomNumber) {
                System.out.println("Congratulations! You've guessed the number (" + randomNumber + ") in " + attempts + " attempts.");
                break;
            } else if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        if (attempts == maxAttempts) {
            System.out.println("Sorry, you've reached the maximum number of attempts. The number was " + randomNumber + ".");
        }

        scanner.close();
    }
	}


	}

}
