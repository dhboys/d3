package BasicQuest;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 윤년인지 아닌지 구하고
		// 재료

		System.out.println("해당 년도를 입력하세요: ");
		int year = scanner.nextInt();
		boolean leapYear = true;
		// 400으로 나눠떨어지면 윤년
		if (year % 400 == 0) {
			leapYear = true;
			// 100으로 나눠떨어지면 평년
		} else if (year % 100 == 0) {
			leapYear = false;
			// 4로 나눠떨어지면 윤년
		} else if (year % 4 == 0) {
			leapYear = true;
		} else {
			leapYear = false;
		}

		// 2월달 달력을 만들어라
		int lastdate = leapYear ? 29 : 28;
		System.out.println(year + "의 2월은 " + lastdate + "일 이다");
		int firstDay = 4; // 토요일

		// 1일은 토요일, 토요일 이전은 빈칸으로 남겨야한다.
		for (int i = 0; i < (firstDay + lastdate); i++) {
			if ( i < firstDay ) {
				System.out.print(" " + "\t");
			}else if ( i >= firstDay ) {
				System.out.print( (i - firstDay + 1)+"\t");
			}
			if ( i % 7 == 6) {
				System.out.println();
			}
		} // end for
	}
}
