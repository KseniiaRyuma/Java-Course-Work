import java.util.Scanner;
import java.util.Random;

/*

Name: Kseniia Ryuma

Course: CS111B

CRN: 52499-001

Assignment: Assignment#1

Date: June 17th

*/

public class Assignment2 
{
	public static void main(String[] args)
	{
		final int CARDS_RANGE = 10;              // Run 10 random cards
		char anotherCard, goAgain;              
		Scanner keyboard = new Scanner(System.in);
		
		// The beginning of the new game
		do
		{	
			// Get the first two cards
			Random cards = new Random(); 
			int card1 = cards.nextInt(CARDS_RANGE) + 1;
			int card2 = cards.nextInt(CARDS_RANGE) + 1;
			System.out.println("First cards: " + card1 + "," + card2);
			
			// The sum of the first two cards
			int total = card1 + card2;
			System.out.println("Total: " + total);
			
			// Ask user whether he/she wants another card to add or not
			System.out.print("Do you want another card? (y/n): ");
			anotherCard = keyboard.next().charAt(0);
			
	        	while (anotherCard == 'y')
			{
	        		int card3 = cards.nextInt(CARDS_RANGE) + 1;
	        		total += card3;
	        		System.out.println("Card:" + card3);
				System.out.println("Total: " + total);
				
				// Check result 
	        		if (total <= 21 )
				{
					System.out.print("Do you want another card? (y/n): ");
					anotherCard = keyboard.next().charAt(0);
				}	
				else 
				{
					System.out.println("Bust.");
					break; 
				}
						
	                 }

			 System.out.print("Would you like play again? (y/n): ");
           	         goAgain = keyboard.next().charAt(0);	
			
		}while (goAgain == 'y');
			
	}
}
