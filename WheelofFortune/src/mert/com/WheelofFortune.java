package mert.com;
import java.util.Random;
import java.util.Scanner;
public class WheelofFortune {

	public static void main(String[] args) {
		int balance = 10000;
		Scanner myObj = new Scanner(System.in);
		do
		{
			System.out.println("Welcome to the Wheel of Fortune game!");
			System.out.println("Your balance: " + balance + " TL");
			System.out.println("Press any key to turn the wheel:");
			String input = myObj.next();
			Random random = new Random();
			int dice = random.nextInt(8) + 1;
			System.out.println("dice= " + dice);
			
			if( dice == 1 || dice == 7)
			{
				System.out.println(" congratulations you win 10000TL!");
				balance += 10000;
				System.out.println("Your balance: " + balance + " TL");
			
			}
			if( dice == 2 || dice == 5)
			{
				System.out.println(" congratulations you win 5000TL!");
				balance += 5000;
				System.out.println("Your balance: " + balance + " TL");
			}
			if( dice == 3 )
			{
				System.out.println(" congratulations you win 1000TL!");
				balance += 1000;
				System.out.println("Your balance: " + balance + " TL");
			}
			if( dice == 4 )
			{
				System.out.println("No win or loss!");
				System.out.println("Your balance: " + balance + " TL");
				continue;
			}
			if ( dice == 6)
			{

				System.out.print("head or tail(h/t)?");
				String ht_game = myObj.next();
				String temp = "t"; // temporary string to hold h.
				if(ht_game.equals(temp))
				{
					System.out.println("congratulations you win 10000TL!");
					balance += 10000;
					System.out.println("your balance: " + balance + " TL");
				}
				else
				{
					System.out.println("tail, sorry you lose!");
					System.out.println("your balance: " + balance + " TL");
				}
				
			}
			if( dice == 8)
			{
				System.out.println("sorry you lose!");
				balance = 0;
				System.out.println("your balance: " + balance);
				System.out.println("Come again!");
				System.exit(1);
			}
			
		} while( balance < 100000 );

	}


	}



