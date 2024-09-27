import java.util.Scanner;

public class homework1_task4 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter number a: ");
            int a = scanner.nextInt();
            System.out.println("Enter number b: ");
            int b = scanner.nextInt();
            System.out.println("Enter number c: ");
            int c = scanner.nextInt();
            System.out.println("Maximum of " + a + " and " + b + " is: " + findMaxofTwo(a, b));
            System.out.println("Maximum of " + a + " , " + b + " and " + c + " is: " + findMaxFhree(a, b, c));
        }
    }

    public static int findMaxofTwo(int a, int b) {
        // return Math.max(a, b); 

        return (a > b) ? a : b; // без использования Match или с использованием тернарного оператора
    }

    public static int findMaxFhree(int a, int b, int c) {
        // return Math.max(Math.max(a, b), c);
        return findMaxofTwo(findMaxofTwo(a, b), c);

    }
}
