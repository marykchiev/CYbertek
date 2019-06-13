package Day54;

public class SoccerClub {
int playerCount;
String name;
Stadium stadium;

public SoccerClub(int playerCount, String name, Stadium stadium) {
	this.playerCount = playerCount;
	this.name = name;
	this.stadium = stadium;
}

public int getPlayerCount() {
	return playerCount;
}

public void setPlayerCount(int playerCount) {
	this.playerCount = playerCount;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Stadium getStadium() {
	return stadium;
}

public void setStadium(Stadium stadium) {
	this.stadium = stadium;
}


public String toString() {
	return "SoccerClub [playerCount=" + playerCount + ", name=" + name + ", stadium=" + stadium + "]";
}

public static void main(String[] args) {
	//
	Stadium StanfordBridge= new Stadium(40000,"Stanford Bridge");
	System.out.println(StanfordBridge.toString());
	SoccerClub s1= new SoccerClub(25, "Chelsea", StanfordBridge);
	System.out.println(s1.toString());
	
	
}



}
