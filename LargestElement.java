public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {3,5,8,1,2,4,7,7,5};

        int max = arr[0] ;
        int secmax = -1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                secmax = max;
                max=arr[i];
                
            } else if (arr[i] < max && arr[i] > secmax) {
                secmax = arr[i];
            }
        }

        int min = arr[0];
        int secmin = Integer.MAX_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                secmin = min;
                min = arr[i];
            } else if (arr[i] > min && arr[i] < secmin) {
                secmin = arr[i];
            }
        }

        System.out.println("The min element is: " + min);
        if (secmin == Integer.MAX_VALUE) {
            System.out.println("There is no second minimum element.");
        } else {
            System.out.println("The second min element is: " + secmin);
        }

        System.out.println("----------------------------------------------------------------------------");
        System.out.println("The max element is :"+max);
        System.out.println("The second max element is :"+secmax);


        
    }
}
