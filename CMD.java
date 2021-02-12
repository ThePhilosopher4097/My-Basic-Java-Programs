class CMD
{
	public static void main(String args[])
	{
		int Sum=0;
		for(int i=0;i<args.length;i++)
		{
			System.out.println("args["+i+"]  =  "+args[i]);
			Sum += Integer.parseInt(args[i]);
		}
		System.out.println("The Sum of the Command Line Arguments  :  "+Sum);
	}
}