package BasicQuest;

import java.util.Random;
import java.util.Scanner;

public class SRPGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int userCount = 0; // 유저가 이긴 횟수
		int comCount = 0; // com이 이긴 횟수

		while (true) {
			// S = 0 , R = 1, P = 2
			// 가위 = 0, 주먹 = 1, 보 = 2
			System.out.println("S = 0, R = 1, P = 2를 입력하세요: ");
			int user = scanner.nextInt();

			// 사용자가 0~2 이외의 숫자 입력시

			if (!(user >= 0 && user <= 2)) {
				// 모르는 식이지만 게시판에 올라온 식을 가져와 써봤습니다.
				System.out.println("다시 입력해주세요");
				continue;
			}

			// 컴퓨터가 랜덤한 숫자 생성
			int com = random.nextInt(2); // 0에서 2까지의 랜덤한 숫자 생성
			// 혹은 int com = (int) (Math.random() * 3);
			// 1차이 내가 win, 2차이 lose

			switch (user) {
			case 0:
				System.out.println("user: 가위");
				break;
			case 1:
				System.out.println("user: 바위");
				break;
			case 2:
				System.out.println("user: 보");
				break;
			}

			switch (com) {
			case 0:
				System.out.println("com: 가위");
				break;
			case 1:
				System.out.println("com: 바위");
				break;
			case 2:
				System.out.println("com: 보");
				break;
			}

			// user - com < 0 이면 + 3

			int result = user - com;

			if (result < 0) {
				result = result + 3;
			}

			switch (result) {
			case 1:
				System.out.println("Win");
				userCount++;
				comCount = 0;
				System.out.println("user가 연속으로 이긴횟수: " + userCount);
				break;
			case 2:
				System.out.println("Lose");
				comCount++;
				userCount = 0;
				System.out.println("com가 연속으로 이긴횟수: " + comCount);
				break;
			case 0:
				System.out.println("Draw");
				break;
			}
		
			// 3번 연속으로 한쪽이 이기면 게임 종료
			if (userCount == 3 || comCount == 3) {
				System.out.println("Gameover");
				break;
			}
		} // end while
	} // end main
}
