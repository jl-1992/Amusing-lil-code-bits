public class Solution{

	public static int midSum(int[] arr){
		int leftSum=0, rightSum=0;
		if(arr.length>2){
			for(int i=1; i<arr.length; i++){
				for(int j=0; j<i; j++){
					leftSum+=arr[j];
				}
				for(int j=i+1; j<arr.length; j++){
					rightSum+=arr[j];
				}
				if(leftSum==rightSum)
					return i;
				else{
					leftSum=0;
					rightSum=0;
				}
			}
		}

		return 0;
	}
	
	public static void main(String[] args){
		int[] arr = {1,2,3,2,1};
		System.out.println(midSum(arr));
	}
}