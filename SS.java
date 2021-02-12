class SS
{
	public static void main(String args[])
	{
		/*String S1="tejas anand sawant";
		for(int i=0;i<S1.length();i++)
		{
			if(i==0)	S1=S1.substring(0,1).toUpperCase()+S1.substring(1);
			if(S1.charAt(i)==' ')		S1=S1.substring(0,i+1)+S1.substring(i+1,i+2).toUpperCase()+S1.substring(i+2);
		}
		System.out.println("Your Name : "+S1);*/
		int sp=6;
		for(int i=0;i<7;i++){
			for(int k=sp;k>0;k--){
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++){
					if(j!=0 && j<i && i<6)	{System.out.print("  ");	continue;}
					System.out.print("* ");
			}
			System.out.println();	sp--;
		}
		/*int sp=6,cnt=0;	String s=" ";
		for(int I=0;I<7;I++)
		{
			for(int i=0;i<7;i++)
			{	
				for(int k=sp;k>0;k--)
				{
					System.out.print(s);
				}
				for(int j=0;j<=cnt;j++)
				{
					System.out.print("* ");
				}
			}
			System.out.println();	sp--;	cnt++;	
		}*/
	}
}