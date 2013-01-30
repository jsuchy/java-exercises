import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class StockTest {

	private Stock stock;
	
	@Before
	public void setUp() {
		stock = new Stock("AAPL", 80000);
	}
	
	@Test
	public void withNoListeners() {
		stock.setPrice(79000);
	}
	
	@Test
	public void notifiesListenerOfPriceChange() {
		MockStockObserver listener = new MockStockObserver();
		stock.attach(listener);
		stock.setPrice(75000);
		assertEquals("AAPL", listener.getSymbol());
		assertEquals(75000, listener.getPrice());
	}
	
	@Test
	public void detachListenerPreventsNotification() {
		MockStockObserver listener = new MockStockObserver();
		stock.attach(listener);
		stock.detach(listener);
		stock.setPrice(100);
		assertEquals(0, listener.getPrice());
	}
}