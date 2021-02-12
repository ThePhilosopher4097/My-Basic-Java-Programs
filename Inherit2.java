import java.util.*;
abstract class Star
{	int i,j,k,sp;
	Star()
	{	i=j=k=0;	sp=5;	
	}
	abstract void display();
}
class Pyramid1 extends Star
{
	int sp=5;
	void display()
	{
		for(i=0;i<5;i++)
		{
			for(k=0;k<sp;k++)
			{
				System.out.print(" ");		
			}
			for(j=0;j<=i;j++)
			{
				System.out.print("* ");	
			}
			System.out.println();
			sp--;	
		}
	}
}
class Pyramid2 extends Star
{
	int sp=0;
	void display()
	{
		for(i=5;i>0;i--)
		{
			for(k=0;k<=sp;k++)
			{
				System.out.print(" ");		
			}
			for(j=i;j>0;j--)
			{
				System.out.print("* ");	
			}
			System.out.println();	
			sp++;
		}
	}
}

class Inherit2
{
	Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		Star S;
		Pyramid1 P1=new Pyramid1();	
		Pyramid2 P2=new Pyramid2();
		S=P1;
		S.display();
		System.out.println();
		S=P2;
		S.display();
	}
}