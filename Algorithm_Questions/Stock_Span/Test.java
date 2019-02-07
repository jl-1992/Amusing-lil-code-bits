import java.util.ArrayList;

public class Test {

	public static ArrayList<Integer> stockSpan(ArrayList<Integer> arr) {

		ArrayList<Integer> span = new ArrayList<>();

		// Method 1: Iteration

		for(int i = 0; i < arr.size(); i++) {
			int count = 1;
			for(int j = 0; j <= i; j++) {
				if (arr.get(i) > arr.get(j))
					++count;
			}
			span.add(count);
		}
		return span;
	}
	
	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<>();

		arr.add(100);
		arr.add(80);
		arr.add(60);
		arr.add(70);
		arr.add(60);
		arr.add(75);
		arr.add(85);

		System.out.println(stockSpan(arr));
	}
}