/*
This program  records high-score data for a fictitious game.  
 
Name: Kseniia Ryuma

Course: CS111B

CRN: 52499-001

Assignment: Assignment#8

Date: July 6th

*/

/**
 * The HighScoresProgram initializes and displays the high scores.
 */


import java.util.Scanner;

public class HighScoresProgram
{
	public static void main(String[] arg)
	{
		// Allocate array of 5 scores
        HighScores scores[] = new HighScores[5];
        
        // Initialize the array
		initialize(scores);
		
		// Sort the array
		sort(scores);
		
		// Display scores
		display(scores);
	}
	
	/**
	  *The initialize method initializes array of HighScores
	  *@param scores - the array of references to HighScores.
	 */
	public static void initialize(HighScores scores[])
	{
		// Get names and sores from user.
		Scanner keyboard = new Scanner(System.in);
		String name;
		int score;
		
		for (int i = 0; i < scores.length; i++)
		{	
			// Get the input
			System.out.print("Enter the name for score #" + (i+1) + ":");
            name = (keyboard.next());
            System.out.println();
            System.out.print("Enter the sore for score #"+ (i+1) + ":");
            score = (keyboard.nextInt());
            System.out.println();
            
            // Create a HighScores object
            scores[i] = new HighScores(name, score);
	    }
	}
	
	/**
	 * The sort method sorts the input array by score value.
	  *@param scores - Array of HighScores objects to be sorted.
	 */
	public static void sort(HighScores scores[])
	{
			HighScores temp, temp1;
        	boolean sorted = false;
        	
        	// Run the sort loop
        	while (!sorted)
        	{
        		sorted = true;
        		
        		// Go over the whole array
        		for(int a = 0; a < scores.length - 1; a++)
        		{
        			int b = a + 1;
        
        			// Compare the scores
        			if (scores[b].getScore() > scores[a].getScore())
        			{
        				// Swap the objects
        				temp = scores[a];
            			temp1 = scores[b];
            			scores[a] = temp1;
        				scores[b] = temp;
        			    
        				sorted = false;	
        			}
        		}		
        	}
	}
	
	/**
	 * The method display displays the contents of the array.
	  *@param scores - array of HighScores to be displayed.
	 */
	public static void display(HighScores scores[])
	{
		// Iterate over the array
		for (int i = 0; i < scores.length; i++)
		{
			System.out.println(scores[i].getName() + ":" + scores[i].getScore());
		}
		
	}
}

