import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TeamBuilderTest {

	private TeamBuilder teamBuilder;

	@Before
	public void testSetup() {
		teamBuilder = new TeamBuilder();
	}
	
	@Test
	public void testNoPlayers() {
		List<List<String>> teams = teamBuilder.build(1);
		checkNumberOfTeams(0, teams);
		checkNumberOfMembersInTeams(0, teams);
	}
	
	@Test
	public void testOnePlayerSplitIntoTeamOfOne() {
		List<List<String>> teams = teamBuilder.build(1, "Mike");
		checkNumberOfTeams(1, teams);
		checkNumberOfMembersInTeams(1, teams);
	}
	
	@Test
	public void testTwoPlayersSplitIntoTeamOfTwo() {
		List<List<String>> teams = teamBuilder.build(2, "Mike", "Jim");
		checkNumberOfTeams(1, teams);
		checkNumberOfMembersInTeams(2, teams);
	}
	
	@Test
	public void testFourPlayersSplitIntoTeamsOfTwo() {
		List<List<String>> teams = teamBuilder.build(2, "Mike", "Jim", "Micah", "Bobo");
		checkNumberOfTeams(2, teams);
		checkNumberOfMembersInTeams(2, teams);
	}
	
	@Test
	public void testUnevenTeams() {
		List<List<String>> teams = teamBuilder.build(2, "Mike", "Jim", "Micah");
		checkNumberOfTeams(0, teams);
		checkNumberOfMembersInTeams(0, teams);
	}
	
	@Test
	public void testSixPlayersSplitIntoTeamsOfThree() {
		List<List<String>> teams = teamBuilder.build(3, "Mike", "Jim", "Micah", "Bobo", "Willow", "Franklin");
		checkNumberOfMembersInTeams(3, teams);
		for (List<String> team : teams) {
			assertEquals(3, team.size());
		}
	}
	
	private void checkNumberOfTeams(int expected, List<List<String>> teams) {
		assertEquals(expected, teams.size());
	}
	private void checkNumberOfMembersInTeams(int expected, List<List<String>> teams) {
		for (List<String> team : teams) {
			assertEquals(expected, team.size());
		}
	}
}