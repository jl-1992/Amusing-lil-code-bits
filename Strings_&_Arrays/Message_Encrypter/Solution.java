import java.lang.Math;

public class Solution{

	public static String encrypt(String s){

		String ans = "";
		double root = Math.sqrt(s.length());
		int newRoot = (int) root;

		if(root!=(double) newRoot)
			++newRoot;

		char[][] msg = new char[newRoot][newRoot];
		int k=0;

		for(int i=0; i<msg.length; i++){
			for(int j=0; j<msg.length; j++){
				if(k<s.length() && s.charAt(k)==' ')
					msg[i][j]='*';
				else if(k<s.length() && s.charAt(k)!=' ')
					msg[i][j]=s.charAt(k);
				else{
					msg[i][j]='.';
				}
				k++;
			}
		}

		for(int i=0; i<msg.length; i++){
			for(int j=0; j<msg.length; j++){
				ans+=msg[j][i];
			}
		}

		return ans;

	}
	
	public static void main(String[] args){
		String s = "Lets go to the sandwich shop today";
		System.out.println(encrypt(s));
	}
}