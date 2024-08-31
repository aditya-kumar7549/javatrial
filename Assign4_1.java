class Complex
{
	int a, b;
	static int c = 0;
	Complex(int x, int y)
	{
		a = x;
		b = y;
		c++;
	}   //default constructor
	static void sum(Complex p, Complex q)
	{
		int x = p.a + q.a, y = p.b + q.b;
		if(y>=0)
		System.out.println("Sum = " + x + "+" + y + "j");
		else
		System.out.println("Sum = " + x + y + "j");
	}//add()
	static void diff(Complex p, Complex q)
	{
		int x = p.a - q.a, y = p.b - q.b;
		if(y>=0)
		System.out.println("Difference = " + x + "+" + y + "j");
		else
		System.out.println("Difference = " + x + y + "j");
	}//diff()
	static void product(Complex p, Complex q)
	{
		int x = (p.a * q.a) - (p.b * q.b), y = (p.a * q.b) + (q.a * p.b);
		if(y>=0)
		System.out.println("Product = " + x + "+" + y + "j");
		else
		System.out.println("Product = " + x + y + "j");
	}//product()
	void modulus(Complex p)
	{
		System.out.println("Modulus = " + Math.sqrt((p.a*p.a)+(p.b*p.b)));
	}//modulus()
	void complement(Complex p)
	{
		int y = -p.b;
		if(y>=0)
		System.out.println("Complement = " + p.a + "+" + y + "j");
		else
		System.out.println("Complement = " + p.a + y + "j");
	}//complement()
}//class Complex

class Implement
{
	public static void main(String args[])
	{
		Complex p = new Complex(2, 3);
		Complex q = new Complex(4, 5);
		System.out.println("Number of complex numbers created = " + Complex.c);
		Complex.sum(p, q);
		Complex.diff(p, q);
		Complex.product(p, q);
		p.modulus(p);
		p.complement(p);
	}//main()
}//class Implement
