import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Creating Objects
        Fibonacci fibonacci = new Fibonacci();
        Scanner keyboardScan = new Scanner(System.in);
        //Prompting the user to enter the number of terms
        System.out.println("Enter the Fibonacci terms that you want: ");
        fibonacci.setNTh(keyboardScan.nextInt());
        //Printing the terms to the user

        System.out.println("The Fibonacci nth term is: " + fibonacci.fibonacci(fibonacci.getNTh()));

        System.out.println("Fibonacci Series: ");
        for(int index = 0; index < fibonacci.getFSeries().length; index++){
            if(fibonacci.getFSeries()[index] >= 0){
                System.out.print(""+ fibonacci.getFSeries()[index] + ", ");
            }else{
                System.out.println("You've exceeded the maximum fibonacci th term i.");
            }
        }
        
    }
}
