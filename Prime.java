import java.util.*;
class Prime
{
	public static void main(String args[])
	{
		boolean flag=true;
		int i,j,n;
		Scanner sc=new Scanner(System.in);
		System.out.print("How many prime numbers do you want ?  : ");
		n=sc.nextInt();
		System.out.println("The prime numbers are : ");
		for(i=2;i<n;i++)
		{
			for(j=2;j<=i;j++)
			{
				if(i%j==0)
				{
					break;
				}
				
			}
			if(i==j)
			{
					System.out.println(i);
					flag=false;
			}
		}
		if(flag==true)
		{
			System.out.println("There are no prime numbers before "+n);
		}
		System.out.println();
		int m=0,k=0,sp=5;
		for(i=0;i<5;i++)
		{
			for(k=sp;k>=0;k--)
			{	System.out.print(" ");
			}
			for(j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			sp--;
		}
		for(i=5,sp=0;i>=0;i--)
		{
			for(k=0;k<=sp;k++)
			{	System.out.print(" ");
			}
			for(j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			sp++;
		}
	}
}