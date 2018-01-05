import java.lang.Math;

public class Solution{

	public static boolean isArmstrong(int n){
		int sum=0, power=1, mod=10, norm=1;

		while(n%mod!=n){
			++power;
			mod*=10;
		}

		mod=10;

		for(int i=0; i<power; i++){
			sum+=Math.pow(((n%mod)/norm),power);
			mod*=10;
			norm*=10;
		}

		return n==sum;
	}
	
	public static void main(String[] args){
		System.out.println(isArmstrong(1634));
	}
}