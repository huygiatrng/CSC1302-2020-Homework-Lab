import java.util.Scanner;

public class NBA {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		String ifAddPlayer;
		String playerName;
		
		//construct Team Heats
		System.out.println("Creat the NBA team of Heats ...... ");
		NBATeam heat= new NBATeam("Heats");
		
		System.out.print("Add a play to Heats? (yes/no): ");
		ifAddPlayer= input.next();
		while (ifAddPlayer.equalsIgnoreCase("yes")){
			System.out.print("What is the name to be added? ");
			playerName=input.next();
			heat.addAPlayer(playerName);
			System.out.print("Add one more play to Heats?(yes/no): ");
			ifAddPlayer= input.next();
		}
		
		System.out.println("Creat the NBA team of Spurs ...... ");
		NBATeam spurs= new NBATeam("Spurs");
		
		System.out.print("Add a play to Spurs? (yes/no): ");
		ifAddPlayer= input.next();
		while (ifAddPlayer.equalsIgnoreCase("yes")){
			System.out.print("What is the name to be added? ");
			playerName=input.next();
			spurs.addAPlayer(playerName);
			System.out.print("Add one more play to Spurs?(yes/no): ");
			ifAddPlayer= input.next();
		}
		
		System.out.println("Game on Now ......");
		 
		//simulate a series of atmost 7 games by generating a random number
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
