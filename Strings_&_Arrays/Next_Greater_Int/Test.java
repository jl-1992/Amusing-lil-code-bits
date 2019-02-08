import java.util.ArrayList;

public class Test {

	public static ArrayList<Integer> nextGreater(ArrayList<Integer> arr) {
		ArrayList<Integer> ans = new ArrayList<>();

		for (int i = 0; i < arr.size(); i++) {
			int j = 0;
			for (j = i+1; j < arr.size(); j++) {
				if (arr.get(j) > arr.get(i)) {
					ans.add(arr.get(j));
					break;
				}
			}
			if (j == arr.size())
				ans.add(-1);
		}

		return ans;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();

		arr.add(4);
		arr.add(5);
		arr.add(2);
		arr.add(25);

		System.out.println(nextGreater(arr));
	}
}