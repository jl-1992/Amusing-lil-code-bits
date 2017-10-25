import java.util.HashSet;

public class Solution{
	
	public static int findNum(int[] arr){
		HashSet<Integer> h = new HashSet<Integer>();
		boolean flag = true;

		for(Integer i : arr){
			if(h.add(i)==false)
				flag=false;
		}

		if(!flag){
			for(int i=1; i<=10; i++){
				if(!h.contains(i))
					return i;
			}
		}

		return -1;
	}

	public static void main(String[] args){
		int[] arr = {3,1,2,6,4,4,5,9,8,10};
		int j = findNum(arr);
		System.out.println(j);
	}
}