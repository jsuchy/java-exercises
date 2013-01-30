public interface StockObserver {
	void update(String symbol, int newPrice);
}