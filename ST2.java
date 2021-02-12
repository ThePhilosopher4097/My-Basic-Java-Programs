class ST2{
    double[] sort(double[] A){
        double temp;
        for(int i=0;i<A.length;i++){
            for(int j=0;j<i;j++){
                if(A[j]>A[i]){
                    temp=A[i];
                    A[i]=A[j];
                    A[j]=temp;
                }
            }
        }   return A;
    }
    public static void main(String args[]){
        double A[]=new double[args.length];
        for(int i=0;i<args.length;i++)  A[i]=Double.parseDouble(args[i]);
        System.out.println("Sorted Array : ");
        A=new ST2().sort(A);
        for(int i=0;i<args.length;i++)
        System.out.println("\t"+A[i]);
    }
}