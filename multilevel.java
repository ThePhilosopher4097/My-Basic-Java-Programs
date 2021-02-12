abstract class A
{
    protected int a;
    A(){}
    A(int a)
    {   System.out.println("In A's Constructor");
        this.a=a;
    }
    int getA()
    {
        return a;
    }
    abstract void display();
}
class B extends A
{   
    B(){}
    B(int a)
    {
        super(a);
        System.out.println("In B's constructor");
    }
    void display()
    {
        System.out.println("The Value of A (C2) = "+a);
    }
}
class C extends B
{   
    C(int a)
    {   super(a);
        System.out.println("In C's constructor");
    }
    void display()
    {
        System.out.println("The Value of A (C1) = "+a);
    }
}
class MultiLevel
{
    public static void main(String args[])
    {
        C C1=new C(20);
        B B1=new B(30);
        C1.display();
        B1.display();
        System.out.println("A of C1 = "+C1.a);
        System.out.println("A of B1 = "+B1.a);
    }
}