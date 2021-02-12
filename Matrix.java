import java.util.Scanner;
import java.io.*;
class Mult
{
		void mul(int a[][],int b[][],int c[][])
		{ 	int i,j,k;
			for(i=0;i<2;i++)
			{
				for(j=0;j<2;j++)
				{
					for(k=0;k<2;k++)
					{
						c[i][j]=c[i][j]+(a[i][k]*b[k][j]);	
					}
					System.out.print(c[i][j]+"\t");
				}
				System.out.println("\n");
			}
		}	
}
class Matrix
{
	public static void main(String arg[]) throws java.io.IOException
	{
		Mult M=new Mult();
		int a[][]=new int[2][2],b[][]=new int[2][2],c[][]=new int[2][2];
		Scanner sc=new Scanner(System.in);
		int i,j;
		System.out.println("Enter Matrix A : ");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}

		System.out.println("Enter Matrix b : ");		
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("\nA. Addition \t B. Subtraction \t C. Multiplication");
		System.out.println("Enter your Choice : ");
		char ch=(char)System.in.read();
		switch(ch)
		{
			case 'A' :
			for(i=0;i<2;i++)
			{
				for(j=0;j<2;j++)
				{
					System.out.print(a[i][j]+b[i][j]+"\t");
				}
				System.out.println("\n");
			}	break;
			case 'B' : 
			for(i=0;i<2;i++)
			{
				for(j=0;j<2;j++)
				{
					System.out.print(a[i][j]-b[i][j]+"\t");
				}
				System.out.println("\n");
			}	break;
			case 'C' : 	
			M.mul(a,b,c);
			break;
			default : System.out.println("Invalid Choice !");
		}//e.o.switch
	}//e.o.main
	
}//e.o.class
