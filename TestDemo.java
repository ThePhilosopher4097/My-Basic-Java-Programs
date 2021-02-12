class Demo
{
	int i;
	float f;
	byte y;
	short h;
	double d;
	long l;
	char c;
	boolean b;
	String s;
}
class TestDemo
{
	public static void main(String args[])
	{
	Demo d=new Demo();
	System.out.println("Byte : "+d.y+"\tShort: "+d.h+"\tInteger : "+d.i+"\tLong : "+d.l+"\tDouble"+d.d+"\tFloat : "+d.f+"\tChar : "+d.c+"\tString : "+d.s+"\tBoolean : "+d.b);	
	}
}