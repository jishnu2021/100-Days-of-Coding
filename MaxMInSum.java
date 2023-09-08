import java.util.Scanner;

public class MaxMInSum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int  n = sc.nextInt();
        int[] a=new int[n];

        System.out.println("----The array elements are-----");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
         
          int max=a[0];
          int min=a[0];
        for(int i=0;i<n;i++){
            
            if(a[i]>max){
                max=a[i];
            }else{
                min=a[i];
            }
        }

        int sum =max+min;
            System.out.println(sum);
            sc.close();
    }
}
