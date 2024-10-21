import java.util.Scanner;

public class Vehicles {
    public static void main(String[] args) {
        // Creating Scanner object for taking input from user.
        Scanner sc = new Scanner(System.in);
        // Input no. of vehicles
        int v = sc.nextInt();
        // Input no. of wheels
        int w = sc.nextInt();
        // Checking given constraints
        if(v>w || w%2!=0 || w < 2) System.out.println("INVALID INPUT");

        int tw = ((v*4)-w)/2;
        // v*4 gives us the no. of wheels reqd to create v no. of 4 wheelers.
        // (v*4)-w gives us the no. of wheels that we are short of.
        // Finally we use these remaining wheels to create Two Wheelers so ,((v*4)-w)/2.
        
        int fw = v-tw;
        System.out.println("TW = "+tw);
        System.out.println("FW = "+fw);
    }
}