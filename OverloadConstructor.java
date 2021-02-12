class Constructor
{
    int a;  double d1,d2;   String S1;
    Constructor()
    {
        System.out.println("This is Default Constructor.");
    }
    Constructor(int a)
    {
        this.a=a;
        System.out.println("Single Parametered Constructor...\nValue of a = "+a);
    }
    Constructor(double d1,double d2)
    {
        this.d1=d1; this.d2=d2;
        System.out.println("Two Parametered Constructor ... \nValue of d1 & d2 = "+d1+" and  "+d2);
    }
    Constructor(String S1)
    {
        this.S1=S1;
        System.out.println("String Parametered Constructor ...\nThe String is : "+S1);     
    }
    Constructor(Constructor C)
    {
        S1=C.S1;    d1=C.d1;    d2=C.d2;    a=C.a;
        System.out.println("Object As Parameter ...\nValue of d1 & d2 = "+d1+" and  "+d2);
        System.out.println("Value of a = "+a);
        System.out.println("The String is : "+S1);
    }
}
class OverloadConstructor
{
    public static void main(String args[])
    {
        Constructor C1=new Constructor();
        Constructor C2=new Constructor(7);
        Constructor C3=new Constructor(91.23,93.32);
        Constructor C5=new Constructor("Wake up...the matrix has You.....");
        Constructor C4=new Constructor(C1);
    }
}