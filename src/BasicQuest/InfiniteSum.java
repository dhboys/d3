package BasicQuest;

import java.util.Scanner;

public class InfiniteSum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 원하는 숫자만큼 계속 입력받아서 더하기
		
		// 재료
		// 숫자 계속 입력받기
		System.out.println("더하고 숫자를 입력하세요: ");
		System.out.println("다 더하고 싶으면 '0'을 입력하세요");
		int input = 0;
		int sum = input;
		while ( true ) {
			input = scanner.nextInt();
			sum = sum + input;
			if ( input == 0 ) {
				break;
			}
		}System.out.println("입력한 숫자의 합: "+sum);
		
		// 로직
		// 숫자를 계속 입력 받고 결과를 알고 싶으면 다 더해주기
	}
}
