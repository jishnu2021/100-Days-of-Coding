public class LuckyFind {
    public static void main(String[] args) {
        String s = "Jacky";
        System.out.println(helper(s));
    }
    public static int helper(String s){
        int n = s.length();
        int sum = 0;
        for(int i=1;i<n;i++){
            int ascival = (int) s.charAt(i);

            if(i % 2 == 1 || ascival%2 == 1){
                sum += i*ascival;
            }
        }

        return sum;
    }
}