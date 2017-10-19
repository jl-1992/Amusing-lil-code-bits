import java.util.*;

public class Solution{	

	public static boolean isBalanced(String s){
		Stack<Character> stack = new Stack<Character>();

		for(int i=0; i<s.length(); i++){
			char c = s.charAt(i);
			if(c=='(' || c=='{' || c=='[')
				stack.push(c);
			else if(stack.isEmpty())
				return false;
			else if(c=='}' && stack.pop()!='{')
				return false;
			else if(c==')' && stack.pop()!='(')
				return false;
			else if(c==']' && stack.pop()!='[')
				return false;
		}

		return true;
	}

	public static void main(String[] args){
		String str = "(({))}";
		System.out.println(isBalanced(str));
	}
}