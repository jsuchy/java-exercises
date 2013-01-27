import java.util.EventObject;

public class StockEvent extends EventObject {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String symbol;
	private double price;

	public StockEvent(Object sender, String stockSymbol, double newPrice) {
		super(sender);
		setSymbol(stockSymbol);
		setPrice(newPrice);
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}