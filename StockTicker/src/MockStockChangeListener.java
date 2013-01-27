public class MockStockChangeListener implements StockChangeListener {
	private String symbol;
	private double price;

	public MockStockChangeListener() {
	}

	@Override
	public void StockChanged(StockEvent stockEvent) {
		symbol = stockEvent.getSymbol();
		price = stockEvent.getPrice();
	}

	public double getPrice() {
		return price;
	}
	
	public String getSymbol() {
		return symbol;
	}
}
