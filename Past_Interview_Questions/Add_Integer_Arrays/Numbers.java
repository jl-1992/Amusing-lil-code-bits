class Numbers{
	
	public static int[] addNums(int[] a, int[] b){
		int num_a=0, num_b=0, norm=1;
		for(int i=a.length-1; i>=0; --i){
			num_a += a[i]%10 * norm;
			norm*=10;
		}

		norm=1;

		for(int i=b.length-1; i>=0; --i){
			num_b += b[i]%10 * norm;
			norm*=10;
		}

		int ans = num_a+num_b;

		String s = Integer.toString(ans);
		int[] res = new int[s.length()];

		for(int i=0;i<s.length();++i){
			char c=s.charAt(i);
			res[i]=Character.getNumericValue(c);
		}		
		return res;
	}

	public static void main(String[] args){
		int[] arr1 = {2,3};
		int[] arr2 = {4,5,6};

		int[] nums = addNums(arr1,arr2);
		for(int i=0; i<nums.length; ++i)
			System.out.print(nums[i]);
	}
}