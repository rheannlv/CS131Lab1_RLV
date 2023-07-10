
public abstract class SportsTeam { //class should be abstract
	protected String teamName;
	protected String teamMascot;
	protected String headCoach;
	protected int wins, losses;
	
	public SportsTeam() {
		teamName="";
		teamMascot="";
		headCoach="";
		wins=0;
		losses=0;
	}// end empty constructor
	
	public SportsTeam(String teamName, String teamMascot, String headCoach) {
		this.teamName = teamName;
		this.teamMascot = teamMascot;
		this.headCoach = headCoach;
		this.wins = 0;
		this.losses = 0;
	}// end preferred constructor
	
	//public abstract double getStats();
	
	public double getWinPercentage() {
		return wins/(wins + losses);
	}//end getWinP

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getTeamMascot() {
		return teamMascot;
	}

	public void setTeamMascot(String teamMascot) {
		this.teamMascot = teamMascot;
	}

	public String getHeadCoach() {
		return headCoach;
	}

	public void setHeadCoach(String headCoach) {
		this.headCoach = headCoach;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getLosses() {
		return losses;
	}

	public void setLosses(int losses) {
		this.losses = losses;
	}

	@Override
	public String toString() {
		return "SportsTeam [teamName=" + teamName + ", teamMascot=" + teamMascot + ", headCoach=" + headCoach
				+ ", wins=" + wins + ", losses=" + losses + "]";
	}//end toString
	
	
}// end class
