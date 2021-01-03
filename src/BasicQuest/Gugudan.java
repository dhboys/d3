package BasicQuest;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 구구단
		// 재료
		// 몇 단인지 입력 받기
		System.out.print("몇 단: ");
		int input = scanner.nextInt();

		if (input <= 9) {
			for (int i = 1; i <= 9; i++) {
				int result = input * i;
				System.out.println(input + " * " + i + " = " + result);
			}

		}else if (input > 9) {
			for (int i = 1; i <= input; i++) {
				int result = input * i;
				System.out.println(input + " * " + i + " = " + result);
			} // end for
		} // end if
	} // end main
}
