
public class Hitter
	{
	private String playerName;
    private int[][] swingPercent;
    private int[][] contactPercent;
    private int ballsInPlay;

    public Hitter(String p, int[][] s, int [][] c, int b)
        {
        playerName = p;
        swingPercent = s;
        contactPercent = c;
        ballsInPlay = b;
        }

    public String getPlayerName()
        {
        return playerName;
        }
    
    public int[][] getSwingPercent()
    	{
    	return swingPercent;
    	}
    
    public int[][] getContactPercent()
    	{
    	return contactPercent;
    	}
    
    public int getBallsInPlay()
    	{
    	return ballsInPlay;
    	}
    
	}
