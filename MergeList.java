import java.util.Scanner;

public class MergeList {
 public static void main(String[] args) {
    Scanner ob=new Scanner(System.in);
    System.out.println("Enter First List1: ");
    int[] arr={1,2,4};
    int[] brr={1,3,5};

    StringBuilder sc=new StringBuilder();

    for(int num:arr){
        sc.append(num).append(" ");
    }
    for(int num:brr){
        sc.append(num).append(" ");
    }
    System.out.println(sc.toString());
 }   
}
