package d4;

import java.util.Arrays;
import java.util.Scanner;

public class ExArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] grades = new int[5];
		
		for (int i = 0; i < grades.length; i++) {
			System.out.println(i + " 성적점수를 넣어주세요.");
			int userInput = scanner.nextInt();
			grades[i] = userInput;
		}  // end for
		
		System.out.println("처리할 점수들은 다음과 같습니다.");
		System.out.println(Arrays.toString(grades));
	}
}
