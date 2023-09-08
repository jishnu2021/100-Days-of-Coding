import java.util.Scanner;


public class frequency {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the size of the array: ");
      int n=sc.nextInt();
      int[] nums=new int[n];

       for(int i=1;i<=n;i++){
          nums[i]=sc.nextInt();
      }

      for(int i=1;i<=n;i++){
        int count=0;
        int a=nums[i];
        for(int j=1;j<=n;j++){
          if(nums[j]==a){
            count++;
          }
        }
        System.out.println("The number" + i + "is present" + count + "times");
      }

      sc.close();

    }
}

