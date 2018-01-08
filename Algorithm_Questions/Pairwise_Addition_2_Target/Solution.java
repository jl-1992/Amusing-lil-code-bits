import java.util.*;

public class Solution{
	
	public static void pairAddition(int[] nums, int target){
		HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();

		for(Integer i : nums){
			if(h.containsKey(i))
				h.put(i,h.get(i)+1);
			else
				h.put(i,1);
		}

		for(Integer k : h.keySet()){
			if(h.containsKey(target-k) && h.get(target-k)>0 && h.get(k)>0){
				h.put(k,h.get(k)-1);
				h.put(target-k,h.get(target-k)-1);
				System.out.println("(" + k + "," + (target-k) + ")");
			}
		}
	}

	public static void main(String[] args){
		int[] nums = {1,2,5,3,3,4,6};
		pairAddition(nums,7);
	}

}