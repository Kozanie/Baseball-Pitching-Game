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
			
			System.out.println("What pitch would you like to throw \n\n(1) Sweeper \n(2) Four-Seam Fastball \n(3) Cutter \n(4) Splitter \n(5) Sinker \n(6) Curveball \n(7) Slider");
			System.out.println("\nPlease input the number ex: 1");
			}
		
		public static void startGame()
			{
			
			}

	}
