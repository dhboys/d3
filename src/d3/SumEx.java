package d3;

public class SumEx {

	// ctrl shift f
	public static void main(String[] args) {

		int result = 0; // 누적이나 합 -> 루프의 바깥쪽에 선언
		
		for ( int i = 1; i <= 10; i++ ) {
			
			result = result + i;
			
			// 0 + 1
			// 1 + 2
			// 3 + 3
			// 6 + 4
			
			System.out.println(result);
		}
	}
}
