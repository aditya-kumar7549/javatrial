class Box
{
	double length, breadth, height;
	double Volume()
	{
		return (length * breadth * height);
	}//area()
}//end of class Box
class Sphere extends Box
{
	int radius;
	Sphere(int r)
	{
		radius = r;
	}//constructor
	double Volume()
	{
		return (4 * 3.14 * Math.pow(radius, 3)/3);
	}//Volume()
}//end of class Sphere
class prg3
{
	public static void main(String args[])
	{
		Sphere obj = new Sphere(7);
		System.out.println("Volume of the sphere = " + obj.Volume());
	}//main();
}//end of class prg3
