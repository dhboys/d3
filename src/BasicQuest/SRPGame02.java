package BasicQuest;

import java.util.Random;
import java.util.Scanner;

public class SRPGame02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		//사용자와 컴퓨터는 가위바위보 게임을 합니다.
		//가위 - S / 바위 - R / 보 - P 를 입력하면 컴퓨터는 임의의 데이터를 발생시켜서
		//게임을 진행하고, 결과를 보여줍니다.
		//게임을 10번 진행 했을 때 사용자가 몇 번의 승리와 패배, 비겼는지를 출력해 줄 것
		

		int userWin = 0; // 유저가 이긴 횟수
		int userLose = 0; // com이 이긴 횟수
		int drawCount = 0; // 비긴 횟수
	
	game : for (int i = 1; i <= 10; i++) {
		
		// S = 0 , R = 1, P = 2
		// 가위 = 0, 주먹 = 1, 보 = 2
		System.out.println("S = 0, R = 1, P = 2를 입력하세요: ");
		int user = scanner.nextInt();
		
		// 사용자가 0~2 이외의 숫자 입력시
		
		if(!( user >= 0 && user <= 2)) {
			System.out.println("다시 입력해주세요");
			continue;
		}
		
		// 컴퓨터가 랜덤한 숫자 생성
		int com = random.nextInt(2); // 0에서 2까지의 랜덤한 숫자 생성
		// 혹은 int com = (int) (Math.random() * 3);
		// 1차이 내가 win, 2차이 lose
		
		switch ( user ) {
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
		
		switch ( com ) {
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
		
		if ( result < 0) {
			result = result + 3;
		}
		
			switch (result) {
			case 1:
				System.out.println("Win");
				userWin++;
				break;
			case 2:
				System.out.println("Lose");
				userLose++;
				break;
			case 0:
				System.out.println("Draw");
				drawCount++;
				break;
			// 3번 연속으로 한쪽이 이기면 게임 종료
			}
		} // end for
		System.out.println("user가 이긴 횟수: "+userWin);
		System.out.println("user가 진 횟수: "+userLose);
		System.out.println("user가 비긴 횟수: "+drawCount);
	}
}
