import java.util.*;
class Operators
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any two numbers : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("1.Arithmetic  2.Relaional  3.Logical  4.Conditional");
		System.out.println("Enter Choice : ");
		int c=sc.nextInt();
		switch(c)
		{
			case 1 :
					System.out.println("Addition : "+(a+b)+"\tSubtraction : "+(a-b)+"\tMultiplication : "+(a*b)+"\tDivision : "+(a/b));
					break;
			case 2 :
					System.out.println("a>=b : "+(a>b)+"\t a<=b"+(a<=b)+"\t a!=b : "+(a!=b)+"\t a==b : "+(a==b));
					break;
			case 3 :
					System.out.println("a AND b : "+(a&b)+"\t a OR b : "+(a|b)+"\t NOT of a: "+(~a));
					break;
			case 4 :
					int k=(a>b)?a:b;
					System.out.println("The Greater no is : "+k);
					break;
		}
	}
}