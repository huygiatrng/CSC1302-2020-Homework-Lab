import java.util.Scanner;

public class NBA {
	
	//Method to create Team, ask user to add player and check if user to add more player
	public static void createTeam(NBATeam team, Scanner input) {
		String playerName;
		String ifAddPlayer;
		
		System.out.println("Creat the NBA team of "+team.getName()+" ...... ");
		System.out.print("Add a play to "+team.getName()+"? (yes/no): ");
		ifAddPlayer= input.nextLine();
		while (ifAddPlayer.equalsIgnoreCase("yes")){
			System.out.print("What is the name to be added? ");
			playerName=input.nextLine();
			team.addAPlayer(playerName);
			System.out.print("Add one more play to "+team.getName()+"?(yes/no): ");
			ifAddPlayer= input.nextLine();
		}
	}
	
	public static void main(String[] args) {	
		Scanner input = new Scanner (System.in);
		String ifAddPlayer;
		String playerName;
		NBATeam heat= new NBATeam("Heats");
		NBATeam spurs= new NBATeam("Spurs");
		
		createTeam(heat,input);
		createTeam(spurs,input);
		
		System.out.println("Game on Now ......");
		 
		//simulate a series of at most 7 games by generating a random number
		//if the random number is bigger than 0.5, Heat wins; otherwise Heat losses a game
		//As soon as team wins 4 games, the series is over.
		
		for (int i=0; i<7; i++){
			if (Math.random()>0.5) heat.winAgame(spurs);
			else heat.lossAgame(spurs);
			
			if (heat.getWinNum()>=4) {
				System.out.println(heat.getName() + " ***WIN the series***");
				break;
			}
			if (spurs.getWinNum()>=4) {
				System.out.println(spurs.getName() + " ***WIN the series***");
				break;
			}
		}
		System.out.println(heat);
		System.out.println(spurs);

	}

}
