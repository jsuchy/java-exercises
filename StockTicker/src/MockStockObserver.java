public class MockStockObserver implements StockObserver {
	private String symbol;
	private int price;

	public MockStockObserver() {
	}

	@Override
	public void update(String symbol, int newPrice) {
		this.symbol = symbol;
		this.price = newPrice;
	}

	public int getPrice() {
		return price;
	}
	
	public String getSymbol() {
		return symbol;
	}
}