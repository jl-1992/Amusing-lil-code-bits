import java.util.*;

public class Solution{

	public static boolean oneSwap(int[] arr){
		int count=0;
		int[] temp = Arrays.copyOf(arr,arr.length);
		Arrays.sort(temp);

		for(int i=0; i<arr.length; i++){
			if(arr[i]!=temp[i])
				++count;
		}

		return count<=2;
	}
	
	public static void main(String[] args){
		int[] arr = {1,3,6,4,5};
		System.out.println(oneSwap(arr));
	}
}