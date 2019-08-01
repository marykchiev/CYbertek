package Day62;

public class Stock {
//	tickerSymbol (String)
	String tickerSymbol;
//	companyName (String)
	String companyName;
	
//	price (int)
	int price;
//	percentChange (double)
	double percentChange;
//	totalShares(int)
	int totalShares;
//	marketCap(long)
	long marketCap;
public Stock(String tickerSymbol, String companyName, int price, int totalShares) {
	this.tickerSymbol = tickerSymbol;
	this.companyName = companyName;
	this.price = price;
	this.totalShares = totalShares;
	this.marketCap=totalShares+price;
}
public void adjustPrice(int value)
{
	this.price=value;
	
}

public String toString() {
	return "Ticker Symbol:" + tickerSymbol + "\n Company: " + companyName + "\n Current Price=" + price + "\n Market Cap: "
			+ marketCap + "]";
}
	
}
