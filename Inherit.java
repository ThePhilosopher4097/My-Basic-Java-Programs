import java.util.*;
class A
{
	private int a;
	A(int a)
	{	this.a=a;
		System.out.println("This is Base class.\n");
	}
	void display()	//overridden method
	{
		System.out.println("value of a in A = "+a);	
	}
	int getA(){	return a;}
}
class B extends A
{
	B(int a)
	{
		super(a);
		System.out.println("This is Child Class.\n");
	}
	void display()	//overridding method
	{
		System.out.println("Value of a in B = "+getA());	
	}
}
class Inherit
{
	Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		A a1=new A(21),a2;
		B b1=new B(45);	
		a1.display();
		a2=b1;
		a2.display();
	}
}	