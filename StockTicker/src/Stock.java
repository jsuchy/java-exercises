import java.util.LinkedList;
import java.util.List;

class Stock {

	private String symbol;
	private int price;
	private List<StockObserver> listeners;

	public Stock(String symbol, int price) {
		this.symbol = symbol;
		this.price = price;
		this.listeners = new LinkedList<StockObserver>();
	}

	public void setPrice(int newPrice) {
		price = newPrice;
		notifyListeners(newPrice);
	}

	public double getPrice() {
		return price;
	}

	public void attach(StockObserver listener) {
		listeners.add(listener);
	}
	
	public void detach(StockObserver listener) {
		listeners.remove(listener);
	}
	
	private void notifyListeners(int newPrice) {
		for (StockObserver listener : listeners) {
			listener.update(symbol, newPrice);
		}
	}
}