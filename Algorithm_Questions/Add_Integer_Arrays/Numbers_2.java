class Numbers_2{
	
	public static int[] addNums(int[] a, int[] b){
		int len_1=a.length;
		int len_2=b.length;
		int len=len_1;
		
		if(len_1>len_2){
			int[] b_new = new int[len_1];
			for(int i=b_new.length-len_2;i<b_new.length;++i)
				b_new[i]=b[i-b_new.length+len_2];
			b=b_new;
		}

		if(len_1<len_2){
			len=len_2;
			int[] a_new = new int[len_2];
			for(int i=a_new.length-len_1;i<a_new.length;++i)
				a_new[i]=a[i-a_new.length+len_1];
			a=a_new;
		}


		int rem=0;

		int[] ans = new int[len];

		for(int i=ans.length-1; i>=0;--i){
				ans[i]=a[i]+b[i]+rem;
				if(ans[i]>=10){
					ans[i]%=10;
					rem=1;
				}
				else
					rem=0;

			}
		if(rem==1){
			int[] ans_new = new int[len+1];
			ans_new[0]=rem;
			for(int i=1;i<ans_new.length;++i)
				ans_new[i]=ans[i-1];
			ans = ans_new;
		}

		return ans;
	}

	public static void main(String[] args){
		int[] arr1 = {9,9,9};
		int[] arr2 = {9,9,9};

		int[] nums = addNums(arr1,arr2);
		for(int i=0; i<nums.length; ++i)
			System.out.print(nums[i]);
	}
}