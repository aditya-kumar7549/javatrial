class Add
{
	void sum(int x, int y)
	{
		System.out.println("Sum = " + (a + b));
	} //end of sum()
} //end of class Add
class Subtract
{
	void diff(int x, int y)
	{
		System.out.println("Difference = " + (x - y));
	} //end of diff()
} //end of class Subtract
class Demo extends Add, Subtract
{
	int a = 10, b = 20;
	void display()
	{
		sum(a, b);
		diff(a, b);
	} //end of display()
} //end of class Demo
class prg3
{
	public static void main(String args[])
	{
		Demo obj = new Demo();
		obj.display();
	} //main()
} //end of class prg3
