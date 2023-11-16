import java.util.ArrayList;
import java.util.Scanner;
public class PitcherGame
	{
	static ArrayList<Pitch> pitch = new ArrayList<Pitch>();
	static int[][] zone = new int[5][5];
	static int row;
	static int col;
	static int[] output = new int [2];
	static int percent;
		public static void main(String[] args)
			{
			intro();
			selectPitch();
			}
		
		public static void intro()
			{
			String dummy;
			Scanner userInput = new Scanner(System.in);
			
			System.out.println("You will be playing a baseball pitching simulator! You will be chosing what pitches you want to throw!");
			System.out.println("\nPress enter to continue!");
			dummy = userInput.nextLine();
			
			System.out.println("Shohei Ohtani will be pitching against Mike Trout. \n\nPress enter to continue.");
			dummy = userInput.nextLine();
			
			}
		
		public static void selectPitch()
			{
			Scanner userInput = new Scanner(System.in);
			System.out.println("What pitch would you like to throw \n\n \n(1) Four-Seam Fastball \n(2) Cutter \n(3) Splitter \n(4) Sinker \n(5) Curveball \n(6) Sweeper");
			System.out.println("\nPlease input the number ex: 1");
			int pitch = userInput.nextInt();
			
			if(pitch == 1)
				{
				fourSeam();
				}
			
			else if(pitch ==2)
				{
				cutter();
				}
			
			else if(pitch == 3)
				{
				splitter();
				}
			
			else if(pitch == 4)
				{
				sinker();
				}
			
			else if(pitch == 5)
				{
				curve();
				}
			
			else if(pitch == 6)
				{
				sweeper();
				}
		
			}
		
		public static int[] generateLocation()
			{
			int randomNumber = ((int)(Math.random()*1000+1));
			//System.out.println(randomNumber);
			output = new int [2];
			
			for(row = 0; row < 4; row++)
				{
				for(col = 0; col < 4; col++)
					{
					if(zone[row][col] >= randomNumber)
						{
						System.out.println(zone[row][col]);
						return output;
						}
					}
				}
			return output;
				}
		
		public static void swingContactPecrent()
			{
			percent = ((int)(Math.random()*100+1));
			System.out.println(percent);
			}
		
		public static void onBase()
			{
			int onBasePercent = ((int)(Math.random()*1000+1));
			
			if(onBasePercent < 335)
				{
				System.out.println("Trout made it on base");
				}
			
			else
				{
				System.out.println("Trout got out!!");
				}
			}
			
		public static void fourSeam()
			{
			System.out.println("Shohei Ohtani will throw a Four-Seam Fastball");
			zone = Data.fourSeamPitch;
			generateLocation();
			fourSeamSwing();
			}
		
		public static void cutter()
			{
			System.out.println("Shohei Ohtani will throw a Cutter");
			zone = Data.cutterPitch;
			generateLocation();
			}
		
		public static void splitter()
			{
			System.out.println("Shohei Ohtani will throw a Splitter");
			zone = Data.splitterPitch;
			generateLocation();
			}
		
		public static void sinker()
			{
			System.out.println("Shohei Ohtani will throw a Sinker");
			zone = Data.sinkerPitch;
			generateLocation();
			}
		
		public static void curve()
			{
			System.out.println("Shohei Ohtani will throw a Curve");
			zone = Data.curvePitch;
			generateLocation();
			}
		
		public static void sweeper()
			{
			System.out.println("Shohei Ohtani will throw a Sweeper");
			zone = Data.sweeperPitch;
			generateLocation();
			}
		
		public static void fourSeamSwing()
			{
			zone = Data.fourSeamSwing;
			System.out.println(Data.fourSeamSwing[row][col]);
			swingContactPecrent();
			if(Data.fourSeamSwing[row][col] > 1 && Data.fourSeamContact[row][col] > percent)
				{
				System.out.println("Trout is going to swing!!");
			fourSeamContact();
				}
			}
		
		public static void fourSeamContact()
			{
			zone = Data.fourSeamContact;
			System.out.println(Data.fourSeamContact[row][col]);
			swingContactPecrent();
			if(Data.fourSeamContact[row][col] > 1 && Data.fourSeamContact[row][col] > percent)
				{
				System.out.println("Trout made contact with the ball");
				onBase();
				}
			}
	}
