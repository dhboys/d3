package d4;

public class ArrayForeach {

	public static void main(String[] args) {
		
		int[] arr = { 10,20,30,40,50};
		
		//foreach문
		for( int value : arr ) {
			System.out.println(value);		
		}
		// int value 라는 변수가 매번 loop를 돌때마다
		// int value = arr[i]; 라는 변수를 만들어줌
	}
}
