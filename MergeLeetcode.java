import java.util.Scanner;

public class MergeLeetcode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the lists size: ");
        int n=sc.nextInt();
        System.out.println("Enter frist array: ");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter second array: ");
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
        
        int i=0,j=0,k=0;
        int c[]=new int[2*n];

        // for(i=0;i<n;i++){
        //     for( j=0;j<n;j++){
        //         if(a[i]<=b[j]){
        //          c[k]=a[i];
        //             i++;
        //             k++;
        //         }else{
        //           c[k]=b[j];
        //             j++;
        //             k++;
        //         }
        //     }
        // }
        
            while(i<n && j<n){
                if(a[i]<=b[j]){
                    c[k]=a[i];
                    i++;
                    k++;
                }else{
                    c[k]=b[j];
                    j++;
                    k++;
                }
            }

            while(i<n){
                c[k++]=a[i++];
            }
            while(j<n){
                c[k++]=b[j++];
            }

        System.out.println("----Output List-----");
        sc.close();

    //    for(int num:c){
    //     System.out.print(num);
    //    }
        
    for( k=0;k<c.length;k++){
        System.out.print(c[k]);
    }

    }
}
