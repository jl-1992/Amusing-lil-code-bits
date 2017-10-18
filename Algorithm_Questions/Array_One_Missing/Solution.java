import java.util.HashMap;

public class Solution{
	
	public static int findNum(int[] arr){
		HashMap<Integer, Integer> h = new HashMap<Integer,Integer>();

		for(Integer i : arr){
			h.put(i,i);
		}
		for(int i=1; i<=10; i++){
			if(h.get(i)==null)
				return i;
		}

		return -1;
	}

	public static void main(String[] args){
		int[] arr = {3,1,2,6,4,4,5,9,8,10};
		int j = findNum(arr);
		System.out.println(j);
	}
}