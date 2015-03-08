/*

Name: Kseniia Ryuma

Course: CS111B

CRN: 52499-001

Assignment: Assignment#6

Date: June 30th

*/

/**
 * The MyCircle class holds data about circles.
 */

public class MyCircle 
{
	private double radius;  // The radius of the circle.
	private double x;       // The x coordinate of the circle.
	private double y;       // The y coordinate of the circle.
	
	
	/**
	 * The setX method sets coordinate X to the value.
	 * @param value The value to store in X. 
	 */
	
	public void setX(double value)
	{
		x = value;
	}
	
	/**
	 * The method getX return a MyCircle object's X coordinate.
	 * @return X coordinate
	 */
	
	public double getX()
	{
		return x;
	}
	
	/**
	 * The setY method sets coordinate Y to the value.
	 * @param value The value to store in Y.
	 */
	
	public void setY(double value)
	{
		y = value;
	}
	
	/**
	 * The getY method return a MyCircle object's Y.
	 * @return The value of the Y coordinate.
	 */
	
	public double getY()
	{
		return y;
	}
	
	/**
	 * The setRadius method stores the radius of the circle.
	 * @param value The value to store in radius.
	 */
	
	public void setRadius(double value)
	{
		radius = value;
	}
	
	/**
	 * The getRadius method return a MyCircle object's radius.
	 * @return The value in the radius field.
	 */
	
	public double getRadius()
	{
		return radius;
	}
	
	/**
	 * The getAres method calculates and returns the area of the circle.
	 * @return Calculated area.
	 */
	
	// Apply circle area formula: pi*R^2.
	public double getArea()
	{
		return 3.14 * Math.pow(radius, 2);
	}
	
	/**
	 * The doesOverlap method checks if circles have overlap.
	 * @param otherCircle - circle to compare to. 
	 * @return true if circles overlap and false if don't.
	 */

	boolean doesOverlap(MyCircle otherCircle)
	{
		// Calculate delta X and delta Y.
		double differenceX = x - otherCircle.getX();
		double differenceY = y - otherCircle.getY();
		
		// Calculate square distance.
		double distance = differenceX * differenceX + differenceY * differenceY;
		
		// The value of distance after square root evaluation
		double distance1 = squareRootCalculator(distance);
		
		// Compare the distance to sum of radiuses.
		if ((radius + otherCircle.getRadius()) > distance1)
		{
			return true;
		}

		return false;
	}
	
	/**
	 *  The squareRootCalculator method calculates the square root of the input number.
	 *  @param the input double number to apply sqrt function on.
	 *  @return estimated value of sqrt(inputNumber)
	 */
	 
	public static double squareRootCalculator(double inputNumber)
	{
		double result;        // Result value.
		
		double limit1, limit2;
		int i;
		
		// Find the limiting powers of 2
		for( i = 0; ; i++ )
		{
			limit1 = i * i;
			limit2 = (i+1) * (i+1);
			
			if( limit1 <= inputNumber && limit2 >= inputNumber)
			{
				break;
			}
		}
		
		// Estimate the fraction
		double num = limit2 - limit1; 
		double num1 = inputNumber - limit1;
		double num3 = num1 / num;
		result = i + num3;
				
		
		return result; 
	}

}


