
public class SoccerTeam {
	//FIELDS
	private int wins;
	private int losses;
	private int ties;
//	private static int totalGames;
//	private static int totalGoals;
	private TournamentOfficial official;
	
	public SoccerTeam(TournamentOfficial t){
		official = t;
	}
	public void played(SoccerTeam other, int myScore, int otherScore){
		if(myScore < otherScore){
			this.losses++;
			other.wins++;
		}
		else if(myScore > otherScore){
			this.wins++;
			other.losses++;
		}
		else{
			this.ties++;
			other.ties++;
		}
//		totalGames++;
//		totalGoals += myScore + otherScore;
		
		official.totalGames();
		official.totalGoals(myScore, otherScore);
	}
	
	public int getPoints(){
		return this.wins*3 + this.ties*1;
	}
	public void reset(){
		this.wins = 0;
		this.losses = 0;
		this.ties = 0;
	}
//	public static int totalGames(){
//		return totalGames;//cannot make static reference to nonstatic fields
//	}
//	public static int totalGoals(){
//		return totalGoals;
//	}
//	public static void startTournament(){
//		totalGames = 0;
//		totalGoals = 0;
//	}
	
//	public int totalGames(){
//		return official.getTotalGames();
//	}
//	public int totalGoals(){
//		return official.getTotalGoals();
//	}
	public TournamentOfficial official(){
		return official;
	}
	
}


