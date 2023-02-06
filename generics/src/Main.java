import java.lang.instrument.ClassDefinition;

/**
 * Created by IntelliJ IDEA.
 * User: ${USER}
 * Date: ${DATE}
 * Leave your comment below if you have
 * --------------------------------------------------------
 */
public class Main {
    public static void main(String[] args) {

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> landOfFires = new Team<>("Land Of Fires");
        landOfFires.addPlayer(joe);
//        landOfFires.addPlayer(pat);
//        landOfFires.addPlayer(beckham);

        System.out.println(landOfFires.numPlayers());


        Team<BaseballPlayer> baseballPlayerTeam = new Team<>("Chicago Cubs");
        baseballPlayerTeam.addPlayer(pat);

        Team<SoccerPlayer> brokenTeam = new Team<>("Chelsea");
        brokenTeam.addPlayer(beckham);

        Team <FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        fremantle.matchResult(landOfFires,4,2);
        fremantle.matchResult(hawthorn,3,2);

        hawthorn.matchResult(fremantle,1,0);
        hawthorn.matchResult(landOfFires,3,8);

        landOfFires.matchResult(fremantle,2,1);
        landOfFires.matchResult(hawthorn,1,1);

        System.out.println("rankings");
        System.out.println(landOfFires.getName()+" : "+landOfFires.ranking());
        System.out.println(hawthorn.getName()+" : "+hawthorn.ranking());
        System.out.println(fremantle.getName()+" : "+fremantle.ranking());


        System.out.println(landOfFires.compareTo(hawthorn));
        System.out.println(hawthorn.compareTo(fremantle));


        LeagueTable<Team<FootballPlayer>> table = new LeagueTable<>();
        table.addTeam(landOfFires);
        table.addTeam(hawthorn);
        table.addTeam(fremantle);
//        table.addTeam(brokenTeam);
        table.showLeagueTable();
    }
}