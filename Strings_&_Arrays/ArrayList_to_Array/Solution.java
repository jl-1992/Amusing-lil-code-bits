import java.util.ArrayList;

public class Solution{

	public static int[] convert2Array(ArrayList<Integer> arr){
		int[] nums = new int[arr.size()];

		for(int i=0; i<nums.length; i++)
			nums[i]=arr.get(i);

		return nums;

	}
	
	public static void main(String[] args){
		ArrayList<Integer> arr = new ArrayList<Integer>();

		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);

		int[] nums = convert2Array(arr);

		for(Integer i : nums)
			System.out.println(i);
	}
}