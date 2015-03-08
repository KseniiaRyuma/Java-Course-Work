/*
This program  records high-score data for a fictitious game.  
 
Name: Kseniia Ryuma

Course: CS111B

CRN: 52499-001

Assignment: Assignment#8

Date: July 6th

*/

/**
 * The HighScores class implements the high scores.
 */

public class HighScores
{
	// Private variables of HighScores
	private String name;
	private int score;

	/*
	 * C-tor of HighScores
	 * @param n - Input name of the HighScores object
	 * @param s - Input score of the Highscores object
	 */
	public HighScores(String n, int s)
	{
		// Assign the values
		name = n;
		score = s;
	}

	/*
	 * Set the names to HighScores object.
	 * @param n - the name to be assigned.
	 */
	public void setName(String n)
	{
		name = n;
	}

	/*
	 * Get the name of the object.
	 * @return The name stores in the object.
	 */
	public String getName()
	{
		return name;
	}

	/*
	 * Set the score to HighScores object.
	 * @param s - the score to be assigned.
	 */
	public void setScore(int s)
	{
		score = s;
	}

	/*
	 * Get the score of the object.
	 * @return - The score stored in the object.
	 */
	public int getScore()
	{
		return score;
	}
}


