import java.util.Scanner;

public class TcsNqtdayfive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j = 0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(findVal(arr));

    }
    public static int findVal(int[][] arr){
        
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        int m = arr[0].length;
        int ans=0;
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=0;j<m;j++){
                if(arr[i][j] == 1){
                    count++;
                }
            }
            if(max < count){
                max = count;
                ans = i+1;
            }
        }
        return ans;
    }
}
