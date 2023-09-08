import java.util.Scanner;

public class leetcode26 {

    
    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        System.out.println("Size of the second array: ");
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int[] b=new int[n];

        for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(a[i]!=a[j]){
                b[i++]=a[i];                                  
            }
            
        }


                
        }
        System.out.println("---Output-----");
        for(int i=0;i<n;i++){
            System.out.println(b[i]);
        }

        sc.close();
    }
}
