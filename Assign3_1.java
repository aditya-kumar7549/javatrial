//Assignment_3 (Method Overloading) Question 1
 
class Box
{
	int l, w, h;
	Box()        //default constructor
	{
		l = 10;
		w = 20;
		h = 30;
	}//end of constructor
	Box(int le, int wi, int he)   //parameterized constructor
	{
		l = le;
		w = wi;
		h = he;
	}//end of constructor
	Box(Box ref)     //copy constructor
	{
		l = ref.l;
		w = ref.w;
		h = ref.h;
	}//end of constructor
	void display()
	{
		System.out.println("Length = " + l + "\nWidth = " + w + "\nHeight = " + h);
	}//display()
	public static void main(String args[])
	{
		Box ob1 = new Box();
		Box ob2 = new Box(10, 20, 30);
		Box ob3 = new Box(ob1);
		System.out.println("Using default constructor:");
		ob1.display();
		System.out.println("Using parameterized constructor:");
		ob2.display();
		System.out.println("Using copy constructor:");
		ob3.display();
	}//main()
}//end of Box class
