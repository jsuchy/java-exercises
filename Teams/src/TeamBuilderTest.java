import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class TeamBuilderTest {

	@Test
	public void testEmptyPlayers() {
		List<String> expected = new ArrayList<String>();
		assertEquals(expected, TeamBuilder.build(1));
	}
	
	@Test
	public void testOnePlayersForOneTeam() {
		List<List<String>> teams = TeamBuilder.build(1, "Mike");
		assertEquals(1, teams.size());
	}
}
