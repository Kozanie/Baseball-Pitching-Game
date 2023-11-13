import java.util.ArrayList;
import java.util.Scanner;
public class PitcherGame
	{
		
		public static void main(String[] args)
			{
			intro();
			startGame();
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
		
		public static void startGame()
			{
			Scanner userInput = new Scanner(System.in);
			System.out.println("What pitch would you like to throw \n\n \n(1) Four-Seam Fastball \n(2) Cutter \n(3) Splitter \n(4) Sinker \n(5) Curveball \n(6) Sweeper");
			System.out.println("\nPlease input the number ex: 1");
			int pitch = userInput.nextInt();
			}
		
		public static void fourSeam()
			{
			System.out.println("Shohei Ohtani will throw a Four-Seam Fastball");
			}
		
		public static void cutter()
			{
			System.out.println("Shohei Ohtani will throw a Cutter");
			}
		
		public static void splitter()
			{
			System.out.println("Shohei Ohtani will throw a Splitter");
			}
		
		public static void sinker()
			{
			System.out.println("Shohei Ohtani will throw a Sinker");
			}
		
		public static void curve()
			{
			System.out.println("Shohei Ohtani will throw a Curve");
			}
		
		public static void slider()
			{
			System.out.println("Shohei Ohtani will throw a Sweeper");
			}
	}
