interface Student
{
	String name = "Taki";
	void printDetails();
} //end of interface
interface Marks
{
	int m1 = 100, m2 = 85, m3 = 98;
	void printMarks();
} //end of interface
class Demo implements Student, Marks
{
	public void printDetails()
	{
		System.out.println("Name: " + name);
	} //end of printdetails();
	public void printMarks()
	{
		System.out.println("Marks: " + m1 + ", " + m2 + ", " + m3);
	} //end of printMarks()
} //end of class Demo
class prg2
{
	public static void main(String args[])
	{
		Demo obj = new Demo();
		obj.printDetails();
		obj.printMarks();
	} //main()
} //end of class prg2
