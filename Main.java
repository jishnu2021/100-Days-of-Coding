import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int arr[] = {3,2,1,-4,6,3,1};                  //25,11,12,21,25,11    --> 11, 12
		int k=3;
		int ans[] = new int[k];
		int prefix[] = new int[arr.length+1];
		for(int i=1; i<prefix.length; i++){
		    prefix[i] = prefix[i-1] + arr[i-1]; 
		}
		int min = Integer.MAX_VALUE;
		for(int i=k; i<prefix.length; i++){
		    int diff = prefix[i]-prefix[i-k];
		    if(diff < min){
		        min = diff;
		        int save = i-k, z=0;
		        while(save < i){
		            ans[z++] = arr[save++];
		        }
		    }
		}
		System.out.println(Arrays.toString(ans));
	}
}
