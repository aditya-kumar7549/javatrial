

import java.util.Scanner;
class YoungerAgeException extends RuntimeException
{
	YoungerAgeException(String msg)
	{
		super(msg);
	}
} // end of class YoungerAgeException

class prg4
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age:");
		int age = sc.nextInt();
		if(age < 18)
		throw new YoungerAgeException("Not eligible for voting");
		else
		System.out.println("Eligible for voting");
	} // end of main()
} // end of class prg4
