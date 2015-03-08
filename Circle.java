import javax.swing.JFrame;   // Needed for Swing classes
/*

Name: Kseniia Ryuma

Course: CS111B

CRN: 52499-001

Assignment: Assignment#9

Date: July 9th

*/

public class Circle 
{
	private double radius;  // The radius of the circle.
	private double x;       // The x coordinate of the circle.
	private double y;       // The y coordinate of the circle.
	
	/**
	 * This is default constructor where variables
	 * origin and radius are initialized to default values.
	 */
	
	public Circle()
	{
		radius = 0;
		x = 0;
		y = 0;
		
	}
	
	/**
	 * This constructor initialize the radius,X and Y coordinates. 
	 * @param xValue The value of X coordinate.
	 * @param yValue The value of Y coordinate.
	 * @param radiusValue The value of radius if the circle.
	 */
	
	public Circle(double xValue, double yValue, double radiusValue)
	{
		x = xValue;
		y = yValue;
		radius = radiusValue;
		
	}
	
	/**
	 * The setX method sets coordinate X to the value.
	 * @param value The value to store in X. 
	 */
	
	public void setX(double value)
	{
		x = value;
	}
	
	/**
	 * The method getX returns a MyCircle object's X coordinate.
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
	 * The getY method return a MyCircle object's x.
	 * @return The value of the y coordinate.
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
	 * The getRadius method returns a MyCircle object's radius.
	 * @return The circle radius.
	 */
	
	public double getRadius()
	{
		return radius;
	}
	
	/**
	 * The method getArea calculates and returns the area of the circle.
	 * @return Calculated area.
	 */
	
	public double getArea()
	{
		// Apply circle area formula: pi*R^2.
		return 3.14 * radius * radius;
	}
	
	/**
	 * Determine whether or not a point is in a circle by calculating the 
	 * distance from the center of the circle (its x and y coordinates) to the point.
	 * @param xValue The value of the X coordinate.
	 * @param yValue The value of the Y coordinate.
	 */
	
	public boolean containsPoint(double xValue, double yValue)
	{
		// Calculate distance.
		double distance = Math.pow(x - xValue, 2) + Math.pow(y - yValue, 2);
		
		// Calculate the square root of distance.
		double sqrDistance = Math.pow(distance, 0.5);
		
		// Compare the distance to sum of radiuses.
		if (radius >= sqrDistance)
		{
				return true;
		}

		return false;
	}
	
	// Main function that tests Circle class.
	public static void main(String[] args)
	{
		// Create Circle object
		Circle circle = new Circle();
		
		
		// Initialize the circle.
		circle.setX(3.0);
		circle.setY(7.0);	
		circle.setRadius(4.0);
		
		// Get the area of three circles and display it.
		System.out.println();
		System.out.printf("The area of the circle is: %.2f\n", circle.getArea());
		
		// Allocate array of 3 circles
        Circle[] circles = new Circle[3];
        
        // Create three circles objects 
        circles[0] = new Circle(13, 16, 190);
        circles[1] = new Circle(17, 9, 168);
        circles[2] = new Circle(21, 30, 155);
        
        // Determine whether or not a point is in a circle.
        if(circles[2].containsPoint(2, 4))
        {
        	System.out.println("The point inside the circle[2]");
        }
        else 
        {
        	System.out.println("The point outside the circle[2]");
        }
        
        /**
         * Displays a simple window with width and height to contain the circle.
         * Title set up to the array index and the area of the corresponding circle.
         */
          
        for (int i = 0; i < circles.length; i++)
        {
	         // Create a window.
	        JFrame window = new JFrame();
	          
	        // Set the title.
	        window.setTitle("circles[" + i + "] has area: " + circles[i].getArea());
	
	        // Set the size of the window.
	        window.setSize((int)circles[i].getRadius()*2, (int)circles[i].getRadius()*2);
	
	        // Specify what happens when the close button is clicked.
	        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	        // Display the window.
	        window.setVisible(true);
         }
          
	}     
	
}


