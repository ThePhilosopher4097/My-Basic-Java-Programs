import java.util.*;
class Array
{
	public static void main(String args[])
	{
		int a[]=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array Elements : ");
		for(int i=0;i<10;i++)
		{
			a[i]=sc.nextInt();
		}
		int k=0,i;
		for(i=0;i<10;i++){k+=a[i];}
		System.out.println("The Sum is : "+k);
	}
}