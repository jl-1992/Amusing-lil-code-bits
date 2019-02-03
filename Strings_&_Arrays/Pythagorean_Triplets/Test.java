import java.util.List;
import java.util.ArrayList;
import java.util.stream.*;

public class Test {

	static boolean pyTrip(ArrayList<Integer> arr) {
		List<Integer> squared = arr.stream()
								   .sorted()
							       .map(x-> x * x)
							       .collect(Collectors.toList());

		for (int i = squared.size() - 1; i >= 2; i--) {
			int beg = 0;
			int end = i-1;
			while (beg < end) {
				if (squared.get(beg) + squared.get(end) == squared.get(i))
					return true;
				else if (squared.get(beg) + squared.get(end) < squared.get(i))
					beg++;
				else
					end--;
			}
		}
		return false;
	}


	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();

		arr.add(13);
		arr.add(4);
		arr.add(6);
		arr.add(12);
		arr.add(5);

		System.out.println(pyTrip(arr));

	}
}