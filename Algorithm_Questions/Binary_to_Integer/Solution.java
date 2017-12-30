import java.lang.Math;

public class Solution{

	public static int bin2int(String num){
		int sum=0;
		int pow=0;

		for(int i=num.length()-1; i>=0; i--){
			if(num.charAt(i)=='1')
				sum+= Math.pow(2,pow);
			++pow;
		}

		return sum;
	}

	

	public static void main(String[] args){
		System.out.println(bin2int("1010"));
	}
}