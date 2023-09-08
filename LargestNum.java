import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("---The Array Elements are----");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int max=0,min=0;
        for(int i=0;i<n;i++){
            if(a[i]>max){
                max=a[i];
            }else{
                min=a[i];
            }
        }
        
        System.out.println("The maximum number is "+max);
        System.out.println("The minimum number is "+ min);

        sc.close();
    }
}
