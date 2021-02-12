import java.util.*;
class Matrix{
	private int rows,cols;
	int matrix[][];
	Matrix(int rows, int cols){
		this.matrix=new int[rows][cols];
		this.rows=rows;
		this.cols=cols;
	}
	int getRows(){	return rows; }
	int getCols(){	return cols; }
	int atIndex(int i,int j){	return matrix[i][j]; }
	void addMatrix(Matrix A,Matrix B){
		if(A.rows!=B.cols && A.cols!=B.rows){
			System.out.println("\nCannot Add Matrices !");	
			return;	
		}
		else{	System.out.println("Addition of the Matrices :\n");
			for(int i=0;i<A.rows;i++){
				for(int j=0;j<B.cols;j++){
					System.out.print("   "+(A.matrix[i][j]+B.matrix[i][j]));
				}
				System.out.println();
			}	
		}
	}
	void multiplyMatrix(Matrix A,Matrix B){
		int C[][]=new int[A.rows][B.cols];
		int sum=0;
		if(A.cols!=B.rows){
			System.out.println("\nCannot Multiply Matrices !");	
			return;	
		}
		else{	System.out.println("Multiplication of the Matrices :\n");
			for(int i=0;i<A.rows;i++){
				for(int j=0;j<B.cols;j++){
					sum=0;
					for(int k=0;k<B.rows;k++){
						sum+=A.matrix[i][k]*B.matrix[k][j];
					}
					C[i][j]=sum;
					System.out.print("  "+C[i][j]);	
				}
				System.out.println();
			}	
		}
	}
}

class Employee{
	String Name,Address;
	int Year;
	double Salary;
	static int EN=0;
	Employee(){}
	Employee(String N,int Y,String A,double S){
		Name=N;
		Year=Y;
		Address=A;
		Salary=S;
		++EN;
	}
	void printInfo(Employee E[]){
		System.out.println("\nEmployee Info : ");
		System.out.println("\nName       Year of Joining       Address       Salary\n");
		for(int i=0;i<EN;i++){
			System.out.print(""+E[i].Name);
			System.out.print("     "+E[i].Year);
			System.out.print("        "+E[i].Address);
			System.out.print("        "+E[i].Salary);
			System.out.println();
		}
	}
}

class Area{
	double length,breadth;
		void setDim(double length,double breadth){
			this.length=length;
			this.breadth=breadth;
		}
		double getArea(){
			return (length*breadth);
		}

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
//Rectangle
		Area A1=new Area();
		System.out.println("Enter the length and breadth of the reactangle : ");
		A1.setDim(sc.nextDouble(),sc.nextDouble());	
		System.out.println("\nThe Area of the rectangle= "+A1.getArea());
		
//Matrix
		System.out.println("Enter the rows and coloumns of the Matrix A : ");
		Matrix A=new Matrix(sc.nextInt(),sc.nextInt());
		System.out.println("Enter the rows and coloumns of the Matrix B : ");
		Matrix B=new Matrix(sc.nextInt(),sc.nextInt());
//Scanning Matrix		
		System.out.println("Enter the Matrix A : ");
		for(int i=0;i<A.getRows();i++){
			for(int j=0;j<A.getCols();j++){
				A.matrix[i][j]=sc.nextInt();		
			}
		}
		System.out.println("Enter the Matrix B : ");
		for(int i=0;i<B.getRows();i++){
			for(int j=0;j<B.getCols();j++){
				B.matrix[i][j]=sc.nextInt();		
			}
		}
//Operations on Matrix
		A.addMatrix(A,B);	
		A.multiplyMatrix(A,B);
		System.out.println("\nEnter the 'i'th and 'j'th index of the Matrix A : ");
		System.out.println("\nThe Element at the given index in Matrix A = "+A.atIndex(sc.nextInt(),sc.nextInt()));	
//Employee Display
		Employee E[]=new Employee[10];
		System.out.println("How much Employees are you going to enter ? ");
		int n=sc.nextInt();
		System.out.println("\nEnter the Employee info Respectively : ");
		for(int i=0;i<n;i++){
			E[i]=new Employee(sc.next(),sc.nextInt(),sc.next(),sc.nextDouble()); 
		}
		System.out.println();
		E[0].printInfo(E);
		System.out.println("\nTotal Employees : "+Employee.EN);
	}
}