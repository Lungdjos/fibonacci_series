public class Fibonacci {
    //Declaring Instance Variables
    private int nTh;
    private int [] fSeries;
    //Creating Constructors
    public Fibonacci() {
        //Initializing the first two terms of the array
        this.fSeries[0] = 0;
        this.fSeries[1] = 1;
    }
    public Fibonacci(int nTh){
        
        this.nTh = nTh;
        //Giving the size of the array
        this.fSeries = new int[nTh];
        //Initializing the first two terms of the array
        
    }
    //Getters and Setters
    public int[] getFSeries(){
        return fSeries;
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
    protected int[] fibonacci(int nTh){
        fseries = new int[]
        
        //Adding values to an array
        for(int count = 2; count < nTh; count++){

            fSeries[count] = fSeries[count-2] + fSeries[count-1];
        }
        
        return fSeries;
    }

    @Override
    public String toString(){
        return "You can not have 0 or negative number of terms";
    }
}
