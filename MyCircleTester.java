/*

Name: Kseniia Ryuma

Course: CS111B

CRN: 52499-001

Assignment: Assignment#6

Date: June 30th

*/

/**
 * This program runs a simple test of the MyCircle class.
 */
public class MyCircleTester 
{

	public static void main(String[] args)
	{
		// Create three MyCircle objects
		MyCircle circle1 = new MyCircle();
		MyCircle circle2 = new MyCircle();
		MyCircle circle3 = new MyCircle();
		
		// Initialize the circle1.
		circle1.setX(3.0);
		circle1.setY(7.0);
		circle1.setRadius(1.0);
		
		// Initialize the circle2.
		circle2.setX(2.0);
		circle2.setY(5.0);
		circle2.setRadius(7.5);
		
		// Initialize the circle3.
		circle3.setX(8.0);
		circle3.setY(9.0);
		circle3.setRadius(2.0);
		
		// Get the area of three circles and display it.
		System.out.println();
		System.out.printf("The area of the circle1 is: %.2f\n", circle1.getArea());
		System.out.printf("The area of the circle2 is: %.2f\n", circle2.getArea());
		System.out.printf("The area of the circle3 is: %.2f\n ", circle3.getArea());
		System.out.println();		
		
		// Check if circles1 overlaps with circle2;
		if(circle1.doesOverlap(circle2))
		{
			System.out.println("circle1 and circle2 overlap");
		}
		else
		{
			System.out.println("circle1 and circle2 not overlap");
		}
		
		// Check if circles1 overlaps with circle3;
		if(circle1.doesOverlap(circle3))
		{
			System.out.println("circle1 and circle3 overlap");
		}
		else
		{
			System.out.println("circle1 and circle3 not overlap");
		}

		// Check if circles2 overlaps with circle3;
		if(circle2.doesOverlap(circle3))
		{
			System.out.println("circle2 and circle3 overlap");
		}
		else
		{
			System.out.println("circle2 and circle3 not overlap");
		}
	
	}

}

