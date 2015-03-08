import java.util.ArrayList;

/*
 * Demonstrate the use of Abstract Classes.
 * 
 * A music store sells recordings of songs by artist.  This recording may come
 * in one of many forms: Compact Disc, Cassette Tape, Vinyl LP, Digital Download.
 * This example illustrates the benefits of using an abstract class;
 * The member that are common to all formats of recording are declared
 * only in the abstract class.  This code is written once and inherited by any
 * class that is a descendant of sound recording.
 * 
 * Class.
 */



abstract class SoundRecording {
	private String name;
	private String artist;
	private Double price;
	
	// collect information about recordings in each format
	private Integer recordingInventoryCount;
	private Integer soldCount;
	private Double totalRevenue;
	
	SoundRecording()
	{
		name = new String("");
		artist = new String("");
		price = new Double(0.0);
		recordingInventoryCount = new Integer(0);
		soldCount = new Integer(0);
		totalRevenue = new Double(0.0);
	}
	
	SoundRecording(String name, String artist, Double price, Integer inventoryCount)
	{
		this.name = new String(name);
		this.artist = new String(artist);
		this.price = new Double(price);
		if (null != recordingInventoryCount)	
			recordingInventoryCount += inventoryCount;
		else
			recordingInventoryCount = new Integer(inventoryCount);
		soldCount = new Integer(0);
		totalRevenue = new Double(0.0);
	}
	
	public void printDescription() {
		System.out.println("This is a recording of the song "+name+" by "+artist);
	}
	
	public String getName() 
	{
		return name;
	}
	
	public String getArtist()
	{
		return artist;
	}
	
	public Double getPrice()
	{
		return price;
	}
	
	public Integer getInventoryCount()
	{
		return recordingInventoryCount;
	}
	
	public void setInventoryCount(Integer newCount)
	{
		recordingInventoryCount = new Integer(newCount);
	}
	
	public Integer getNumberSold()
	{
		return soldCount;
	}
	
	public Double getTotalRevenue()
	{
		return totalRevenue;
	}
	
	public void increasSold(int numberOfUnits) {
		soldCount += numberOfUnits;
	}
	
	public abstract void sell(int numberOfUnits);	
}

class CompactDisc extends SoundRecording {
	int numberOfDiscs;
	
	CompactDisc(String name, String artist, Double price, Integer inventoryCount) {
		super(name, artist, price, inventoryCount);
		numberOfDiscs = 1;
	}
	
	public void sell(int numberOfUnits) {
		if (numberOfUnits <= super.getInventoryCount()) {
			super.setInventoryCount(super.getInventoryCount().intValue() - numberOfUnits);
			super.increasSold(numberOfUnits);
		}
	}
	
	public void printDescription() {
		System.out.println("This is a Compact Disc (CD) of the song "+getName()+" by "+getArtist()+" number of discs in set: "+numberOfDiscs);
	}

	
}

class CassetteTape extends SoundRecording {
	int tapeLength;
	
	CassetteTape(String name, String artist, Double price, Integer inventoryCount) {
		super(name, artist, price, inventoryCount);
		tapeLength = 90;
	}
	
	public void sell(int numberOfUnits) {
		if (numberOfUnits <= super.getInventoryCount()) {
			super.setInventoryCount(super.getInventoryCount().intValue() - numberOfUnits);			
			super.increasSold(numberOfUnits);
		}
	}
	public void printDescription() {
		System.out.println("This is a Cassette tape of the song "+getName()+" by "+getArtist()+" duration "+tapeLength);
	}
	
}

class DigitalDownload extends SoundRecording {
	int sizeInBytes;
	
	DigitalDownload(String name, String artist, Double price, Integer inventoryCount) {
		super(name, artist, price, inventoryCount);
		sizeInBytes = 1048576;
	}
	
	public void sell(int numberOfUnits) {
		if (numberOfUnits <= super.getInventoryCount()) {
			super.setInventoryCount(super.getInventoryCount().intValue() - numberOfUnits);			
		}
	}
	
	public void printDescription() {
		System.out.println("This is a Digital Download of the song "+getName()+" by "+getArtist()+" size "+sizeInBytes);
	}
}

class VinylRecord extends SoundRecording {
	int numberOfDiscs;
	
	VinylRecord(String name, String artist, Double price, Integer inventoryCount) {
		super(name, artist, price, inventoryCount);
		numberOfDiscs = 1;
	}
	
	public void sell(int numberOfUnits) {
		if (numberOfUnits <= super.getInventoryCount()) {
			super.setInventoryCount(super.getInventoryCount().intValue() - numberOfUnits);			
		}
	}
	public void printDescription() {
		System.out.println("This is a Vinyl Record of the song "+getName()+" by "+getArtist()+" number of records in set: "+numberOfDiscs);
	}

}



public class MusicStore {
	ArrayList<SoundRecording> inventory = new ArrayList<SoundRecording>();
	
	public static void main(String[] args) {
		System.out.println("Welcome to CS111B Music Store");
		MusicStore myStore = new MusicStore();
		
		int i = 0;
		myStore.inventory.add(new VinylRecord("My Fart Will Go On","C. Dion", new Double(7.75), 100));
		System.out.println("Amount of Vinyl inventory in store is: "+myStore.inventory.get(i++).getInventoryCount());
		myStore.inventory.add(new CassetteTape("My Fart Will Go On","C. Dion", 7.75, 50));
		System.out.println("Amount of Cassette Tape inventory in store is: "+myStore.inventory.get(i++).getInventoryCount());
		myStore.inventory.add(new DigitalDownload("My Fart Will Go On","C. Dion", 7.75, 25));
		System.out.println("Amount of Digital inventory in store is: "+myStore.inventory.get(i++).getInventoryCount());
		myStore.inventory.add(new CompactDisc("My Fart Will Go On","C. Dion", 7.75, 13));
		System.out.println("Amount of CD inventory in store is: "+myStore.inventory.get(i).getInventoryCount());

		//CompactDisc myCD = (CompactDisc) myStore.inventory.get(i);
		//System.out.println("For song: "+myCD.getName()+" by: "+myCD.getArtist());

		// Demonstrate Polymorphism: where a method defined and accessed via a method in the superclasss
		// resolves to the correct method in a derived subclass
		// and the superclass object reference is able to distinguish between different classes
		// derived from the same superclass
		for (SoundRecording mySKU: myStore.inventory) {
			mySKU.printDescription();
			
		}

		// Demonstrate the Instance of Operator where the api provides a means to distinguish
		// the subclass of an object even if the reference used is to the superclass.
		for (i = 0; i < myStore.inventory.size(); i++) {
			if (true == myStore.inventory.get(i) instanceof VinylRecord) {
				System.out.println("SKU "+i+" is for a Vinyl Record");
			} else if (true == myStore.inventory.get(i) instanceof CassetteTape) {
				System.out.println("SKU "+i+" is for a Cassette Tape");
			} else if (true == myStore.inventory.get(i) instanceof DigitalDownload) {
				System.out.println("SKU "+i+" is for a Digital Download");
			} else if (true == myStore.inventory.get(i) instanceof CompactDisc) {
				System.out.println("SKU "+i+" is for a Compact Disc");
			}
		}
		
	}

}
