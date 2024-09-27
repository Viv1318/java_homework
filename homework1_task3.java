import java.util.Scanner;

public class homework1_task3 {

    public static void main(String[] args) {
         try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Please enter your namber: ");
      
            int number = sc.nextInt();
            System.out.println(sumDigits(number));
        }
    }
    
    public static int sumDigits(int number){
        int sum = 0;
        
        while(number > 0){
            sum += number % 10;
            number /= 10;
        }
        
        return sum;
    }
}
