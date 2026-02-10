import java.util.*;

public class Menu
{
	public static void main(String[] args)
	{
		Scanner keyboard=new Scanner(System.in);

		System.out.println("Choose an item on the menu.");
		System.out.println("1. Cheeseburger");
		System.out.println("2. Burrito");
		System.out.println("3. Quesadilla");
		System.out.println("4. Tacos");

		int menuNumber=keyboard.nextInt();
		System.out.println();

		switch (menuNumber)
		{
			case 1:
				System.out.println("Congrats! You have ordered a Cheesburger!");
			break;

			case 2:
				System.out.println("Congrats! You have ordered a Burrito!");
			break;

			case 3:
				System.out.println("Congrats! You have ordered a Quesadilla!");
			break;

			case 4:
				System.out.println("Congrats! You have ordered Tacos!");
			break;

			default:
				System.out.println("Invalid Menu Number. Please try again.");
		}

		keyboard.close();
	}
}
