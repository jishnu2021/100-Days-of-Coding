/**
 * MergeSort
 */
public class MergeSort {

    public static void Merge(int[] a,int lb,int mid,int ub){
        int i=lb;
        int j=mid+1;
        int k=lb;
        int[] b=new int[a.length];
        while(i<=mid && j<=ub){
            if(a[i]<=a[j]){
                b[k]=a[i];
                i++;
            }else{
                b[k]=a[j];
                j++;
            }
            k++;
        }

        if(i>mid){
            while(j<=ub){
                b[k]=a[j];
                j++;
                k++;
            }
        }

                if(j>ub){
            while(i<=mid){
                b[k]=a[i];
                i++;
                k++;
            }
        }
         for (int x = lb; x <= ub; x++) {
            a[x] = b[x];
         }

    }

    public static void mergefunc(int[] a,int lb,int ub){
        
        while(lb<ub){
            int mid=(lb+ub)/2;
            mergefunc(a, lb, mid);
            mergefunc(a, mid+1, ub);
            Merge(a, lb, mid, ub);
        }
        
    }

    public static void main(String[] args) {
        int[] a={15,5,24,8,1,3,16,10,20};

        int lb=0;
        int ub=a.length-1;

        mergefunc(a,lb,ub);

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+",");
        }

    }
}