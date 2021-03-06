public class Stock
{

	private String symbol;
	private double sharePrice;

	public Stock(String sym, double price) 
	{
		symbol = sym;
		sharePrice = price;
	}

	public String getSymbol()
	{
		return symbol;
	}

	public void setSymbol(String pSymbol)
	{
		symbol = pSymbol;
	}

	public double getSharePrice()
	{
		return sharePrice;
	}

	public void setSharePrice(double pSharePrice)
	{
		sharePrice = pSharePrice;
	}

	public String toString()
	{
		String str = "Trading symbol: " +  symbol +
			"\nShare price: " + sharePrice;
		return str;
	}

	public boolean equals(Stock object2)
	{
		boolean status;

		if (symbol.equals(object2.symbol) && sharePrice == object2.sharePrice)
			status = true;
		else
			status = false;

		return status;
	}
}

