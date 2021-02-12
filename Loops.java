import java.util.*;
class Loops
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter the Limit of Fibonacci Series : ");
		int n=sc.nextInt();
		int a=0,b=1,c=0;
		while(c<=n)	//while loop
		{
			System.out.print(c+"\t");
			a=b;b=c;c=a+b;
		}
		int s=0;
		for(int i=1;i<=15;s+=i++);		//the for loop version without body
		System.out.println("\nThe Sum of First 15 numbers : "+s);
		int i=0;
		System.out.println("The do while loop by skipping '5'  : ");
		do		//the do  while loop
		{
			if(i==5)	
			{	i++; continue;
			}
			System.out.print(i+"\t");	i++;	
		}while(i<=15);
	}
}