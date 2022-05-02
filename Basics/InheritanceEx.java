class Parent
 {  
    void display()
    {
        System.out.println("parent class....");}  
}  
class Child extends Parent{  
    void show()
    {
        System.out.println("child class.....");
    }  
}  

class InheritanceEx  {  
public static void main(String args[]){  
Child d =new Child();  
d.display();  
d.show();  
}}  
    

