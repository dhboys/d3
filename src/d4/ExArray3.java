package d4;

import java.util.Arrays;

public class ExArray3 {

	public static void main(String[] args) {
	
//System.arraycopy([원본 배열], [원본의 복사 시작 인덱스 번호], [대상 배열], [대상 배열의 복사 시작 인덱스 번호], [개수]);

		int [] arrays = { 1,2,3,4,5 };
		int [] temp = { 1,2,0,0,0};
		
		System.arraycopy(arrays , 2 , temp , 2 ,3 );
		System.out.println(Arrays.toString(arrays));
		System.out.println(Arrays.toString(temp));
	
	}
}
