class Point
{
	int x, y;
	Point(int a, int b)
	{
		x = a;
		y = b;
	}  //default constructor
	static void dist(Point a, Point b)
	{
		double d = Math.sqrt(Math.pow(b.x - a.x, 2) + Math.pow(b.y - a.y, 2));
		System.out.println("Distance between ("+a.x+","+a.y+") and ("+b.x+","+b.y+") = " + d);
	}//dist()
}//class Point

class Distance
{
	public static void main(String args[])
	{
		Point a = new Point(2, 3);
		Point b = new Point(4, 5);
		Point.dist(a, b);
	}//main()
}//class Distance
