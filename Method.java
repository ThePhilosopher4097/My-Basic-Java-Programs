import java.util.*;
class FindArea
{
	void area()
	{
		System.out.println("Area is Undefined !");
	}
	void area(int a)
	{
			System.out.println("Area of the Square : "+(a*a));
	}
	void area(int a,int b)
	{
			System.out.println("Area of the Rectangle : "+(a*b));
	}
	void area(double d1,double d2)
	{
			System.out.println("Area of the Trinagle : "+(0.5*d1*d2));
	}
	void area(double r)
	{
			System.out.println("Area of the Circle : "+(2*3.142*r*r));
	}
}

class Method
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		FindArea f1=new FindArea();
		System.out.println("Enter the Side of Square : ");
		f1.area(sc.nextInt());
		System.out.println("Enter the Length and breadth of the Rectangle : ");
		f1.area(sc.nextInt(),sc.nextInt());
		System.out.println("Enter the Height and Base of the Trinagle : ");
		f1.area(sc.nextDouble(),sc.nextDouble());
		System.out.println("Enter the Radius of the Circle : ");
		f1.area(sc.nextDouble());
	}
}