package d4;

import java.util.Arrays;

public class ArrayEx2 {

	public static void main(String[] args) {
		
		// 배열만드는 2번째 방법
		// new = 새로 메모리공간을 만든다 -> 반드시 크기를 지정
		int[] arr = new int[5]; // int[] arr = new int[] { 10, 20, 30 }도 가능
		
		System.out.println(arr[0]); // int변수의 기본값은 0이므로 0으로 설정됨
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		// 규칙적으로 증가 -> loop로 바꿀 수 있다.
		System.out.println(arr.length); // .length = 몇 칸짜리인지 알아낼 때 ( index는 0 부터이므로 개수는 +1 )
		
		int[] arr2 = new int[5];
		
		for ( int i = 0; i < arr2.length; i++) {
			arr2[i] = ( i + 1 ) * 10; 
		}
		System.out.println(Arrays.toString(arr2));
			
		
		
	}
}
