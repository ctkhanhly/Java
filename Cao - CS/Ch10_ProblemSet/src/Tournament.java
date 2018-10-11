
public class Tournament {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TournamentOfficial t = new TournamentOfficial();
		
		SoccerTeam a = new SoccerTeam(t);
		SoccerTeam b = new SoccerTeam(t);
		SoccerTeam c = new SoccerTeam(t);
		SoccerTeam d = new SoccerTeam(t);
		
		
		//play
		a.played(b, 5, 4);
		b.played(c, 2, 1);
		c.played(a, 1, 3);
		d.played(a, 7,7);
		d.played(b, 4, 9);
		d.played(c, 10, 4);
		
		System.out.println("Total points of team a is: " + a.getPoints());
		System.out.println("Total points of team b is: " + b.getPoints());	
		System.out.println("Total points of team c is: " + c.getPoints());
		
//		System.out.println("Total games all teams played is: " + a.totalGames());
//		System.out.println("Total goals all teams made is: " + a.totalGoals());
		
		
		System.out.println("Total games: " +b.official().getTotalGames() + " Total goals: " + b.official().getTotalGoals());
		//System.out.println(b.totalGoals());
	}

}
