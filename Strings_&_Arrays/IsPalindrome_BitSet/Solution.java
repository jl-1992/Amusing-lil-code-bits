import java.util.BitSet;

public class Solution{

	public static boolean isPalindrome(String s){

		if(s.length()%2==0)
			return false;

		BitSet b = new BitSet(128);
		int count=0;

		for(int i=0; i<s.length(); i++)
			b.flip((int) s.charAt(i));

		for(int i=0; i<b.size(); i++){
			if(b.get(i))
				++count;
		}

		return count==1;
	}
	
	public static void main(String[] args){
		System.out.println(isPalindrome("racecar"));
	}
}