//Assignment_3_2.java

class Box
{
	int length, width, height;
	Box()       //default constructor
	{
		length = 10;
  		width = 20;
		height = 30;
	}//end of constructor
	Box(int h, int w, int d)    //parameterized constructor
	{
		length = h;
		width = w;
		height = d;
	}//end of constructor
	Box(int i)      //parameterized constructor
	{
		length = i;
		width = i;
		height = i;
	}//end of constructor
	int totalSA()
	{
		return 2*(length*width + width*height + length*height);
	}//totalSA()
}//end of Box class

class Demo
{
	public static void main(String args[])
	{
		Box ob1 = new Box();
		Box ob2 = new Box(10, 20, 30);
		Box ob3 = new Box(10);
		System.out.println("Using default constructor:\nTotal Surface Area of the box = " + ob1.totalSA());
		System.out.println("Using the first parameterized constructor:\nTotal Surface Area of the box = " + ob2.totalSA());
		System.out.println("Using the second parameterized constructor:\nTotal Surface Area of the box = " + ob3.totalSA());
	}//main()
}//end of Demo class
