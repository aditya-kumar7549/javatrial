interface myInterface
{
	int a = 50;
	void display();
	void printSum(int x, int y);
} //end of interface
class Demo implements myInterface
{
	void display()
	{
		System.out.println("I have been implemented");
	} //end of display()
} //end of class Demo
class prg1
{
	public static void main(String args[])
	{
		Demo obj = new Demo();
		obj.display();
	} //main()
} //end of class prg1
