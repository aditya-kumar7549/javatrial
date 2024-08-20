//Assignment 3 question5
class Arithmetic2
{
	int Sum(int a, int b)
	{
		return (a+b);
	}
	float Sum(int a, int b)
	{
		return (a+b);
	}
	public static void main(String args[])
	{
		Arithmetic obj = new Arithmetic();
		System.out.println(obj.Sum(12, 24));
		System.out.println(obj.Sum(45, 35));
	}//main()
}//end of Arithmetic class
