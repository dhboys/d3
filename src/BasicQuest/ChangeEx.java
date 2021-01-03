package BasicQuest;

import java.util.Scanner;

public class ChangeEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 거스름돈
		// 재료
		// 받은 돈
		System.out.println("얼마를 받았습니까: ");
		int money = ( scanner.nextInt() / 10 ) * 10 ; // 1원 단위는 절삭
		
		// 로직
		// 500원,100원,10원 단위로
		int count500 = money / 500;
		money = money - ( count500 * 500 );
		int count100 = money / 100;
		money = money - ( count100 * 100);
		int count10 = money / 10;
		
		System.out.println("500원짜리: "+count500);
		System.out.println("100원짜리: "+count100);
		System.out.println("10원짜리: "+count10);
	} // end main
}
