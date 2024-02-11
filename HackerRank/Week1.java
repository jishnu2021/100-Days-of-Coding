
import java.util.ArrayList;
class Result {

    public static void plusMinus(List<Integer> arr) {
        int n = arr.size();
        int count = 0;
        int zero = 0;
        int neg = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) > 0) {
                count++;
            } else if (arr.get(i) == 0) {
                zero++;
            } else {
                neg++;
            }
        }

        System.out.println((float) count / n);
        System.out.println((float) neg / n);
        System.out.println((float) zero / n);
    }

    public static void main(String[] args){
       ArrayList<Integer> input1 = new ArrayList<>();
       input1.add(-4);
       input1.add(3);
       input1.add(-9);
       input1.add(0);
       input1.add(-2);
       input1.add(5);
       System.out.println("Input:");
       System.out.println(input1);
       System.out.print("Output: ");
       
    }
}
