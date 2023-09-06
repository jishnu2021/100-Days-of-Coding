public class LinearSearch {
    public static void main(String[] args) {
        int[] a={3,4,5,6,7};
        int num=6;
        int n=a.length;
        for(int i=0;i<n;i++){
            if(a[i]==num){
                System.out.println("The number presend at " + i + " index");
                break;
            }
        }
    }
}
