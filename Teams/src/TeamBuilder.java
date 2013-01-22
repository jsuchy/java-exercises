import java.util.LinkedList;
import java.util.List;

public class TeamBuilder {

	public static List<List<String>> build(int teamSize, String ...players) {
		List<List<String>> teams = new LinkedList<List<String>>();
		for (String player : players) {
			List<String> team = new LinkedList<String>();
			team.add(player);
			teams.add(team);
		}
		return teams;
	}
}
