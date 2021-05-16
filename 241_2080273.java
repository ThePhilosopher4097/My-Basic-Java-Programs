/*
	Name : Sameer Manik Patil
	Batch : E2
	Roll No : 241
	PRN :0220200017
	Seat No : S208073
	Problem Statement : We have to calculate the area of a rectangle, a square and a circle.
										Create an abstract class 'Shape' with three abstract methods namely 'RectangleArea' taking two parameters, 'SquareArea' and 'CircleArea' taking one parameter each. The parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its side and that of 'CircleArea' is its radius. Now create another class 'Area' containing all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the area of rectangle, square and circle respectively.
										Create an object of class 'Area' and call all the three methods.					
*/


import java.util.*;

abstract class Shape{		//Abstract Class Shape with abstract methods
	abstract void RectangleArea(double length, double breadth);
	abstract void SquareArea(double side);
	abstract void CircleArea(double radius);
}

class Area extends Shape{	//subclass of the abstract class
	void RectangleArea(double length, double breadth){
		System.out.println("\nThe Area of the Rectangle is ---->"+(length*breadth));
	}
	void SquareArea(double side){
		System.out.println("\nThe Area of the Square is ---->"+(side*side));
	}
	void CircleArea(double radius){
		System.out.println("\nThe Area of the Circle is ---->"+(3.14259*radius*radius));
	}
}

class Sameer_241_2080273{
	static Scanner sc = new Scanner(System.in); 
	public static void main(String args[]){
		Area A = new Area();
		do{
			System.out.println("Enter Choice :   1.Area(Rectangle)     2.Area(Square)      3.Area(Circle).......(Exit-0)");
			int choice=sc.nextInt();
			switch(choice){
				case 0 : break;
				case 1 : 
							System.out.println("Enter Length and Breath of the Rectangle :  ");
							A.RectangleArea(sc.nextDouble(),sc.nextDouble());
							break;
				case 2 : 
							System.out.println("Enter the length of Side of the Square :  ");
							A.SquareArea(sc.nextDouble());
							break;
				case 3 : 
							System.out.println("Enter Radius of the circle :  ");
							A.CircleArea(sc.nextDouble(),sc.nextDouble());
							break;
				default : System.out.println("\nInvalid Choice !"); break;
			}
		}while(choice!=0);
	}
}

/*
Output : 


*/