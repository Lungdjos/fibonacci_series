public class Fibonacci2 {
     //Declaring Instance Variables
     private int nTh;
     public double [] fibonacciSeries;
     //Creating Constructors
     public Fibonacci2() {
 
     }
     public Fibonacci2(int nTh){
         
         this.nTh = nTh;
     }
     public void setNTh(int nTh){
         if(nTh > 1){
             this.nTh = nTh;
         } else {
             toString();
         }
         
     }
     public int getNTh(){
         return nTh;
     }
 
     public double[] getFibonacciSeries() {
         return fibonacciSeries;
     }
 
 
     protected double fibonacci2(int nTh){
        fibonacciSeries = new double[nTh];
         //Initializing the first two terms of the array
         fibonacciSeries[0] = 0.0;
         fibonacciSeries[1] = 1.0;
         //Adding values to an array
         for(int count = 2; count < nTh; count++){
 
            fibonacciSeries[count] = fibonacciSeries[count-1] + fibonacciSeries[count-2];
         }
         return fibonacciSeries[nTh - 1];
     }
 
     @Override
     public String toString(){
         return "You can not have 0 or negative number of terms";
     }
}
