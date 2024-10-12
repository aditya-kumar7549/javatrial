import java.util.Scanner;
abstract class TwoDShape
{
	abstract void area();
	int dim1, dim2;
} //end of abstract class TwoDShape
class Rectangle extends TwoDShape
{
	void getdims()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter dimension 1:");
		dim1 = sc.nextInt();
		System.out.println("Enter dimension 2:");
		dim2 = sc.nextInt();
	} //getdims()
	void area()
	{
		System.out.println("Area of the Rectangle: " + (dim1 * dim2));
	} //area()
} //end of class Rectangle
class prg1
{
	public static void main(String args[])
	{
		Rectangle obj = new Rectangle();
		obj.getdims();
		obj.area();
	} //main()
} //end of class prg1
