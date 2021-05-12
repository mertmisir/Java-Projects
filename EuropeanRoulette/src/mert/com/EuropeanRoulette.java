package mert.com;
import java.util.Random;
import java.util.Scanner;
public class EuropeanRoulette {

	public static void main(String[] args) {
		String option;	
		Scanner input = new Scanner(System.in);
		int balance = 1000;

		do
		{
		System.out.println("ROULETTE GAME");
		System.out.println("You have " + balance + " balance");
		System.out.println("Menu");
		System.out.println("1.Only numbers");
		System.out.println("2.Only colors");
		System.out.println("Select one option to bet(press 1 or 2 - Q to quit):");
		option = input.next();
		
		switch(option)
		{
			case "1":
				System.out.println("Only numbers is selected");
				System.out.println("Write your number(0-36):");
				int number = input.nextInt();
				System.out.println("Put your bet(not more than 100TL):");
				int bett = input.nextInt();
				if(bett > 100)
				{
					System.out.println("You are not allowed to enter bet more than 100TL.");
				}

				balance = balance - bett;
				System.out.println("You have " + balance + "TL in your balance");
				onlyNumbers(bett,balance,number);
			break;
			
			case "2":
				System.out.println("Write your color(Red or Black):");
				String color = input.next();
				System.out.println("Put your bet(not more than 100TL):");
				int bet = input.nextInt();
				if(bet > 100)
				{
					System.out.println("You are not allowed to enter bet more than 100TL.");
				}

				balance = balance - bet;
				onlyColors(color,bet,balance);
			break;
				
			default :
				System.out.println("Come again please!");
				System.exit(1);
			break;
		}
		
		
		}while (option != "Q" || option != "q" );	
	 
	}//main class ends
	
		static void onlyNumbers(int bett,int balance,int number)
		{	Random random = new Random();
			Scanner input = new Scanner(System.in);
			int dice =  random.nextInt(36);
			System.out.println("Press any key to turn the Wheel.");
			String wheel =  input.next();
			if(number == dice)
			{
				System.out.println("YOU WIN!");
				System.out.println("Number: " + dice);
				balance = balance + (bett*36);
				System.out.println("Balance= "+ balance);
			}
			else
			{
				System.out.println("YOU LOSE!");
				System.out.println("Number: " + dice);
				balance = balance - bett;
				System.out.println("Balance= "+ balance);
			}
		}//onlyNumbers ends.
		
		static void onlyColors(String color, int bet, int balance)
		{
			Random random = new Random();
			Scanner input = new Scanner(System.in);
			int dice =  random.nextInt(2) + 1;  // 1 for red - 2 for black colors
			System.out.println("Press any key to turn the Wheel.");
			String wheel =  input.next();  
			String flag = new String();
			if(dice == 1 )
			{
				flag = "red";
				System.out.println("Color: " + flag);
				
			}
			else
			{
				flag = "black";
				System.out.println("Color: " + flag);
				
			}
			if (flag.equals(color))
			{
				System.out.println("YOU WIN!");
				balance = balance + (bet *2);
				System.out.println("Balance: " + balance);
			}
			else 
			{
				System.out.println("You lost!");
			}
		}//onlyColors ends.
}
