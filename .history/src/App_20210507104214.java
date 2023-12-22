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
        System.out.println("The Fibonacci terms are: ");
        System.out.print(fibonacci.getFSeries());

    }
}
