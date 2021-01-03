package BasicQuest;

import java.util.Scanner;

public class PrintedGugudan {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 순서대로 나온 구구단 만들기
		
		// 재료
		// 몇 단으로 만들것인지
		System.out.println("몇 단까지 알고 싶은지?");
		int input = scanner.nextInt();
		
		// 로직
		// 옆으로 이동하다가  n번째가 되면 밑으로 이동
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= input; j++) {
				System.out.print(j+" * "+i+" = "+j*i+"\t");
			}System.out.println();	
		} // end for
		
	}
}
