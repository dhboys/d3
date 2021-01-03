package BasicQuest;

import java.util.Random;
import java.util.Scanner;

public class LuckyGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		// 프로그램이 시작하면 사용자는 총 인원의 수를 입력받는다.
		// 입력받은 수 중에 임의의 수를 하나 지정한다.
		// 팀원들은 각 자 Enter를 입력하게 되고, 사용자가 정해진 숫자인 경우 ‘당첨’
		// 나머지의 경우 ‘꽝’을 출력해 준다.

		// 재료
		// 총 인원 수 입력받기
		System.out.println("총 인원수: ");
		int number = scanner.nextInt();
		System.out.println("총 인원수는 " + number + "명");
		// 입력받은 수중 임의의 수 하나 지정
		int lucky = (int) (Math.random() * number + 1);
		// 인원 수만큼 enter 입력
		System.out.println("Enter를 눌러 게임을 시작하세요.");
		scanner.nextLine();
		for (int i = 0; i < number; i++) {
			scanner.nextLine();
			int randomNum = (int) (Math.random() * number + 1);
			System.out.println(randomNum);

			if (lucky == randomNum) {
				// 랜덤수가 정해진 숫자와 같으면 당첨
				System.out.println("당첨 !");
				break;
			} else {
				// 나머지의 경우 꽝 출력
				System.out.println("꽝 !");
			} // end if
		} // end for
	}
}
