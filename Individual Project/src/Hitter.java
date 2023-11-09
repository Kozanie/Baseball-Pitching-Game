
public class Hitter
	{
	private String playerName;
    private int batAvg;
    private int onBaseAvg;
    private int swingPercent;

    public Hitter(String p, int b, int o, int s)
        {
        playerName = p;
        batAvg = b;
        onBaseAvg = o;
        swingPercent = s;
        
        }

    public String getPlayerName()
        {
        return playerName;
        }

    public int getBatAvg()
        {
        return batAvg;
        }

    public int getOnBaseAvg()
        {
        return onBaseAvg;
        }
    
    public int swingPercent()
    	{
    	return swingPercent;
    	}
	}
