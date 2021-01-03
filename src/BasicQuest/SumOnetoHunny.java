package BasicQuest;

import java.util.Scanner;

public class SumOnetoHunny {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// n1부터 n2까지 더하기

		// 재료
		System.out.println("두 수 사이를 모두 더하기");

		// 숫자 입력받기
		int number1 = 0;
		int number2 = 0;

		System.out.print("n1: ");
		number1 = scanner.nextInt();
		System.out.print("n2: ");
		number2 = scanner.nextInt();

		// 로직
		// 1. n1 < n2일 경우 n1에서 n2까지 1씩 커지면서 더한다.
		int sum = 0;

		if (number1 < number2) {
			for (int i = number1; i <= number2; i++) {
				sum = sum + i;
			}
			// 2. n1 > n2일 경우 n2에서 n1까지 1씩 커지면서 더한다.
		} else if (number1 > number2) {
			for (int i = number2; i <= number1; i++) {
				sum = sum + i;
			}
		}
		System.out.println("합은: " + sum);
	} // end main
}
