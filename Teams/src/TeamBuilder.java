import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TeamBuilder {

	public TeamBuilder() {
		
	}
	
	public List<List<String>> build(int teamSize, String ...players) {
		List<List<String>> teams = new LinkedList<List<String>>();
		
		if (isEvenTeams(teamSize, players)) {
			for (int i=0; i < players.length / teamSize; i++) {
				int start = i * teamSize;
				String[] members = Arrays.copyOfRange(players, start, start + teamSize);
				List<String> team = buildTeam(members);
				if (team.size() > 0) {
					teams.add(team);
				}
			}
		}
		
		return teams;
	}
	
	private boolean isEvenTeams(int teamSize, String[] players) {
		return players.length % teamSize == 0;
	}
	
	private List<String> buildTeam(String[] players) {
		List<String> team = new LinkedList<String>();
		
		for (String player : players) {
			team.add(player);
		}
		return team;
	}
}
