public class Solution{

	public int[] merge(int[] a, int[] b){
		int[] c = new int[a.length+b.length];
		int i=0, j=0;

		for(int k=0; k<c.length; k++){
			if(i>=a.length){
				c[k]=b[j++];
			}
			else if(j>= b.length){
				c[k]=a[i++];
			}
			else if(a[i]<=b[j]) {
				c[k]=a[i++];
			}
			else{
				c[k]=b[j++];
			}
		}

		for(int m=0;m<c.length;m++)
			System.out.print(c[m] + " ");
		System.out.println();
		return c;

	}

	public int[] mergeSort(int[] arr){
		int n = arr.length;

		if(n<=1){
			return arr;
		}

		int[] a = new int[n/2];
		int[] b = new int[n-n/2];

		for(int i=0; i<a.length; i++){
			a[i]=arr[i];
		}
		for(int j=0; j<b.length; j++){
			b[j]=arr[n/2+j];
		}

		return merge(mergeSort(a), mergeSort(b));
	}
	


	public static void main(String[] args){
		Solution s = new Solution();

		int[] arr = {5,4,2,3,1};
		int[] t = new int[arr.length];

		t= s.mergeSort(arr);

		for(int i=0; i<t.length; i++){
			System.out.println(t[i]);
		}
	}
}