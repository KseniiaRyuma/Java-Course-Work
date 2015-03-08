/*

Name: Kseniia Ryuma

Course: CS111B

CRN: 52499-001

Assignment: Assignment#11

Date: July 14th

*/

import java.util.ArrayList;  // Needed for ArrayList Class.

// The Animal class is an abstract class that holds general data about animals.
// Classes representing specific types of animals should inherit from this class.

abstract class Animal
{
	// Java will use default constructor.
}

class Human extends Animal
{
	private String name;       // To hold human name.
	
	/**
	 * Constructor
	 * @param n The human name.
	 */
	
	Human(String n)            
	{
		name = n;
	}
	
	/**
	 * toString method
	 * @return A string indicating the object's name.
	 */
	
	public String toString()
	{
		return name;
	}
}

//The Vegetable class is an abstract class that holds general data about vegetables.
//Classes representing specific types of vegetables should inherit from this class.

abstract class Vegetable
{
	// Java will use default constructor.
}

//The Mineral class is an abstract class that holds general data about minerals.
//Classes representing specific types of minerals should inherit from this class.

abstract class Mineral
{
	// Java will use default constructor.
}

class Cow extends Animal
{ 
	// Java will use default constructor.
}

class Chicken extends Animal
{
	// Java will use default constructor.
}

class Rock extends Mineral
{
	// Java will use default constructor.
}

class Corn extends Vegetable
{
	// Java will use default constructor.
}

class Tree extends Vegetable
{
	// Java will use default constructor.
}

class Oak extends Tree
{
	// Java will use default constructor.
}

class Pine extends Tree
{
	// Java will use default constructor.
}

class Field extends Mineral
{
	// Aggregation create the has-a relationship between Field and Animal,Vegetable, and Mineral.
	private String name;                       // To hold the field's name.
	private ArrayList<Animal> animals;         // Array list of the animal objects of the Animal class.
	private ArrayList<Vegetable> vegetables;   // Array list of the vegetables objects of the Vegetable class.
	private ArrayList<Mineral> minerals;       // Array list of minerals objects of the  Mineral class.
	
	/**
	 * Constructor initializes the objects.
	 * @param n The name of the field.
	 */
	public Field(String n)
	{
		name = n;
		animals = new ArrayList<Animal>();
		vegetables = new ArrayList<Vegetable>();
		minerals = new ArrayList<Mineral>();
		
	}
	
	
	/**
	 * method addRock demonstrate polymorphism by 
	 * adding rocks in their superior class. 
	 * @param r The object of the Rock class.
	 */
	public void addRock(Rock r) 
	{
		minerals.add(r);
	}
	
	/**
	 * method addCorn demonstrate polymorphism by
	 * adding corns in their superior class.
	 * @param c The object of the Corn class.
	 */
	public void addCorn(Corn c)
	{
		vegetables.add(c);
	}
	
	/**
	 * method addTree demonstrate polymorphism by
	 * adding trees in their superior class.
	 * @param t The object of the Tree class.
	 */
	public void addTree(Tree t)
	{
		vegetables.add(t);
	}
	
	/**
	 * method addCow demonstrate polymorphism by
	 * adding cows in their superior class.
	 * @param c The object of the Cow class.
	 */
	public void addCow(Cow c)
	{
		animals.add(c);
	}
	 
	/**
	 * method addChicken demonstrate polymorphism by
	 * adding chickens in their superior class.
	 * @param ch The object of the Chicken class.
	 */
	public void addChicken(Chicken ch)
	{
		animals.add(ch);
	}
	
	/**
	 * toString method
	 * @return print out the object content.
	 */
	
	public String toString()
	{
		String result;                   // To hold the information about object.
		int chickenCounter = 0;          // To hold the number of chickens.
		int cowCounter = 0;				 // To hold the number of cows.
		int treeCounter = 0;             // To hold the number of trees.
		int cornCounter = 0;			 // To hold the number of corns.
		int rockCounter = 0;             // To hold the number of rocks.
	
			
		// Iterate over field and calculate each animal.
		for( int i = 0; i < animals.size(); i++)
		{
			Animal a = animals.get(i);
			
			// To check how many chickens in field by using
			// the Instance of Operator where the api provides a means to distinguish
			// the subclass of an object even if the reference used is to the superclass.
			if( a instanceof Chicken)     
			{
				chickenCounter++;
			}
			
			// To check how many cows in the field.
			if( a instanceof Cow)         
			{
				cowCounter++;
			}
		}
		
		// Iterate over field and calculate each vegetable.
		for( int i = 0; i < vegetables.size(); i++)
		{
			Vegetable v = vegetables.get(i);
			
		    // To check how many corns in field.
			if( v instanceof Corn)            
			{
				cornCounter++;
			}
			
			// To check how many chickens in field.
			if( v instanceof Tree)
			{
				treeCounter++;
			}
		}
		
		// Iterate over field and and calculate each mineral.
		for( int i = 0; i < minerals.size(); i++)
		{
			Mineral m = minerals.get(i);
			
			// To check how many rocks in field.
			if( m instanceof Rock)
			{
				rockCounter++;
			}
		}
		
		// Hold the gathered information about the field.
		result = "\nField " + name +  " has " + chickenCounter + " chickens, "
				+ cowCounter + " cows,\n"
				+ cornCounter + " corns, " + treeCounter + " trees, "
				+ rockCounter + " rocks";
		
		// Return the string
		return result;
	}
	
	
}

