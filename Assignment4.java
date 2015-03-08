import java.util.Scanner;

/*

Name: Kseniia Ryuma

Course: CS111B

CRN: 52499-001

Assignment: Assignment#4

Date: June 26th

*/

public class Assignment4
{

	public static void main(String[] args)
	{
		final int SIZE = 5;            // The number of cards.
		int[] hand = new int[SIZE];    // Create an array to hold the value of cards.

		// Get the value for each card.
		System.out.println("Enter five numeric cards, no face cards. Use 2 - 9.\n");
		Scanner keyboard = new Scanner(System.in);
		for (int i = 0; i < 5; i++ )
		{
			System.out.print("Card " + (i + 1) + ": ");
			hand[i] = keyboard.nextInt();
			System.out.println();
		}

		// Check for hand categories.
		if (containsFourOfaKind(hand))
		{
			System.out.println("Four of a kind!");
		}
		else if (containsFullHouse(hand))
		{
			System.out.print("Full House!");
		}
		else if (containsStraight(hand))
		{
			System.out.println("Straight!");
		}
		else if (containsThreeOfaKind(hand))
		{
			System.out.println("Three of a kind!");
		}
		else if (containsTwoPair(hand))
		{
			System.out.println("Two pair!");
		}
		else if (containsAPair(hand))
		{
			System.out.println("Pair!");
		}
		else
		{
			System.out.println("High card!");
		}
	}
		/**
		   The containsAPair method tests if cards have a pair.
		   @param the array of the value of cards
		   @return true if card have a pair.
		*/
		public static boolean containsAPair(int[] hand)
		{
			boolean result = false;
			for (int i = 0; i < hand.length; i++)
			{
				for (int j = i ; j < hand.length; j++)
				{
					if (hand[i] == hand[j] && i != j)
					{
						result = true;
					}

				}
			}
			return result;

		}

		/**
		   The containsFourOfaKind method tests if cards have four matching cards.
		   @param the array of the value of cards
		   @return true if cards have four matching cards.
		*/
		public static boolean containsFourOfaKind(int hand[])
		{

			for (int i = 0; i < hand.length; i++)
			{
				int count = 1;

				for (int j = i + 1; j < hand.length; j++)
				{
					if (hand[i] == hand[j])
					{
						count++;
					}
				}
				
				if(count >= 4)
				{
					return true;
				}
			}
			return false;
		}

		/**
		   The containsThreeOfaKind method tests if cards have 3 matches.
		   @param the array of the value cards.
		   @return true if cards have 3.
		*/
		public static boolean containsThreeOfaKind(int hand[])
		{

			for (int i = 0; i < hand.length; i++)
			{
				int count = 1;

				for (int j = i + 1; j < hand.length; j++)
				{
					if (hand[i] == hand[j])
					{
						count++;
					}
					if(count >= 3)
					{
						return true;
					}

				}
			}
			return false;

		}

		/**
		   The containsFullHouse method tests if cards have 3 matches and a pair.
		   @param the array of the value cards.
		   @return true if cards have 3 matches and and a pair.
		*/
		public static boolean  containsFullHouse(int[] hand)
		{
			Sort(hand);
			if (hand[0] == hand[1] && hand[3] == hand[4])
			{
				if (hand[0] == hand[2] || hand[4] == hand[2])
				{	
					return true;
			    }    
			}
			return false;
		}
		
		/**
		   The method containStraight checks if card values straight regardless of their order.
		   @param the array of the value cards.
		   @return true if card values is straight regardless of the order.
		*/
		public static boolean  containsStraight(int hand[])
		{
			Sort(hand);
			for (int i = 0; i < hand.length - 1; i++)
			{
				if (hand[i] != hand[i + 1] - 1)
				{
					return false;	
				}
			}
			return true;
		}
		
		/**
		   The containsTwoPair method checks if cards have two pairs.
		   @param the array of the value cards.
		   @return true if cards have two pairs.
		*/
		public static boolean  containsTwoPair(int hand[])
		{
			if (hand[0] == hand[1] && hand[3] == hand[4])
			{
				return true;
			}
			else if (hand[1] == hand[2] && hand[3] == hand[4])
			{
				return true;
			}
			else if (hand[0] == hand[1] && hand[2] == hand[3])
			{
				return true;
			}
		
			return false;
			
		}

		/**
		   The Sort method will sort cards in array from min. to max. value.
		   @param the array of the value cards.
		   @return the arranged array.
		*/
		public static void Sort(int[] hand)
        {
			int temp;
        	boolean sorted = false;
        	while (!sorted)
        	{
        		for(int a = 0; a < hand.length-1; a++)
        		{
        			sorted = true;
        			int b = a + 1;
        			temp = hand[a];
        			
        			if (hand[b] < hand[a])
        			{
        				hand[a] = hand[b];
        				hand[b] = temp;
        				sorted = false;
        			}
        		}		
        	}
        	
        }	
}



