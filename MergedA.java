public class MergedA {
    public static void main(String[] args) {
        int p[]={1,2,3,4,5,6};
        int q[]={7,8,9,1};
        int l=p.length + q.length;
        int R[]=new int[l];

        for(int k=0;k<l;k++){
            for(int i=0;i<p.length;i++){
                R[k]=p[i];
            }

            for(int j=0;j<q.length;j++){
                R[k]=q[j];
            }
        }
        

        for(int k=0;k<l;k++){
            System.out.println(R[k]);
        }
    }
}
