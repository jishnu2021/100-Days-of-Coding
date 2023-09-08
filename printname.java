import java.util.Scanner;

public class printname {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a name: ");
        String s=sc.next();

        int a =s.length();
        System.out.println("The size of the string is :"+a);
        while(a>0){
            System.out.println(s);
            a--;
        }
        sc.close();
    }
}
