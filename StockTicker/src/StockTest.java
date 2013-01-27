import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StockTest {

	private Stock stock;
	
	@Before
	public void setUp() {
		stock = new Stock("AAPL", 800.0);
	}
	
	@Test
	public void withNoListeners() {
		stock.setPrice(790.0);
	}
	
	@Test
	public void notifiesListenerOfPriceChange() {
		MockStockChangeListener listener = new MockStockChangeListener();
		stock.addStockChangeListener(listener);
		stock.setPrice(750.0);
		assertEquals("AAPL", listener.getSymbol());
		assertEquals(750.0, listener.getPrice(), 0.0001);
	}
}