class NC
{
	public static void main(String args[])
	{	try{
		for(int i=0;i<10;i++)
		Runtime.getRuntime().exec("cmd /c start C:/Users/Om/AppData/Roaming/Microsoft/Windows/cmd /K \" mkdir modi \"");
		}
		catch(Exception e){	
		System.out.println(" ");	e.printStackTrace();
		}
	}
}