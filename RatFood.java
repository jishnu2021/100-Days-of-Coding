/**
 * RatFood
 */
public class RatFood {

    public static void main(String[] args) {
        int[] arr = {2, 8, 3, 5, 7, 4, 1, 2};

        int rat = 7;
        int food = 2;

        System.out.println(NeedFood(arr, rat, food));
    }

    public static int NeedFood(int arr[], int r, int f) {
        int requiredFood = r * f;
        int collectedFood = 0;
        int count = 0;

        if (arr.length == 0) {
            return -1; // If no houses are present
        }

        for (int i = 0; i < arr.length; i++) {
            collectedFood += arr[i];
            count++;
            if (collectedFood >= requiredFood) {
                return count; // Return the number of houses visited to collect enough food
            }
        }

        return 0; // Return 0 if the required amount of food cannot be collected
    }
}
