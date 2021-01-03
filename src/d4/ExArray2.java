package d4;

import java.util.Arrays;

public class ExArray2 {

	public static void main(String[] args) {

		int[] arrays = { 20, 15, 37, 87, 40 };

		int min = 1000;

		for (int i = 0; i < arrays.length; i++) {
			// 첫번째 수 넣기 -> 첫번째 수는 max가 됨
			if (min > arrays[i]) {
				min = arrays[i];
			}

			// System.out.println("배열의 합: "+sum);
		}
		System.out.println(Arrays.toString(arrays));
		
	}
}