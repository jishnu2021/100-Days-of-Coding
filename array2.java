import java.util.Scanner;

public class array2 {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int row=sc.nextInt();
    int col=sc.nextInt();
    int[][] a=new int[row][col];
    System.out.println("Enter the number you want to search");
    int num=sc.nextInt();

    System.out.println("----The Input Value----");
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            a[i][j]=sc.nextInt();
        }
    }

    System.out.println("---The output----");
       for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            System.out.print(a[i][j]+" ");
        }
        System.out.println();
    }
    

    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            if(a[i][j]==num){
                System.out.println("The number is presented in"+a[i][j]+"index");
                break;
            }
           
    }
 }  
  System.out.println("Not in the list"); 
 }
}
