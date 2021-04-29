
public class NBATeam {
	private String sTeamName;
	private int nWin;
	private int nLoss;
	private String [] playerArray;
	
	public NBATeam (String s, int w, int l){
		sTeamName=s; nWin=w; nLoss=l;
	}

	public NBATeam (String s){
		sTeamName=s; nWin=0; nLoss=0;
	}

	public String getName(){
		return sTeamName;
	}

	public void setName(String s){
		sTeamName=s;
	}
	
	public int getWinNum(){
		return nWin;
	}
	
	public int getLossNum(){
		return nLoss;
	}
	
	public String toString(){
		
		String s= sTeamName + "[ ";
		for (int i=0;i<playerArray.length; i++) s=s+playerArray[i]+ " ";
		s+= "] win #: " + nWin + " los : " +nLoss;
		
		return s;
	}
	
	public void winAgame(NBATeam teamB){
		nWin++;
		teamB.lossAgame();
	}
	
	private void winAgame(){
		nWin++;
	}
	private void lossAgame(){
		nLoss++;
	}
	
	public void lossAgame(NBATeam teamB){
		nLoss++;
		teamB.winAgame();
	}
	public void addAPlayer(String newPlayerName){
		int newSize=0;
		
		if (playerArray==null) newSize=1;
		else newSize=playerArray.length + 1;
		
		String [] tmp=new String[newSize];
		
		if(playerArray!=null) { 
			for (int i=0; i<playerArray.length; i++)
				tmp[i]=playerArray[i];
		}
		
		tmp[newSize-1]=newPlayerName;
		
		playerArray=tmp;
	}
 
}
