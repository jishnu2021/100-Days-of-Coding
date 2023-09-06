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
        // int l;
        // l=a.length();

        // for(int i=0;i<l/2;i++){
        //     int f=s.charAt(i);
        //     int b=s.length()-1-i;

        //   int front=a.charAt(f);
        //   int back=a.charAt(b);

        //   a.setCharAt(f,back);
        //   a.setCharAt(b,front);
        // }

        System.out.println("Reversed name is " + a);

        
    }
}