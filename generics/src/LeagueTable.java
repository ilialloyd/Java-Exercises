import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ilialloyd
 * Date: 2/5/2023
 * Leave your comment below if you have
 * --------------------------------------------------------
 */
public class LeagueTable<T extends Team> {
    private List<T> teams;

    public LeagueTable() {
        this.teams = new ArrayList<T>();
    }

    public boolean addTeam(T team) {
        if (teams.contains(team))
            return false;

        if (!(team instanceof Team))
            throw new IllegalArgumentException("Invalid team");

        teams.add(team);
        return true;
    }
        public void showLeagueTable () {
            Collections.sort(teams);
            System.out.println("Team Name\t\tPoints");
            for (T team : teams) {
                System.out.println(team.getName() + "\t\t" + team.ranking());
            }
        }
    }
