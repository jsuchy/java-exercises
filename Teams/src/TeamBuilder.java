import java.util.LinkedList;
import java.util.List;

public class TeamBuilder {

	public static List<List<String>> build(int teamSize, String ...players) {
		List<List<String>> teams = new LinkedList<List<String>>();
		List<String> team = new LinkedList<String>();
		
		for (String player : players) {
			team.add(player);
			if (team.size() == teamSize) {
				teams.add(team);
				team = new LinkedList<String>();
			}
		}
		
		if (team.size() > 0) {
			teams.add(team);	
		}
		
		return teams;
	}
}
