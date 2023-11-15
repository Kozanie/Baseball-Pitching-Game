import java.util.ArrayList;
public class Pitcher
	{
	private String name;
    private String team;
    private ArrayList<Pitch> pitch;
   
    public Pitcher(String n, String t, ArrayList<Pitch> p)
    	{
        name = n;
        team = t;
        pitch = p;
    	}
    
    public String getName()
    	{
    	return name;
    	}

    public String getTeam()
    	{
    	return team;
    	}
    
    public ArrayList<Pitch> getPitch()
    	{
    	return pitch;
    	}
    }
