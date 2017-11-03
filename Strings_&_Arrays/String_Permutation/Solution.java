import java.util.*;

public class Solution{

	public static ArrayList<String> permutations(String s){
		ArrayList<String> temp = new ArrayList<String>();
		ArrayList<String> ans = new ArrayList<String>();

		if(s.equals("")){
			temp.add("");
			return temp;
		}

		char c = s.charAt(0);

		temp=permutations(s.substring(1));

		for(String str : temp){
			for(int i=0; i<=str.length(); i++){
				ans.add(str.substring(0,i) + c + str.substring(i));
			}
		}
		
		return ans;
	}
	
	public static void main(String[] args){
		System.out.println(permutations("abc"));
	}
}