package homework;

public class Stock {
	String symbol;
	String name;
	
	double previousClosingPrice;
	double currentPrice;
	
	public Stock(String new_symbol, String new_name) {
		symbol = new_symbol;
		name = new_name;
	}
	
	public double getChangePercent(double old_closeprice, double starting_price) {
		previousClosingPrice = old_closeprice;
		currentPrice = starting_price;
		double difference = previousClosingPrice - currentPrice;
		double avg = (previousClosingPrice + currentPrice) / 2;
		double percent = (difference / avg) * 100;
		return percent;
	}
	
	public String toString() {
		return "Stock name: " + name +
                   "\n Symbol: " + symbol +
                   "\n previous price: " + previousClosingPrice + 
                   "\n current price: " + currentPrice;
    }
}
