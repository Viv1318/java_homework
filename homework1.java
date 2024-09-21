import java.util.Scanner;

public class homework1 {

    public static void main(String[] args) {

        System.out.println("Welcome to the Factorial Calculator!");
    
         {
            System.out.println("Please enter number n: ");
            int n = scanner.nextInt();
            System.out.println(factorial(n));
        }
    }
    public static int factorial (int n) {
        
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return -1;
        } 
        else {
            int res = 1;
            for (int i = 1; i <= n; i++) {
                res *= i;
            }
            return res;
        }
        
        
        
    }
        
}
    

        
      
