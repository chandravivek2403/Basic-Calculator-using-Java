package calculator;

import java.util.Scanner;

class allcalculator
{
	public int a;
	public int b;
	
	
	public void menu()
	{
		System.out.println("1--ADDITION OF 2 NUMBERS");
		System.out.println("2--SUBTRACTION OF 2 NUMBERS");
		System.out.println("3--MULTIPLICATION OF 2 NUMBERS");
		System.out.println("4--DIVISION OF 2 NUMBERS");
		System.out.println("5-- a power b ");
		System.out.println("6--SQUARE ROOT OF A NUMBERS");
		System.out.println("7--MAXIMUM OF 2 NUMBERS");
		System.out.println("8--MINIMUM OF 2 NUMBERS");
		System.out.println("9--SQUARE OF A NUMBERS");
		System.out.println("10--TO Exit");
		System.out.println("ENTER THE NUMBER THAT YOU WANTED TO PERFORM :");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		
		switch(choice)
		{
			case 1:
				addition();
				break;
			case 2:
				subtraction();
				break;
			case 3:
				multiplication();
				break;
			case 4:
				division();
				break;
			case 5:
				power();
				break;
			case 6:
				squareroot();
				break;
			case 7:
				maximum();
				break;
			case 8:
				minimum();
				break;
			case 9:
				square();
				break;
			case 10:
				exit();
				break;
			default:
				System.out.println("Enter a valid number");
				menu();
				break;
		}
		
		sc.close();
		
		
	}
	public void addition()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a :");
		a=sc.nextInt();
		System.out.println("Enter the value of b :");
		b=sc.nextInt();
		int add=a+b;
		System.out.println("SUM of a and b is : "+add);
		menu();
		sc.close();
		
		
	}
	
	public void subtraction()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a :");
		a=sc.nextInt();
		System.out.println("Enter the value of b :");
		b=sc.nextInt();
		int sub=a-b;
		System.out.println("SUBTRACTION of a and b is : "+sub);
		menu();
		sc.close();
		
	}
	
	public void multiplication()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a :");
		a=sc.nextInt();
		System.out.println("Enter the value of b :");
		b=sc.nextInt();
		int mul=a*b;
		System.out.println("MULTIPLICATION of a and b is : "+mul);
		menu();
		
		sc.close();
		
	}
	
	public void division()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a :");
		a=sc.nextInt();
		System.out.println("Enter the value of b :");
		b=sc.nextInt();
		int div=a/b;
		System.out.println("DIVISION of a and b is : "+div);
		menu();
		
		sc.close();
		
	}
	
	public void power()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a :");
		a=sc.nextInt();
		System.out.println("Enter the value of b :");
		b=sc.nextInt();
		int powervalue=(int) Math.pow(a, b);
		System.out.println("The value of a^b is :"+powervalue);
		menu();
		sc.close();
		
	}
	
	public void squareroot()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a :");
		a=sc.nextInt();
		double rootvalue=Math.sqrt(a);
		System.out.println("Square root value of"+a+"is"+rootvalue);
		menu();
		
		sc.close();
		
		
	}
	
	public void maximum()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a :");
		a=sc.nextInt();
		System.out.println("Enter the value of b :");
		b=sc.nextInt();
		int maximumvalue=Math.max(a, b);
		System.out.println("Maximum value amoung"+a+"and"+b+"is"+maximumvalue);
		menu();
		
		sc.close();
		
		
	}
	
	public void minimum()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a :");
		a=sc.nextInt();
		System.out.println("Enter the value of b :");
		b=sc.nextInt();
		int minimumnumber=Math.min(a, b);
		System.out.println("Minimum value amoung"+a+"and"+b+"is"+minimumnumber);
		menu();
		
		sc.close();
		
	}
	
	public void square()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a :");
		a=sc.nextInt();
	    int squareofnum=a*a;
	    System.out.println("Square of a"+a+"is :"+squareofnum);
	    menu();
	    
	    sc.close();
		
	}
	public void exit()
	{
		System.out.println("Exited from the program");
	}
	
}




public class Calculator {
	public static void main(String arg[])
	{
		allcalculator t=new allcalculator();
		t.menu();
		
	}

}
