import java.util.*;
import java.lang.*;

class SimpleSolution {

	public static void main(String[] args) {
		// Test cases
		System.out.println(longestSubsequence(750)); // 1011101110 [7]
		System.out.println(longestSubsequence(0)); // 0 [1]
		System.out.println(longestSubsequence(1)); // 1 [0]
		System.out.println(longestSubsequence(2)); // 10 [2]
		System.out.println(longestSubsequence(255)); // 11111111 [7]
		System.out.println(longestSubsequence(11124)); // 10101101110100 [6]
		System.out.println(longestSubsequence(47)); // 101111 [6]
		System.out.println(longestSubsequence(39)); // 100111 [4]
		System.out.println(longestSubsequence(32)); // 100000 [2]
		System.out.println(longestSubsequence(51)); // 110011 [3]
		System.out.println(longestSubsequence(103)); // 1100111 [4]
		System.out.println(longestSubsequence(157)); // 010011101 [5]
		System.out.println(longestSubsequence(32)); // 100000 [2]
	}

	/*
	Method that takes in an int, converts it to binary string,
	Then finds longest subsequence of ones if one bit is flipped.
	If binary is all ones, then one "one" must still be flipped.
	*/
	public static int longestSubsequence(int num) {
		String binaryNum = Integer.toBinaryString(num);
		if (Integer.bitCount(num) == binaryNum.length()) { // binaryNum is all ones
			return binaryNum.length() - 1;
		} else if (binaryNum.length() <= 2) { // binaryNum is less than or equal 2 digits
			return binaryNum.length();
		} 

		List<Integer> oneCount = new ArrayList<>();
		int count = 0;
		for (int i = 0; i < binaryNum.length(); i++) {
			if (binaryNum.charAt(i) == '1') {
				if (i == binaryNum.length() - 1) {
					oneCount.add(++count);
				} else {
					++count;
				}
			} else if (binaryNum.charAt(i) == '0') {
				if (count > 0) {
					oneCount.add(count);
				} 
				oneCount.add(0);
				count = 0;
			}
		}

		List<Integer> maxOneCount = new ArrayList<>();
		for (int i = 0; i < oneCount.size(); i++) {
			int max = 0;
			if (oneCount.get(i) == 0) { // check for permuatations around 0
				if (i > 0) { // check left
					max += oneCount.get(i - 1);
				}
				if (i < oneCount.size() - 1) { // check right
					max += oneCount.get(i+1);
				}
			}
			maxOneCount.add(++max);
		}
		
		return Collections.max(maxOneCount);
	}
}