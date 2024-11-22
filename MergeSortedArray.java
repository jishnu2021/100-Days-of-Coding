public class MergeSortedArray {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {4,5,6,7,8};  
        int[] c = mergearray(a,b);
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]);
        }
    }
    public static int[] mergearray(int[] a,int[] b){
        int len_a = a.length;
        int len_b = b.length;
        int i=0; int k=0;
        int j=0;
        int[] c = new int[len_a+len_b];
        while(i<len_a && j<len_b){
            if(a[i] < b[j]){
                c[k] = a[i];
                i++;
                k++;
            }else{
                c[k] = b[j];
                j++;
                k++;
            }
        }

        while(i<len_a){
            c[k]=a[i];
        i++;
        k++;
        }
        while (j<len_b) {
            c[k] = b[j];
            j++;
            k++;
        }

        return c;
    }
}
