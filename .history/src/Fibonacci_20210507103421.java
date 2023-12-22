public class Fibonacci {
    //Declaring Instance Variables
    private int nTh;
    private int [] fSeries;
    //Creating Constructors
    public Fibonacci() {

    }
    public Fibonacci(int nTh){
        
        this.nTh = nTh;
        //Giving the size of the array
        fSeries = new int[nTh];
        //Initializing the first two terms of the array
        fSeries[0] = 0;
        fSeries[1] = 1;
    }
    //Getters and Setters
    set
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
