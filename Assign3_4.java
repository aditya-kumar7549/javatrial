//Assignment 3 question 4
class Arithmetic
{
	int Sum(int a, int b)
	{
		return (a+b);
	}
	float Sum(int a, int b, float c)
	{
		return (a+b+c);
	}
	public static void main(String args[])
	{
		Arithmetic obj = new Arithmetic();
		System.out.println(obj.Sum(12, 24));
		System.out.println(obj.Sum(12, 24, 85.9f));
	}//main()
}//end of Arithmetic class
