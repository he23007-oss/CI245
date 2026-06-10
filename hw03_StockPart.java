package homework;

public class hw03_StockPart {

	public static void main(String[] args) {
		System.out.println("Homework03 - Stock - Ricardo Hernandez");
		Stock Stock1 = new Stock("ORCL", "Orcale Corporation");
		
		System.out.println(" price change in percent: " + Stock1.getChangePercent(34.5, 34.35));

	}

}
