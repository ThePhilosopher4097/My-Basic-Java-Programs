import java.lang.Math;
import java.text.ParseException;
import java.text.ParsePosition;
class demo
{
	public static void main(String args[])
	{
		System.out.println("Hello World");
		boolean B=9>2;
		System.out.println("The Value of B is "+B);
		B='S'>'s';
		System.out.println("The Value of B is "+B);	
		byte y=5;
		short h=0;
		int t=65;
		char c='A';
		String s="32767";	
		float f=12.5f;
		double d=220.45;
		B=true;
		y=(byte)t;		t=y;	//int to byte and byte  to int
		h=(short)t;	t=h;	//int to short and short to int
		f=(float)d;		d=f;	//double to float and float to double
		t=c;		c=(char)t;	//char to int and int to char
		h=(short)d;	t=(int)f;	//double to short and float to integer
		System.out.println("Integer : "+t+"\tFloat : "+f+"\tByte : "+y+"\tChar : "+c+"\tBoolean : "+B+"\tDouble : "+d);
		t=Integer.parseInt(s);
		B=Boolean.parseBoolean(s);	
		System.out.println("After Parsing \n Integer : "+t+"\tBoolean : "+B);
		d=Math.sqrt(y);
		h=Short.parseShort(s);
		int i=258;
		byte b=(byte)i;
		System.out.println("No is :  "+b);
	} 
}