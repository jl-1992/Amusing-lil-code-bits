public class Solution{
	
	public static int[] insertionSort(int[] arr){
		for(int i=1; i<arr.length;i++){
			for(int j=i-1; j>=0; j--){
				if(arr[j+1]>=arr[j])
					break;
				int temp=arr[j+1];
				arr[j+1]=arr[j];
				arr[j]=temp;
			}
			print(arr);
		}
		return arr;
	}

	public static void print(int[] arr){
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String[] args){
		int[] arr = {6,5,3,1,8,7,2,4};

		arr=insertionSort(arr);

		print(arr);
	}
}