import java.lang.*;

class EfficientSolution {

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

	/* Loop through binary string and update length in place */
	public static int longestSubsequence(int num) {
		String binaryNum = Integer.toBinaryString(num);
		if (Integer.bitCount(num) == binaryNum.length()) { // binaryNum is all ones
			return binaryNum.length() - 1;
		} else if (binaryNum.length() <= 2) { // binaryNum is less than or equal 2 digits
			return binaryNum.length();
		}

		int currentLength = 0;
		int nextLength = 0;
		int maxLength = 0;
		boolean hasCurrentZero = false;

		for (int i = 0; i < binaryNum.length(); i++) {
			if (binaryNum.charAt(i) == '1' && !hasCurrentZero) {
				++currentLength;
			} else if (binaryNum.charAt(i) == '1' && hasCurrentZero) {
				++currentLength;
				++nextLength;
				if (i == binaryNum.length() - 1) {
					maxLength = Math.max(currentLength, maxLength);
				}
			} else if (binaryNum.charAt(i) == '0' && !hasCurrentZero) {
				hasCurrentZero = true;
				++currentLength;
			} else if (binaryNum.charAt(i) == '0' && hasCurrentZero) {
				maxLength = Math.max(currentLength, maxLength);
				currentLength = ++nextLength;
				nextLength = 0;
			}
		} 

		return maxLength;
	}
}