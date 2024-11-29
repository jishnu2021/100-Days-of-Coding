public class FoodDistribution {
    public static void main(String[] args) {
        int numberOfRats = 6; 
        int foodPerRat = 4; 
        int[] foodInHouses = {5, 7, 8, 3, 6}; 

        boolean isFoodSufficient = checkFoodSufficiency(numberOfRats, foodPerRat, foodInHouses);
        System.out.println("Is food sufficient? " + isFoodSufficient);
    }

    public static boolean checkFoodSufficiency(int a , int b ,int[] num){
        int sum=0;
        int result = a * b;
        for(int i=0;i<num.length;i++){
            sum = sum + num[i];
        }

        return sum > result;
    }
}
