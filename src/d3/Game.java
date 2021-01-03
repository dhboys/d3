package d3;

import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		// 누군가가 3연승이 되야만 게임이 끝나는 로직으로 짜보기.
		
		boolean gameOver = true;
		while ( gameOver ) 
		// S = 0, R = 1, P = 2
		System.out.println("S = 0,R = 1,P = 2 를 입력하세요: ");
		int user = scanner.nextInt();
		// int computer = random.nextInt(2);

		int computer = (int) (Math.random() * 3);
		System.out.println(computer);
		// 컴퓨터 - 사용자

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

		switch (computer) {
		case 0:
			System.out.println("computer: 가위");
			break;
		case 1:
			System.out.println("computer: 바위");
			break;
		case 2:
			System.out.println("computer: 보");
			break;
		}

		int result = computer - user;

		if (result < 0) {
			result = result + 3;
		}

		switch (result) {
		case 0:
			System.out.println("Draw");
			break;
		case 1:
			System.out.println("Lose");
			break;
		case 2:
			System.out.println("Win");
			break;
		}
	}
}
