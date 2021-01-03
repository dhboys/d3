package BasicQuest;

import java.util.Scanner;

public class Interest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//복리계산기
		
		// 재료
		// 내가 넣은 돈
		System.out.println("적금할 금액: ");
		double money = scanner.nextDouble();
		
		// 복리 이자
		double interest = 0.1;
		
		// 적금 기간
		double year = 10;
		
		// 로직
		// 1년 후 금액
		
		for (int i = 1; i <= 10; i++) {
			money = money + ( money * 0.1);
			System.out.println(i+"년후 금액: "+money);
		}
		
		
		
		
	
	
	
	}
}
