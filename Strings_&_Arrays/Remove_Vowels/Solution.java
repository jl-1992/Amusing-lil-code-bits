public class Solution{

	public static String removeVowels(String s){
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
				s=s.substring(0,i) + s.substring(i+1);
		}

		return s;
	}
	
	public static void main(String[] args){
		String str = "hello";
		System.out.println(removeVowels(str));
	}
}