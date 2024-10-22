import java.util.Scanner;

public class Totallandoffarmers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of farmers

        int totalLands = 1; // Farmer 1 starts with 1 unit of land
        int previousLand = 1; // Initial land for farmer 1 is 1

        // Start calculating from the 2nd farmer onwards
        for (int i = 2; i <= n; i++) {
            int currentLand = previousLand ^ i; // XOR of previous land and current index
            totalLands += currentLand; // Add current land to total lands
            previousLand = currentLand; // Update previous land for the next iteration
        }

        System.out.println(totalLands);
    }
}
