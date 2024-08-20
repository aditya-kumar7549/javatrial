//Assignment 3 Question3.java
class Cloning
{
	int l, w, h;
	Cloning()     //default constructor
	{
		l = 10;
		w = 20;
		h = 30;
	}//end of constructor
	Cloning(Cloning ref)     //copy constructor
	{
		l = ref.l;
		w = ref.w;
		h = ref.h;
	}//end of constructor
	static void check(Cloning ob1, Cloning ob2)
	{
		if(ob1.l==ob2.l && ob1.w==ob2.w && ob1.h==ob2.h)
		System.out.println("Both have the same dimensions");
		else
		System.out.println("They have different dimensions");
	}//check()
	public static void main(String args[])
	{
		Cloning ob1 = new Cloning();
		Cloning ob2 = new Cloning(ob1);
		check(ob1, ob2);
	}//main()
}//end of class Cloning
