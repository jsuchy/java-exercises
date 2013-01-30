import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TeamBuilder {

	public TeamBuilder() {
		
	}
	
	// Return String[][]
	public List<String[]> build(int teamSize, String ...players) {
		List<String[]> teams = new LinkedList<String[]>();
		
		if (isEvenTeams(teamSize, players)) {
			for (int i=0; i < players.length / teamSize; i++) {
				int start = i * teamSize;
				String[] members = Arrays.copyOfRange(players, start, start + teamSize);
				if (members.length > 0) {
					teams.add(members);
				}
			}
		}
		
		return teams;
	}
	
	private boolean isEvenTeams(int teamSize, String[] players) {
		return players.length % teamSize == 0;
	}
}
