import java.util.Scanner;
import java.util.ArrayList;

/*
This program  records high-score data for a fictitious game.  
 
Name: Kseniia Ryuma

Course: CS111B

CRN: 52499-001

Assignment: Assignment#5

Date: June 28th

*/


public class Assignment5 
{
	public static void main(String[] arg)
	{
		// Create an ArrayList to hold some names and scores.
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<Integer> sores = new ArrayList<Integer>();
		
		initializeArrays(names, sores);
	}
	
	/**
	  *The initializeArrays method initializes array.
	  *@param names - the names stored in the ArrayList.
	  *@param scores - the scores stored in the ArrayList.
	 */
	public static void initializeArrays(ArrayList<String> names, ArrayList<Integer> scores)
	{
		// Get names and sores from user.
		Scanner keyboard = new Scanner(System.in);
		
		for (int i = 1; i < 6; i++)
		{	
		    System.out.print("Enter the name for score #" + i + ":");
	            names.add(keyboard.next());
	            System.out.println();
	            System.out.print("Enter the sore for score #"+ i + ":");
	            scores.add(keyboard.nextInt());
	            System.out.println();
	    	}	
		
		    sort(names, scores);
	}
	
	/**
	 * The sort method sorts both array lists, based on the values in the scores array list.
	 * @param  names - the names stored in the ArrayList.
	  *@param scores - the scores stored in the ArrayList.
	 */
	public static void sort(ArrayList<String> names, ArrayList<Integer> scores)
	{
		int temp, temp1;     
		String str, str1;
        	boolean sorted = false;
        	while (!sorted)
        	{
        		sorted = true;
        		
        		for(int a = 0; a < scores.size()-1; a++)
        		{
        			int b = a + 1;
        
        			if (scores.get(b) > scores.get(a))
        			{
        				temp = scores.get(a);
            				temp1 = scores.get(b);
            				scores.set(b, temp);
        				scores.set( a, temp1);
        			     				
        				str = names.get(a);
            				str1 = names.get(b);
            				names.set(b, str);
        				names.set( a, str1);
        				
        				sorted = false;	
        			}
        		}		
        	}  
        	display(names, scores);  
	}
	
	/**
	 * The method display displays the contents of the two array lists.
	 * @param  names - the names stored in the ArrayList.
	  *@param scores - the scores stored in the ArrayList.
	 */
	public static void display(ArrayList<String> names, ArrayList<Integer> scores)
	{
		for (int i = 0; i < scores.size(); i++)
		{
			System.out.println(names.get(i) + ":" + scores.get(i));
		}
		
	}
}

