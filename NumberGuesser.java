/*

Name: Kseniia Ryuma

Course: CS111B

CRN: 52499-001

Assignment: Assignment#6

Date: July 2nd

*/

/**
 * The NumberGuesser class evaluates the guessed number.
 */

public class NumberGuesser 
{
	private int initialMin;   // To hold initial lower bound.
	private int initialMax;   // To hold initial upper bound.
	private int max;          // The value for the upper bound.
	private int min;          // The value for the lower bound.
	
	/**
	 * Constructor
	 * @param lowerBound The min. value for guess.
	 * @param upperBouund The max. value for guess.
	 */
	
	public NumberGuesser(int lowerBound, int upperBound)
	{
		min = lowerBound;
		max = upperBound;
	}
	
	/**
	 * Adjust the lower boundary in case the guessed number is higher.
	 */
	
	public void higher()
	{
		min = getCurrentGuess();
	}
	
	/**
	 * Adjust the upper boundary in case the guessed number is lower.
	 */
	
	public void lower()
	{ 
		max = getCurrentGuess();
	}
	
	/**
	 * Return the value that is in the middle of the new range of possible values. 
	 * @return the mid point.
	 */
	
	public int getCurrentGuess()
	{
		int guessNum = (max + min)/2;;
		return guessNum;
	}
	
	/**
	 * Return a NumberGuesser to the state that it 
	 * was in when it was constructed.
	 */
	public void reset()
	{
		min = initialMin;
		max = initialMax;
	}
	
}

