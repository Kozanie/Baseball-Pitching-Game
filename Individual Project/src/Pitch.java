
public class Pitch
	{
	private String type;
	private int[][] zones;
	
	public Pitch(String t, int[][] z)
		{
		type = t;
		zones = z;
		}
	
	public String getType()
		{
		return type;
		}
	
	public int[][] getZones()
		{
		return zones;
		}
	}
