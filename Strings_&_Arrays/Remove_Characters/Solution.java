public class Solution{

	public static String delete(String str, char ch){
		if(str.equals(""))
			return "";
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i)==ch){
				str = str.substring(0,i) + str.substring(i+1);
				i--;
			}
		}

		return str;
	}
	

	public static void main(String[] args){
		System.out.println(delete("hello", 'e'));
	}
}