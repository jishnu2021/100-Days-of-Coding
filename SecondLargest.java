public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {1,5,8,3,55,82,94,41};

        System.out.println(FindLargest(arr));
    }

    public static int FindLargest(int[] num){
        int max=0;
        int secondlargest=0;
        for(int i=0;i<num.length;i++){
            if(num[i]>max){
                secondlargest = max;
                max=num[i];
            }else if(num[i]>secondlargest && num[i] != max){
                secondlargest = num[i];
            }
        }
        return secondlargest;
    }
}
