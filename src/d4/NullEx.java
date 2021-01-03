package d4;

public class NullEx {

	public static void main(String[] args) {
		
		// null = 리모컨이면서 값이지만 리모컨 자리에만 들어갈 수 있다.
		// null = 빈 껍데기의 리모컨 ( 점프할 곳이 없다.)
		// int[] arr = null;
		int[] arr = null;
		
		System.out.println(arr);
		// 값처럼 null이라고 출력되지만
		//System.out.println(arr.length);
		// 출력하면 빈 리모컨이므로 에러(null point exception) 발생
		
		int[] arr2 = {1,2,3};
		
		System.out.println(arr2);
		// [I@28a418fc 출력 @=at, 위치이다.
		
		arr2 = null;
		// 리모컨이 null로 바뀌면서 arr2의 배열은 G.C가 수거
		
		int [][] mrr = { {1,2}, {3,4}, {5,6} };  // {1,2} .. 자리에 null 들어갈 수 있다.
		
		System.out.println(mrr[0]);
		
		System.out.println(mrr[0][1]);
	}
}
