import java.util.Scanner;

public class NBA {
	public static void main(String[] args) {
		
		//construct Team Heats
		NBATeam heat= new NBATeam("Heats");
		 System.out.print("How many players Heats own: ");
		 Scanner input = new Scanner (System.in);
		 int numberOfPlayers = input.nextInt();

		// Prompt user to enter players into the Team
		 for (int i = 0; i < numberOfPlayers; i++) {
		       System.out.print("Enter the name of Player #" + (i + 1) + ": ");
		       String playerName = input.next();
		       heat.addAPlayer(playerName);
		 }

		//construct Team Spurs
		// Prompt user to enter players into the Team
		NBATeam spurs= new NBATeam("Spurs");
		System.out.print("How many players Spurs own: ");
		numberOfPlayers = input.nextInt();

		// Prompt user to enter players into the Team
		 for (int i = 0; i < numberOfPlayers; i++) {
		       System.out.print("Enter the name of Player #" + (i + 1) + ": ");
		       String playerName = input.next();
		       spurs.addAPlayer(playerName);
		 }
		 System.out.println();
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
