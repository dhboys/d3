package d4;

public class ArrayEx3 {

	public static void main(String[] args) {
////////날씨 데이터
		
		double[] data = {40,38,38,35,34,35,46,35,33,37};
		// 1. 루프를 돌아서 내용물을 출력
		//for ( int i = 0; i < data.length; i++) {
		//	System.out.println(data[i]);
		//}
		
		
		// 2. 전체의 합과 전체의 평균
		double sum = 0;
		
		for ( int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
			sum = sum + data[i];
		}
		System.out.println("--------------------");
		System.out.println(sum);
		
		System.out.println(sum / data.length);
		
		System.out.println("--------------------");
		 //3. 제일 높은 수를 구하기
		double max = data[0];
		// 높은사람이 계속 갱신
		for (int i = 0; i < data.length; i++) {
			
			double temp = data[i];
			if ( temp > max ) {
				max = temp;
			}
		}
		System.out.println(max);
		// 4. 제일 높은 수와 인덱스 번호 구하기
	}
}
