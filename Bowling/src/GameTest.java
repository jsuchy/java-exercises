import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GameTest {

	private Game game;

	private void rollMany(int rolls, int pins) {
		for (int i=0; i < rolls; i++) {
			game.roll(pins);
		}
	}
	
	private void rollSpare() {
		game.roll(5);
		game.roll(5);
	}
	
	private void rollStrike() {
		game.roll(10);
	}
	
	@Before
	public void setUp() throws Exception {
		game = new Game();
	}

	@Test
	public void gutterGame() {
		rollMany(20, 0);
		assertEquals(0, game.score());
	}
	
	@Test
	public void allOnes() {
		rollMany(20, 1);
		assertEquals(20, game.score());
	}
	
	@Test
	public void oneSpare() {
		rollSpare();
		game.roll(3);
		rollMany(17, 0);
		
		assertEquals(16, game.score());
	}
	
	@Test
	public void oneStrike() {
		rollStrike();
		game.roll(3);
		game.roll(4);
		rollMany(16, 0);
		assertEquals(24, game.score());
	}
	
	@Test
	public void perfectGame() {
		rollMany(12, 10);
		assertEquals(300, game.score());
	}
}