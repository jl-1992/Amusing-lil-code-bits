public class Solution{

	public static boolean tripletSum(int[] arr){
		for(int i=0; i<=arr.length-3; i++){
			if(arr[i]+arr[i+1]+arr[i+2]==0)
				return true;
		}
		return false;
	}
	
	public static void main (String[] args){
		int[] arr = {0,-1,2,-3,1};
		System.out.println(tripletSum(arr));
	}
}