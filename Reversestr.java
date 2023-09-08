import java.util.Scanner;

/**
 * Reversestr
 */
public class Reversestr {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a name: ");
        String s=sc.nextLine();
        StringBuilder a=new StringBuilder(s).reverse();
       

        System.out.println("Reversed name is " + a);

        sc.close();
    }
}