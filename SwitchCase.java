import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("First Number : ");
        int a = sc.nextInt();
        System.out.print("Second Number : ");
        int b = sc.nextInt();
        System.out.println("Choose an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.print("Enter your choice (1-4): ");
        int operator = sc.nextInt();

        switch(operator){
            case 1:
                System.out.println("Addition is :" + (a+b));
                break;
            case 2:
                System.out.println("Substraction is :" + (a-b));
                break;
            case 3:
                System.out.println("Multiplication is :" + (a*b));
                break;
            case 4:
            if (b == 0) {
                System.out.println("Error: Division by zero is undefined.");
            } else {
                System.out.println("Result (Division): " + ((double) a / b));
            }
            break;
            default:
            System.out.println("Invalid");
        }

        sc.close();
    }
}
