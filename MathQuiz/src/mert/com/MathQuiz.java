package mert.com;
import java.util.Scanner;
import java.util.Random;

public class MathQuiz {
	static Scanner myObj = new Scanner(System.in);
	static String name;
	public static void main(String[] args) {
		

		 System.out.println("MATH QUIZZES");
		 System.out.print("Write your name and surname:");
		 name = myObj.nextLine();

		 
	     while(true)
		 {
			 System.out.println("Select a quiz below(+,-,*,/) or q to quit");
			 System.out.println("1. Addition");
			 System.out.println("2. Subtraction");
			 System.out.println("3. Multiplication");
			 System.out.println("4. Division");
			 String operator = myObj.next();

			 try 
			 {
				 String level;
				 if(operator.equals("q"))
				 {
					 System.out.println("Goodbye!");
					 System.exit(0);
				 }
				 else if(operator.equals("+"))
				 {
					 boolean flag = false;
					 String option;
					 while (flag == false)
					 {
						 try 
						 {
							 System.out.println("Select difficulty level (Easy, Medium, Hard):");
							 level = myObj.next();
							 
							 if(!level.equalsIgnoreCase("easy") && !level.equalsIgnoreCase("medium")  && !level.equalsIgnoreCase("hard"))
								 throw new IllegalArgumentException();
							 else
								 flag = true;
							 
							 if (level.equalsIgnoreCase("easy"))
							 {
								 
								 EasyAddition();
								 
							 }
							 else if (level.equalsIgnoreCase("medium"))
							 {
								 
								 MediumAddition();
								 
							 }
							 else
							 {
								 HardAddition();
							 }
									 
						 }
						 catch(IllegalArgumentException i)
						 {
							 System.out.println("You should use one the following words only: “ Easy ” , ” Medium “ , ” Hard ”.");
						 }
					 }
					 System.out.print("Do you want to continue ( Y/N ) ?");
					 option = myObj.next();
					 if(option.equalsIgnoreCase("Y"))
						 continue;
					 else if (option.equalsIgnoreCase("N"))
					 {
						 System.out.println("Have a successful academic career in your future!");
						 break;
					 }
						 
				
				 }
				 else if (operator.equals("-"))
				 {
					 boolean flag = false;
					 String option;
					 while (flag == false)
					 {
						 try 
						 {
							 System.out.println("Select difficulty level (Easy, Medium, Hard):");
							 level = myObj.next();
							 
							 if(!level.equalsIgnoreCase("easy") && !level.equalsIgnoreCase("medium")  && !level.equalsIgnoreCase("hard"))
								 throw new IllegalArgumentException();
							 else
								 flag = true;
							 
							 if (level.equalsIgnoreCase("easy"))
							 {
								 
								 EasySub();
								 
							 }
							 else if (level.equalsIgnoreCase("medium"))
							 {
								 
								 MediumSub();
								 
							 }
							 else
							 {
								 HardSub();
							 }
									 
						 }
						 catch(IllegalArgumentException i)
						 {
							 System.out.println("You should use one the following words only: “ Easy ” , ” Medium “ , ” Hard ”.");
						 }
					 }
					 System.out.print("Do you want to continue ( Y/N ) ?");
					 option = myObj.next();
					 if(option.equalsIgnoreCase("Y"))
						 continue;
					 else if (option.equalsIgnoreCase("N"))
					 {
						 System.out.println("Have a successful academic career in your future!");
						 break;
					 }
				 }
				 
				 else if (operator.equals("/"))
				 {
					 boolean flag = false;
					 String option;
					 while (flag == false)
					 {
						 try 
						 {
							 System.out.println("Select difficulty level (Easy, Medium, Hard):");
							 level = myObj.next();
							 
							 if(!level.equalsIgnoreCase("easy") && !level.equalsIgnoreCase("medium")  && !level.equalsIgnoreCase("hard"))
								 throw new IllegalArgumentException();
							 else
								 flag = true;
							 
							 if (level.equalsIgnoreCase("easy"))
							 {
								 
								 EasyDiv();
								 
							 }
							 else if (level.equalsIgnoreCase("medium"))
							 {
								 
								 MediumDiv();
								 
							 }
							 else
							 {
								 HardDiv();
							 }
									 
						 }
						 catch(IllegalArgumentException i)
						 {
							 System.out.println("You should use one the following words only: “ Easy ” , ” Medium “ , ” Hard ”.");
						 }
					 }
					 System.out.print("Do you want to continue ( Y/N ) ?");
					 option = myObj.next();
					 if(option.equalsIgnoreCase("Y"))
						 continue;
					 else if (option.equalsIgnoreCase("N"))
					 {
						 System.out.println("Have a successful academic career in your future!");
						 break;
					 }
				 }
				 else if (operator.equals("*"))
				 {
					 boolean flag = false;
					 String option;
					 while (flag == false)
					 {
						 try 
						 {
							 System.out.println("Select difficulty level (Easy, Medium, Hard):");
							 level = myObj.next();
							 
							 if(!level.equalsIgnoreCase("easy") && !level.equalsIgnoreCase("medium")  && !level.equalsIgnoreCase("hard"))
								 throw new IllegalArgumentException();
							 else
								 flag = true;
							 
							 if (level.equalsIgnoreCase("easy"))
							 {
								 
								 EasyMulti();
								 
							 }
							 else if (level.equalsIgnoreCase("medium"))
							 {
								 
								 MediumMulti();
								 
							 }
							 else
							 {
								 HardMulti();
							 }
									 
						 }
						 catch(IllegalArgumentException i)
						 {
							 System.out.println("You should use one the following words only: “ Easy ” , ” Medium “ , ” Hard ”.");
						 }
					 }
					 System.out.print("Do you want to continue ( Y/N ) ?");
					 option = myObj.next();
					 if(option.equalsIgnoreCase("Y"))
						 continue;
					 else if (option.equalsIgnoreCase("N"))
					 {
						 System.out.println("Have a successful academic career in your future!");
						 break;
					 }
				 }
				 else
					 throw new IllegalArgumentException();
				 
			 }
			 
			 catch(IllegalArgumentException e)
			 {
				 System.out.println("You should use one of the following operators only: “ + ” , ” - “ , ” * ” , ” / ”");
			 }
			 
			
			 
			 
				 
		 }
			 
		}
	static void EasyAddition()
	{
		 int num1,num2,user_answer,correct_answer,counter=0;
		 int [] user_answers = new int [11];
		 int [] correct_answers = new int [11];
		 int [] first_nums = new int [11];
		 int [] second_nums = new int [11];
		 boolean sign;
		 boolean [] signs = new boolean [11];
		  System.out.println("Questions");
		 //for the answers and storing these data
		 for(int i=1; i<=10 ; i++)
		 {
			 num1 = (int)(Math.random() * 9) ;
			 first_nums[i] = num1;
			 num2 = (int)(Math.random() * 9) ;
			 second_nums[i] = num2;
			 System.out.print(i + ". " + num1 + "+" + num2 + "=");
			 user_answer = myObj.nextInt();
			 user_answers[i] = user_answer;
			 correct_answer = num1+num2;
			 correct_answers[i] = correct_answer;
			 if (user_answers[i] == correct_answers[i])
			 {
				 sign = true;
				 counter++;
			 }
				 
			 else
				 sign = false;
				 
			 signs[i] = sign;

		 }
		 //for the answers
		 System.out.println("Results:");
		 System.out.println("Question\t" +"Your Answer\t" + "Correct Answer\t" + "True/False");
		 for(int i=1; i<=10; i++)
		 {
			 
			 System.out.println(i + ". " + first_nums[i] + "+" + second_nums[i] + "\t\t" + user_answers[i] + "\t\t" + correct_answers[i] + "\t\t"  + signs[i]  );

		 }
		 System.out.println(name + ", " + "you got " + counter + "/10.");
	}
	static void  MediumAddition()
	{
		int num1,num2,user_answer,correct_answer,counter=0;
		 int [] user_answers = new int [11];
		 int [] correct_answers = new int [11];
		 int [] first_nums = new int [11];
		 int [] second_nums = new int [11];
		 boolean sign;
		 boolean [] signs = new boolean [11];
		  System.out.println("Questions");
		 //for the answers and storing these data
		 for(int i=1; i<=10 ; i++)
		 {
			 num1 = (int)(Math.random() * 89) + 10 ;
			 first_nums[i] = num1;
			 num2 = (int)(Math.random() * 89) + 10 ;
			 second_nums[i] = num2;
			 System.out.print(i + ". " + num1 + "+" + num2 + "=");
			 user_answer = myObj.nextInt();
			 user_answers[i] = user_answer;
			 correct_answer = num1+num2;
			 correct_answers[i] = correct_answer;
			 if (user_answers[i] == correct_answers[i])
			 {
				 sign = true;
				 counter++;
			 }
				 
			 else
				 sign = false;
				 
			 signs[i] = sign;

		 }
		 //for the answers
		 System.out.println("Results:");
		 System.out.println("Question\t" +"Your Answer\t" + "Correct Answer\t" + "True/False");
		 for(int i=1; i<=10; i++)
		 {
			 
			 System.out.println(i + ". " + first_nums[i] + "+" + second_nums[i] + "\t\t" + user_answers[i] + "\t\t" + correct_answers[i] + "\t\t"  + signs[i]  );

		 }
		 System.out.println(name + ", " + "you got " + counter + "/10.");
	}
	static void HardAddition()
	{
		int num1,num2,user_answer,correct_answer,counter=0;
		 int [] user_answers = new int [11];
		 int [] correct_answers = new int [11];
		 int [] first_nums = new int [11];
		 int [] second_nums = new int [11];
		 boolean sign;
		 boolean [] signs = new boolean [11];
		  System.out.println("Questions");
		 //for the answers and storing these data
		  Random rand = new Random();
		 for(int i=1; i<=10 ; i++)
		 {
			 num1 = rand.nextInt(99 + 99 ) - 99; // (max-min) + min
			 first_nums[i] = num1;
			 num2 = rand.nextInt(99 + 99 ) - 99;
			 second_nums[i] = num2;
			 System.out.print(i + ". " + num1 + "+" + num2 + "=");
			 user_answer = myObj.nextInt();
			 user_answers[i] = user_answer;
			 correct_answer = num1+num2;
			 correct_answers[i] = correct_answer;
			 if (user_answers[i] == correct_answers[i])
			 {
				 sign = true;
				 counter++;
			 }
				 
			 else
				 sign = false;
				 
			 signs[i] = sign;

		 }
		 //for the answers
		 System.out.println("Results:");
		 System.out.println("Question\t" +"Your Answer\t" + "Correct Answer\t" + "True/False");
		 for(int i=1; i<=10; i++)
		 {
			 
			 System.out.println(i + ". " + first_nums[i] + "+" + second_nums[i] + "\t\t" + user_answers[i] + "\t\t" + correct_answers[i] + "\t\t"  + signs[i]  );

		 }
		 System.out.println(name + ", " + "you got " + counter + "/10.");
	}
	static void EasySub()
	{
		int num1,num2,user_answer,correct_answer,counter=0;
		 int [] user_answers = new int [11];
		 int [] correct_answers = new int [11];
		 int [] first_nums = new int [11];
		 int [] second_nums = new int [11];
		 boolean sign;
		 boolean [] signs = new boolean [11];
		  System.out.println("Questions");
		 //for the answers and storing these data
		 for(int i=1; i<=10 ; i++)
		 {
			 num1 = (int)(Math.random() * 9) ;
			 first_nums[i] = num1;
			 num2 = (int)(Math.random() * 9) ;
			 second_nums[i] = num2;
			 if(num1>num2)  // no negative result is allowed in easy substituion.
			 {
				 System.out.print(i + ". " + num1 + "-" + num2 + "=");
				 user_answer = myObj.nextInt();
				 correct_answer = num1-num2;
			 }
			 else
			 {
				 System.out.print(i + ". " + num2 + "-" + num1 + "=");
				 user_answer = myObj.nextInt();
				 correct_answer = num2-num1;
			 }
			 user_answers[i] = user_answer;
			 correct_answers[i] = correct_answer;
			 if (user_answers[i] == correct_answers[i])
			 {
				 sign = true;
				 counter++;
			 }
				 
			 else
				 sign = false;
				 
			 signs[i] = sign;

		 }
		 //for the answers
		 System.out.println("Results:");
		 System.out.println("Question\t" +"Your Answer\t" + "Correct Answer\t" + "True/False");
		 for(int i=1; i<=10; i++)
		 {
			 if(first_nums[i] > second_nums[i])// no negative result is allowed in easy substituion.
				 System.out.println(i + ". " + first_nums[i] + "-" + second_nums[i] + "\t\t" + user_answers[i] + "\t\t" + correct_answers[i] + "\t\t"  + signs[i]  );
			 else
				 System.out.println(i + ". " + second_nums[i] + "-" + first_nums[i] + "\t\t" + user_answers[i] + "\t\t" + correct_answers[i] + "\t\t"  + signs[i]  );
		 }
		 System.out.println(name + ", " + "you got " + counter + "/10.");
	}
	static void MediumSub()
	{
		int num1,num2,user_answer,correct_answer,counter=0;
		 int [] user_answers = new int [11];
		 int [] correct_answers = new int [11];
		 int [] first_nums = new int [11];
		 int [] second_nums = new int [11];
		 boolean sign;
		 boolean [] signs = new boolean [11];
		  System.out.println("Questions");
		 //for the answers and storing these data
		 for(int i=1; i<=10 ; i++)
		 {
			 num1 = (int)(Math.random() * 89) + 10 ;
			 first_nums[i] = num1;
			 num2 = (int)(Math.random() * 89) + 10 ;
			 second_nums[i] = num2;
			 if(num1>num2)  // no negative result is allowed in medium substituion.
			 {
				 System.out.print(i + ". " + num1 + "-" + num2 + "=");
				 user_answer = myObj.nextInt();
				 correct_answer = num1-num2;
			 }
			 else
			 {
				 System.out.print(i + ". " + num2 + "-" + num1 + "=");
				 user_answer = myObj.nextInt();
				 correct_answer = num2-num1;
			 }
			 user_answers[i] = user_answer;
			 correct_answers[i] = correct_answer;
			 if (user_answers[i] == correct_answers[i])
			 {
				 sign = true;
				 counter++;
			 }
				 
			 else
				 sign = false;
				 
			 signs[i] = sign;

		 }
		 //for the answers
		 System.out.println("Results:");
		 System.out.println("Question\t" +"Your Answer\t" + "Correct Answer\t" + "True/False");
		 for(int i=1; i<=10; i++)
		 {
			 if(first_nums[i] > second_nums[i])// no negative result is allowed in medium substituion.
				 System.out.println(i + ". " + first_nums[i] + "-" + second_nums[i] + "\t\t" + user_answers[i] + "\t\t" + correct_answers[i] + "\t\t"  + signs[i]  );
			 else
				 System.out.println(i + ". " + second_nums[i] + "-" + first_nums[i] + "\t\t" + user_answers[i] + "\t\t" + correct_answers[i] + "\t\t"  + signs[i]  );
		 }
		 System.out.println(name + ", " + "you got " + counter + "/10.");
	}
	static void HardSub()
	{
		int num1,num2,user_answer,correct_answer,counter=0;
		 int [] user_answers = new int [11];
		 int [] correct_answers = new int [11];
		 int [] first_nums = new int [11];
		 int [] second_nums = new int [11];
		 boolean sign;
		 boolean [] signs = new boolean [11];
		  System.out.println("Questions");
		 //for the answers and storing these data
		  Random rand = new Random();
		 for(int i=1; i<=10 ; i++)
		 {
			 num1 = rand.nextInt(99 + 99 ) - 99; // (max-min) + min
			 first_nums[i] = num1;
			 num2 = rand.nextInt(99 + 99 ) - 99;
			 second_nums[i] = num2;
			 System.out.print(i + ". " + num1 + "(-)" + num2 + "=");
			 user_answer = myObj.nextInt();
			 user_answers[i] = user_answer;
			 correct_answer = num1-num2;
			 correct_answers[i] = correct_answer;
			 if (user_answers[i] == correct_answers[i])
			 {
				 sign = true;
				 counter++;
			 }
				 
			 else
				 sign = false;
				 
			 signs[i] = sign;

		 }
		 //for the answers
		 System.out.println("Results:");
		 System.out.println("Question\t" +"Your Answer\t" + "Correct Answer\t" + "True/False");
		 for(int i=1; i<=10; i++)
		 {
			 
			 System.out.println(i + ". " + first_nums[i] + "(-)" + second_nums[i] + "\t\t" + user_answers[i] + "\t\t" + correct_answers[i] + "\t\t"  + signs[i]  );

		 }
		 System.out.println(name + ", " + "you got " + counter + "/10.");
	}
	static void EasyMulti()
	{
		int num1,num2,user_answer,correct_answer,counter=0;
		 int [] user_answers = new int [11];
		 int [] correct_answers = new int [11];
		 int [] first_nums = new int [11];
		 int [] second_nums = new int [11];
		 boolean sign;
		 boolean [] signs = new boolean [11];
		  System.out.println("Questions");
		 //for the answers and storing these data
		 for(int i=1; i<=10 ; i++)
		 {
			 num1 = (int)(Math.random() * 9) ;
			 first_nums[i] = num1;
			 num2 = (int)(Math.random() * 9) ;
			 second_nums[i] = num2;
			 System.out.print(i + ". " + num1 + "*" + num2 + "=");
			 user_answer = myObj.nextInt();
			 user_answers[i] = user_answer;
			 correct_answer = num1*num2;
			 correct_answers[i] = correct_answer;
			 if (user_answers[i] == correct_answers[i])
			 {
				 sign = true;
				 counter++;
			 }
				 
			 else
				 sign = false;
				 
			 signs[i] = sign;

		 }
		 //for the answers
		 System.out.println("Results:");
		 System.out.println("Question\t" +"Your Answer\t" + "Correct Answer\t" + "True/False");
		 for(int i=1; i<=10; i++)
		 {
			 
			 System.out.println(i + ". " + first_nums[i] + "*" + second_nums[i] + "\t\t" + user_answers[i] + "\t\t" + correct_answers[i] + "\t\t"  + signs[i]  );

		 }
		 System.out.println(name + ", " + "you got " + counter + "/10.");
	}
	static void MediumMulti()
	{
		int num1,num2,user_answer,correct_answer,counter=0;
		 int [] user_answers = new int [11];
		 int [] correct_answers = new int [11];
		 int [] first_nums = new int [11];
		 int [] second_nums = new int [11];
		 boolean sign;
		 boolean [] signs = new boolean [11];
		  System.out.println("Questions");
		 //for the answers and storing these data
		 for(int i=1; i<=10 ; i++)
		 {
			 num1 = (int)(Math.random() * 89) + 10 ;
			 first_nums[i] = num1;
			 num2 = (int)(Math.random() * 89) + 10 ;
			 second_nums[i] = num2;
			 System.out.print(i + ". " + num1 + "*" + num2 + "=");
			 user_answer = myObj.nextInt();
			 user_answers[i] = user_answer;
			 correct_answer = num1*num2;
			 correct_answers[i] = correct_answer;
			 if (user_answers[i] == correct_answers[i])
			 {
				 sign = true;
				 counter++;
			 }
				 
			 else
				 sign = false;
				 
			 signs[i] = sign;

		 }
		 //for the answers
		 System.out.println("Results:");
		 System.out.println("Question\t" +"Your Answer\t" + "Correct Answer\t" + "True/False");
		 for(int i=1; i<=10; i++)
		 {
			 
			 System.out.println(i + ". " + first_nums[i] + "*" + second_nums[i] + "\t\t" + user_answers[i] + "\t\t" + correct_answers[i] + "\t\t"  + signs[i]  );

		 }
		 System.out.println(name + ", " + "you got " + counter + "/10.");
	}
	static void HardMulti()
	{
		int num1,num2,user_answer,correct_answer,counter=0;
		 int [] user_answers = new int [11];
		 int [] correct_answers = new int [11];
		 int [] first_nums = new int [11];
		 int [] second_nums = new int [11];
		 boolean sign;
		 boolean [] signs = new boolean [11];
		  System.out.println("Questions");
		 //for the answers and storing these data
		  Random rand = new Random();
		 for(int i=1; i<=10 ; i++)
		 {
			 num1 = rand.nextInt(99 + 99 ) - 99; // (max-min) + min
			 first_nums[i] = num1;
			 num2 = rand.nextInt(99 + 99 ) - 99;
			 second_nums[i] = num2;
			 System.out.print(i + ". " + num1 + "*" + num2 + "=");
			 user_answer = myObj.nextInt();
			 user_answers[i] = user_answer;
			 correct_answer = num1*num2;
			 correct_answers[i] = correct_answer;
			 if (user_answers[i] == correct_answers[i])
			 {
				 sign = true;
				 counter++;
			 }
				 
			 else
				 sign = false;
				 
			 signs[i] = sign;

		 }
		 //for the answers
		 System.out.println("Results:");
		 System.out.println("Question\t" +"Your Answer\t" + "Correct Answer\t" + "True/False");
		 for(int i=1; i<=10; i++)
		 {
			 
			 System.out.println(i + ". " + first_nums[i] + "*" + second_nums[i] + "\t\t" + user_answers[i] + "\t\t" + correct_answers[i] + "\t\t"  + signs[i]  );

		 }
		 System.out.println(name + ", " + "you got " + counter + "/10.");
	}
	static void EasyDiv()
	{	 //NOTE: it does only integer division. So enter your results as an integer!
		 int num1,num2,user_answer,correct_answer,counter=0;
		 int [] user_answers = new int [11];
		 int [] correct_answers = new int [11];
		 int [] first_nums = new int [11];
		 int [] second_nums = new int [11];
		 boolean sign;
		 boolean [] signs = new boolean [11];
		 
		  System.out.println("Questions");
		 //for the answers and storing these data
	 for(int i=1; i<=10 ; i++)
	 {
		try
		 {
			 num1 = (int)(Math.random() * 9);
			 first_nums[i] = num1;
			 num2 = (int)(Math.random() * 9);
			 second_nums[i] = num2;
				 System.out.print(i + ". " + num1 + "/" + num2 + "=");
				 user_answer = myObj.nextInt();
				 user_answers[i] = user_answer;
				 correct_answer = num1/num2;
				 if(num2 == 0)
					 throw new ArithmeticException();
				 correct_answers[i] = correct_answer;
				 if (user_answers[i] == correct_answers[i])
				 {
					 sign = true;
					 counter++;
				 }
					 
				 else
					 sign = false;
					 
				 signs[i] = sign;
		 }
		catch (ArithmeticException e)
		{
			System.out.println("Division by zero impossible!");
		}
	}

		 //for the answers
		 System.out.println("Results:");
		 System.out.println("Question\t" +"Your Answer\t" + "Correct Answer\t" + "True/False");
		 for(int i=1; i<=10; i++)
		 {
			 
			 System.out.println(i + ". " + first_nums[i] + "/" + second_nums[i] + "\t\t" + user_answers[i] + "\t\t" + correct_answers[i] + "\t\t"  + signs[i]  );

		 }
		 System.out.println(name + ", " + "you got " + counter + "/10.");
	}
	static void MediumDiv()
	{
		//NOTE: it does only integer division. So enter your results as an integer!
		 int num1,num2,user_answer,correct_answer,counter=0;
		 int [] user_answers = new int [11];
		 int [] correct_answers = new int [11];
		 int [] first_nums = new int [11];
		 int [] second_nums = new int [11];
		 boolean sign;
		 boolean [] signs = new boolean [11];
		 
		  System.out.println("Questions");
		 //for the answers and storing these data
	 for(int i=1; i<=10 ; i++)
	 {
		try
		 {
			 num1 = (int)(Math.random() * 89) + 10;
			 first_nums[i] = num1;
			 num2 = (int)(Math.random() * 89) + 10;
			 second_nums[i] = num2;
				 System.out.print(i + ". " + num1 + "/" + num2 + "=");
				 user_answer = myObj.nextInt();
				 user_answers[i] = user_answer;
				 correct_answer = num1/num2;
				 if(num2 == 0)
					 throw new ArithmeticException();
				 correct_answers[i] = correct_answer;
				 if (user_answers[i] == correct_answers[i])
				 {
					 sign = true;
					 counter++;
				 }
					 
				 else
					 sign = false;
					 
				 signs[i] = sign;
		 }
		catch (ArithmeticException e)
		{
			System.out.println("Division by zero impossible!");
		}
	}

		 //for the answers
		 System.out.println("Results:");
		 System.out.println("Question\t" +"Your Answer\t" + "Correct Answer\t" + "True/False");
		 for(int i=1; i<=10; i++)
		 {
			 
			 System.out.println(i + ". " + first_nums[i] + "/" + second_nums[i] + "\t\t" + user_answers[i] + "\t\t" + correct_answers[i] + "\t\t"  + signs[i]  );

		 }
		 System.out.println(name + ", " + "you got " + counter + "/10.");
	}
	static void HardDiv()
	{
		//NOTE: it does only integer division. So enter your results as an integer!
		 int num1,num2,user_answer,correct_answer,counter=0;
		 int [] user_answers = new int [11];
		 int [] correct_answers = new int [11];
		 int [] first_nums = new int [11];
		 int [] second_nums = new int [11];
		 boolean sign;
		 boolean [] signs = new boolean [11];
		 
		  System.out.println("Questions");
		 //for the answers and storing these data
		  Random random = new Random();
	 for(int i=1; i<=10 ; i++)
	 {
		try
		 {
			 num1 = random.nextInt(99 + 99 ) - 99; // (max-min) + min
			 first_nums[i] = num1;
			 num2 = random.nextInt(99 + 99 ) - 99; // (max-min) + min
			 second_nums[i] = num2;
				 System.out.print(i + ". " + num1 + "/" + num2 + "=");
				 user_answer = myObj.nextInt();
				 user_answers[i] = user_answer;
				 correct_answer = num1/num2;
				 if(num2 == 0)
					 throw new ArithmeticException();
				 correct_answers[i] = correct_answer;
				 if (user_answers[i] == correct_answers[i])
				 {
					 sign = true;
					 counter++;
				 }
					 
				 else
					 sign = false;
					 
				 signs[i] = sign;
		 }
		catch (ArithmeticException e)
		{
			System.out.println("Division by zero impossible!");
		}
	}

		 //for the answers
		 System.out.println("Results:");
		 System.out.println("Question\t" +"Your Answer\t" + "Correct Answer\t" + "True/False");
		 for(int i=1; i<=10; i++)
		 {
			 
			 System.out.println(i + ". " + first_nums[i] + "/" + second_nums[i] + "\t\t" + user_answers[i] + "\t\t" + correct_answers[i] + "\t\t"  + signs[i]  );

		 }
		 System.out.println(name + ", " + "you got " + counter + "/10.");
	}
	}


