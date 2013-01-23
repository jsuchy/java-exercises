import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class TeamBuilderTest {

	@Test
	public void testNoPlayers() {
		List<String> expected = new ArrayList<String>();
		assertEquals(expected, TeamBuilder.build(1));
	}
	
	@Test
	public void testOnePlayerSplitIntoTeamOfOne() {
		List<List<String>> teams = TeamBuilder.build(1, "Mike");
		assertEquals(1, teams.size());
		for (List<String> team : teams) {
			assertEquals(1, team.size());
		}
	}
	
	@Test
	public void testTwoPlayersSplitIntoTeamOfTwo() {
		List<List<String>> teams = TeamBuilder.build(2, "Mike", "Jim");
		assertEquals(1, teams.size());
		for (List<String> team : teams) {
			assertEquals(2, team.size());
		}
	}
	
	@Test
	public void testFourPlayersSplitIntoTeamsOfTwo() {
		List<List<String>> teams = TeamBuilder.build(2, "Mike", "Jim", "Micah", "Bobo");
		assertEquals(2, teams.size());
		for (List<String> team : teams) {
			assertEquals(2, team.size());
		}
	}
	
	@Test
	public void testSixPlayersSplitIntoTeamsOfThree() {
		List<List<String>> teams = TeamBuilder.build(3, "Mike", "Jim", "Micah", "Bobo", "Willow", "Franklin");
		assertEquals(2, teams.size());
		for (List<String> team : teams) {
			assertEquals(3, team.size());
		}
	}
}