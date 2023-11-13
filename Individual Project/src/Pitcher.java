
public class Pitcher
	{
	private String name;
    private String team;
    private arrayList<Pitch>;
   
    public Pitcher(String n, String t, String p1N, int p1L, String p2N, int p2L, String p3N, int p3L, String p4N, int p4L, String p5N, int p5L, String p6N, int p6L)
        {
        name = n;
        team = t;
        p1Name = p1N;
        p1Location = p1L;
        p2Name = p2N;
        p2Location = p2L;
        p3Name = p3N;
        p3Location = p3L;
        p4Name = p4N;
        p4Location = p4L;
        p5Name = p5N;
        p5Location = p5L;
        p6Name = p6N;
        p6Location = p6L;
        }

    public String getName()
        {
        return name;
        }

    public String getTeam()
        {
        return team;
        }

    public String getp1Name()
        {
        return p1Name;
        }

    public int getp1Location()
    	{
    	return p1Location;
    	}

    public String getp2Name()
        {
        return p2Name;
        }

    public int getp2Location()
    	{
    	return p2Location;
    	}

    public String getp3Name()
        {
        return p3Name;
        }

    public int getp3Location()
    	{
    	return p3Location;
    	}

    public String getp4Name()
        {
        return p4Name;
        }

    public int getp4Location()
    	{
    	return p4Location;
    	}

    public String getp5Name()
        {
        return p5Name;
        }

    public int getp5Location()
    	{
    	return p5Location;
    	}

    public String getp6Name()
        {
        return p6Name;
        }

   public int getp6Location()
    	{
    	return p6Location;
    	}
	}