class Farm extends Mineral
{
	// Aggregation create the has-a relationship between Farm and Tree and Field.
	private ArrayList<Tree> trees;      // Array list of the tree objects of the Tree class.
	private ArrayList<Field> field;     // Array list of the field objects of the Field class.

	
	/**
	 * Constructor initializes the objects.
	 */
	public Farm()
	{
		field = new ArrayList<Field>();
		trees = new ArrayList<Tree>();
	}
	
	/**
	 * The addNewField method adds the new object to the array list of field.
	 * @param newField The Field object.
	 */
	
	public void addNewField(Field newField)
	{
		field.add(newField);
	}
	
	/**
	 * method addTree add the new object to the array list trees.
	 * @param t The objects of the Tree class.
	 */
	public void addTree(Tree t)
	{
		trees.add(t);
	}
	
	/**
	 * toString method print out information about object.
	 * @return the number of fields and trees that object contains.
	 */
	
	public String toString()
	{
		String result;                      // To hold information about object.
		int oakCounter = 0;                 // To hold the number of Oak trees.
		int pineCounter = 0;                // To hold the number of Pine trees.
		

		// To check how many Oak and Pine trees in each field by using
		// the Instance of Operator where the api provides a means to distinguish
		// the subclass of an object even if the reference used is to the superclass.
		for ( int k = 0; k < trees.size(); k++)
		{
			Tree t = trees.get(k);
			
			if(t instanceof Pine)   
			{
				pineCounter++;
			}
			
			if(t instanceof Oak)
			{
				oakCounter++;
			}
			
		}
		
		result = "Farm has " + field.size() + " fields " + oakCounter +
				" Oak trees and " + pineCounter + " Pine trees.";
		
		// Iterate over farms and print out each.
		for( int i = 0; i < field.size(); i++)
		{
			Field f = field.get(i);
			result += f.toString();
		}
		
		
		// Return the string
		return result;
	}
		
}

class Farmer extends Human
{
	// Aggregation create the has-a relationship between Farmer and Farm.
	private ArrayList<Farm> farm;        // In case Farmer can own multiple farms.
	
	/**
	 * Constructor
	 * @param n The name of the farmer.
	 */
	public Farmer(String n)
	{
		
		super(n);                        // Call constructor of the supper class.
	    farm = new ArrayList<Farm>();    // Create ArrayList to hold farms.
	}
	
	/**
	 * method add adds the farm to the farmer.
	 * @param f The object of the Farm class.
	 */
	
	public void add(Farm f)
	{
		// Add input farm reference to the list of farms
		farm.add(f);
	}
	
	/**
	 * toString method
	 * @return the number of farms that farmer has.
	 */
	
	public String toString()
	{
		String result;
		
		result = "Farmer " + super.toString() + " has " + farm.size() + " farms\n";
		
		// Iterate over farms and print out each
		for( int i = 0; i < farm.size(); i++)
		{
			Farm f = farm.get(i);
			result += f.toString();
		}
				   
		// Return the string.
		return result;
	}
	
}

public class ImprovedOldMacDonald 
{
	public static void main(String[] args)
	{
		// Create a farm.
		Farm farm = new Farm();
		
		// Create a farmer.
		Farmer oldMcDonald = new Farmer("Old McDonald");
		
		// Add the object farm to the Farmer class.
		oldMcDonald.add(farm);
	
		Field northField = new Field("Northfield");  // Create the north field. 
		farm.addNewField(northField);    // Add north field to the farm.
		for( int i = 0; i < 6; i++ )    // Add some rocks to the field.
		{
			northField.addRock(new Rock());
		}
		
		Field southField = new Field("Southfield");  // Create the south field.
		farm.addNewField(southField);    // Add the south field to the farm.
		for( int i = 0; i < 2; i++ )    // Add some cows to the field.
		{
			southField.addCow(new Cow());
		}
		
		Field eastField = new Field("Eastfield");   // Create the east field.
		farm.addNewField(eastField);     // Add the east field to the farm.
		for( int i = 0; i < 5; i++ )    // Add some chickens to the field.
		{
			eastField.addChicken(new Chicken());
		}
		for( int i = 0; i < 10; i++ )    // Add some corn to the field.
		{
			eastField.addCorn(new Corn());
		}
		
		Field westField = new Field("Westfield");   // Create the west field.
		farm.addNewField(westField);     // Add the west field to the farm.
		for( int i = 0; i < 11; i++ )    // Add some trees to the field.
		{
			westField.addTree(new Tree());
		}
		
		// Assign trees to the farm.
		for (int i = 0; i < 1; i++)       // Add some Oak trees to the farm.
		{
			farm.addTree(new Oak());               
		}
		
		for (int i = 0; i < 2; i++)        // Add some Pine trees to the farm.
		{
			farm.addTree(new Pine());               
		}

                System.out.print(oldMcDonald);   // To check the program out put.
	}		

	
}

