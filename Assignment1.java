import java.util.Scanner;

/*

Name: Kseniia Ryuma

Course: CS111B

CRN: 52499-001

Assignment: Assignment#1

Date: June 17th

*/

public class Assignment1
{ 
	public static void main(String args[])
	{
		int count;
		char goAgain = 'y';
		Scanner keyboard= new Scanner(System.in);
		while (goAgain != 'n')
		{
			System.out.print("How many asterisks?: ");
			count = keyboard.nextInt();
			for (int i = 0; i < count; i++)
			{
				System.out.print("*");
			}
			System.out.println();
			System.out.print("Go again? (y/n): ");
			goAgain = keyboard.next().charAt(0);
		}
	}
}
