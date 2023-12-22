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
         return fSeries;
     }
 
 
     protected double fibonacci2(int nTh){
         fSeries = new double[nTh];
         //Initializing the first two terms of the array
         fSeries[0] = 0;
         fSeries[1] = 1;
         //Adding values to an array
         for(int count = 2; count < nTh; count++){
 
             fSeries[count] = fSeries[count-1] + fSeries[count-2];
         }
 
         return fSeries[nTh - 1];
     }
 
     @Override
     public String toString(){
         return "You can not have 0 or negative number of terms";
     }
}
