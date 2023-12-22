/**
 * LAB 3 PRACTICAL
 * Name: Lungu David
 * SID: 18122108
 * Instructor: Mr M. Chuibuluma
 * Date: 26.03.2021
 * QUESTION 3
 * FIBONACCI SERIES
 */
import java.util.Scanner;

public class FibonacciApp {
    public static void main(String[] args) throws Exception {
        //Creating a Scanner object
        Scanner input = new Scanner(System.in);
        //Asking the user which Fibonacci they want to print
        System.out.println("Which fibonacci series would you like to use? \n1. Integer Fibonacci. \n2. Double Fibonacci");
        try{
            int opt = Integer.parseInt(input.nextLine());
            if(opt == 1){
                fibonac1();
            }else if(opt == 2){
                fibonac2();
            }else{
                System.out.print()
            }
        }

    }
    //Creating a Method for the Int Fibonacci Series
    public static void fibonac1() {
        Fibonacci fibonacci = new Fibonacci();
        Scanner keyboardScan = new Scanner(System.in);
        //Prompting the user to enter the number of terms
        System.out.println("Enter the Fibonacci terms that you want: ");
        fibonacci.setNTh(keyboardScan.nextInt());
        //Printing the terms to the user

        System.out.println("The Fibonacci nth term is: " + fibonacci.fibonacci(fibonacci.getNTh()));

        System.out.println("Fibonacci Series: ");
        for(int counter = 0; counter < fibonacci.getFSeries().length; counter++){
            if(fibonacci.getFSeries()[counter] >= 0){
                System.out.print(""+ fibonacci.getFSeries()[counter] + ", ");
            }else{
                System.out.println("\nYou've exceeded the maximum fibonacci th term that can be i.e: " + (counter - 1));
                break;
            }
        }
    }
    //Creating a Method for the Double Fibonacci Series
    public static void fibonac2() {

        Fibonacci2 fibonacci2 = Fibonacci2();
        Scanner keyboardScan = new Scanner(System.in);
        //Prompting the user to enter the number of terms
        System.out.println("Enter the Fibonacci terms that you want: ");
        fibonacci2.setNTh(keyboardScan.nextInt());
        //Printing the terms to the user

        System.out.println("The Fibonacci nth term is: " + fibonacci2.fibonacci2(fibonacci2.getNTh()));

        System.out.println("Fibonacci Series: ");
        for(int counter = 0; counter < fibonacci2.getFibonacciSeries().length; counter++){
            if(fibonacci2.getFibonacciSeries()[counter] >= 0){
                System.out.print(""+ fibonacci2.getFibonacciSeries()[counter] + ", ");
            }else{
                System.out.println("\nYou've exceeded the maximum fibonacci th term that can be i.e: " + (counter - 1));
                break;
            }
        }
    }
}
