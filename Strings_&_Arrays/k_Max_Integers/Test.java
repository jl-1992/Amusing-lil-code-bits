import java.util.ArrayList;

public class Test {

	static ArrayList<Integer> kLargest(int[] arr, int k) {
		ArrayList<Integer> ans = new ArrayList<>();

		while(ans.size() != k) {
			int max = Integer.MIN_VALUE;

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > max) {
					max = arr[i];
				}
			}

			ans.add(max);

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] ==  max) {
					arr[i] = Integer.MIN_VALUE;
					break;
				}
			}
		}


		return ans;

	}

	public static void main(String[] args) {
		int[] arr = {1,23,12,9,20,2,50};
		System.out.println(kLargest(arr,3));
	}
}