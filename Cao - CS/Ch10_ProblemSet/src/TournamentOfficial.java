
public class TournamentOfficial {
	private int totalGames;
	private int totalGoals;
	
//	public TournamentOfficial(int a, int b){
//		totalGames = a;
//		totalGoals = b;
//	}
	public void totalGames(){
		totalGames++;
	}
	public void totalGoals(int myScore, int otherScore){
		totalGoals += myScore+ otherScore;
	}
	public int getTotalGoals(){
		return totalGoals;
	}
	public int getTotalGames(){
		return totalGames;
	}
}
