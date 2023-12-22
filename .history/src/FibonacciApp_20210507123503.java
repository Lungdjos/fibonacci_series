/**
 * LAB 3 PRACTICAL
 * Name: Lungu David
 * SID: 18122108
 * Instructor: Mr M. Chuibuluma
 * Date: 26.03.2021
 * QUESTION 1
 */
import java.util.Scanner;

public class FibonacciApp {
    //Creating Objects
    public static Fibonacci fibonacci = new Fibonacci();
    public static Fibonacci2 fibonacci2 = Fibonacci2();
    public static Scanner keyboardScan = new Scanner(System.in);
    public static void main(String[] args) throws Exception {


        
    }
    //Creating a Method for the Int Fibonacci Series
    public static void fibonacci1() {
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
}
