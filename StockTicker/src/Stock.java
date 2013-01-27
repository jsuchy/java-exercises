import java.util.LinkedList;
import java.util.List;

class Stock {

	private String symbol;
	private double price;
	private List<StockChangeListener> listeners;

	public Stock(String symbol, double price) {
		this.symbol = symbol;
		this.price = price;
		this.listeners = new LinkedList<StockChangeListener>();
	}

	public void setPrice(double newPrice) {
		price = newPrice;
		notifyListeners(newPrice);
	}

	public double getPrice() {
		return price;
	}

	public void addStockChangeListener(StockChangeListener listener) {
		listeners.add(listener);
	}
	
	private void notifyListeners(double newPrice) {
		for (StockChangeListener listener : listeners) {
			StockEvent stockEvent = new StockEvent(this, symbol, newPrice);
			listener.StockChanged(stockEvent);
		}
	}
}