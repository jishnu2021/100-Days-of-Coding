import java.util.Scanner;

public class array1 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the arry:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the number you want to search");
        int x=sc.nextInt();
        
        System.out.println("-----The Array Elments are-----");
        for(int i =0;i<n;i++){
            a[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            if(a[i]==x){
                System.out.println("The number is present in"+ i +"index and the number is "+x);
                break;
            }
        }




        System.out.println("---The Output Elements are--");
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
        sc.close();;
    }
}