import java.util.Scanner;

public class String1 {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter Roman numeral: ");
        // char s = sc.next().charAt(0); 
        String[] s = {"Aaakash", "jislok", "Jishnu"};

        String commonPrefix = s[0]; // Initialize with the first string

        for (int i = 1; i < s.length; i++) {
            int minLength = Math.min(commonPrefix.length(), s[i].length());
            int j;
            for (j = 0; j < minLength; j++) {
                if (Character.toLowerCase(commonPrefix.charAt(j)) != Character.toLowerCase(s[i].charAt(j))) {
                    break;
                }
            }
            commonPrefix = commonPrefix.substring(0, j); // Update commonPrefix
        }

        System.out.println(commonPrefix);
    }
}
