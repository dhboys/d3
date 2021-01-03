package d4;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		
		int[] arr = { 100,91,30,30,40,50 };
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
