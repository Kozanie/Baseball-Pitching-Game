import java.util.ArrayList;
import java.util.Scanner;
public class PitcherGame
	{
		
		public static void main(String[] args)
			{
			startGame();
			}
		
		public static void startGame()
			{
			String dummy;
			Scanner userInput = new Scanner(System.in);
			
			System.out.println("You will be playing a baseball pitching simulator! You will be chosing what pitches you want to throw!");
			System.out.println("\nPress enter to continue!");
			dummy = userInput.nextLine();
			
			System.out.println("Shohei Ohtani will be pitching against Mike Trout. \n\nPress enter to continue.");
			dummy = userInput.nextLine();
			}
		
		public static void playGame()
			{
			
			}

	}
