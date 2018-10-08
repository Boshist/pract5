package pract5;

import java.util.Scanner;

public class summ_num {
	
	public static void main(String[] args)
	{
		Scanner Reader = new Scanner(System.in);
		System.out.print("Enter an integer number:");
		int input = Reader.nextInt();
		input = SummNumberDigits(input);
		System.out.println("Summ of digits:"+input);
		Reader.close();
	}

	public static int SummNumberDigits(int num)
	{
		if (num/10==0)
		return num;
		return num%10+SummNumberDigits(num/10);
	}
}
