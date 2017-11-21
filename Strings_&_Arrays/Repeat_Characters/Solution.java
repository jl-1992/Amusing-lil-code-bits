import java.util.*;

public class Solution{

	public static void printRepeat(String s){
		HashSet<Character> h = new HashSet<Character>();
		HashSet<Character> h2 = new HashSet<Character>();

		for(int i=0; i<s.length(); i++){
			if(h.add(s.charAt(i))==false)
				h2.add(s.charAt(i));
		}

		for(Character c : h2)
			System.out.println(c);
	}

	public static void main(String[] args){
		printRepeat("hello");
	}
}