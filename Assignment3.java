import java.util.Scanner;

/*

Name: Kseniia Ryuma

Course: CS111B

CRN: 52499-001

Assignment: Assignment#3

Date: June 21th

*/


public class Assignment3 
{
	public static void main(String args[])
	{
		do
		{
			playOneGame();
			
		}while (shouldPlayAgain());
	}
	
	/**
	   playOneGame implement a complete guessing game on the range of 1 to 100.
	*/
	public static void playOneGame()
	{
        	int midPoint;
        	final int INITIAL_LOW = 1;             // Constant for given low value.
        	final int INITIAL_HIGH = 100;          // Constant for given high value.
        	char userAnswer;                       // To keep user's response 
        	int low = INITIAL_LOW;
        	int high = INITIAL_HIGH;
		
        	System.out.println("Guess a number between " + low + " and " + high + "\n");
		
        	midPoint = getMidpoint(low, high);
        	userAnswer = getUserResponse(midPoint);
        
        	// To find the right number by changing the range.
		while (userAnswer != 'c')
		{		
			if (userAnswer == 'h')
			{
				low = getMidpoint(low, high);
			}
			else if (userAnswer == 'l')
			{
				high = getMidpoint(low, high);
			}
		
			midPoint = getMidpoint(low, high);
			
			userAnswer = getUserResponse(midPoint);
			
			}
		
		}
	
	/**
	   shouldPlayAgain prompt the user to determine if the user wants to play again.
	   @return return true if the character is a ‘y’, and otherwise return false.
	*/
	public static boolean shouldPlayAgain()
	{
		char goAgain;
		boolean playAnotherGame;
		System.out.print("Great! Do you want to play again? (y/n): ");
		Scanner keyboard = new Scanner(System.in);       
		goAgain = keyboard.next().charAt(0);
		
		// Check either user want to continue the game.
		if (goAgain == 'y')
		{
			playAnotherGame = true;
		}
		else
		{
			playAnotherGame = false;
		}
		
		return playAnotherGame;
	}
	
	/**
	   getUserResponseToGuess prompt the user with the phrase “is it <guess>? (h/l/c): “  
	   with the value replacing the token <guess>. 
	   @param guess the probable guessed number
	   @return one of three possible values: ‘h’, ‘l’, or ‘c’. 
	*/
	public static char getUserResponse(int guess)
	{   
		System.out.print("Is it " + guess + "? (h/l/c): ");
		Scanner keyboard = new Scanner(System.in);
		char input = keyboard.next().charAt(0);
		System.out.println();
		return input;
	}
	
	/**
	   getMidpoint calculate the middle point of chosen numbers.
           @param low is an integer.
           @param high is an integer.
           @return the midpoint of the two integers.
        */
	public static int getMidpoint(int low, int high)
	{ 
		int guessNum;
		guessNum = low + (high - low) / 2; 
		return guessNum;
	}
}

