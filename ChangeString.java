import java.util.Scanner;

public class ChangeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(lowerorUpper(s));
    }

    public static String lowerorUpper(String s){
        char[] arr = s.toCharArray();
        int l = s.length();
        int cap = 0;
        int low = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>=65 && arr[i]<=90){
                cap++;
            }
            if(arr[i]>=97  && arr[i]<=122){
                low++;
            }
        }

        if(cap > low){
            for(int i=0;i<arr.length;i++){
                if(arr[i]>=97 && arr[i]<=122){
                    arr[i] = (char) (arr[i]-32);
                }
            }
        }else{
            for(int i=0;i<arr.length;i++){
                if(arr[i]>=65 && arr[i]<=90){
                    arr[i] = (char) (arr[i]+32);
                }
            }
        }


        return new String(arr);


        
    }
}
