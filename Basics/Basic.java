//package basics;
import java.util.Scanner;
import java.util.*;
class Basic{
    void addition(int n1, int n2){
        System.out.println("\nThe Addition of "+n1+" and "+n2+" is "+(n1+n2));
    }
    void addition(int A[]){
        int sum = 0;
        for(int element:A){
            sum += element;
        }
        System.out.println("The Sum of the Array is "+sum);
    }
    public static void main(String args[]){
        
        int a,b;
        int []A = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello World !");

        System.out.print("Enter two numbers : ");
        a = sc.nextInt();
        b = sc.nextInt();
        new Basic().addition(a,b);
        
        System.out.print("\nEnter the array size : ");
        int n = sc.nextInt();
        System.out.print("\nEnter the array elements : ");
        for(int i=0;i<n;i++){
            A[i] = sc.nextInt();
        }
        new Basic().addition(A);

        System.out.println("Size of int: " + (Integer.SIZE/8) + " bytes.");
        System.out.println("Size of long: " + (Long.SIZE/8) + " bytes.");
        System.out.println("Size of char: " + (Character.SIZE/8) + " bytes.");
        System.out.println("Size of float: " + (Float.SIZE/8) + " bytes.");
        System.out.println("Size of double: " + (Double.SIZE/8) + " bytes.");

        Stack<String> players = new Stack<String>();
        players.add("Virat Kohli");
        players.add("Ravindra Jadeja");
        players.add("Suresh Raina");
        players.add("KL Rahul");
        System.out.println(players);
    }
}