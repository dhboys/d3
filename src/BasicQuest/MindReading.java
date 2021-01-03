package BasicQuest;

import java.util.Random;
import java.util.Scanner;

public class MindReading {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		//사용자는 1부터 100의 숫자중에 하나를 메모지에 적어 보관합니다.
		System.out.println("숫자 생각하세요");
		System.out.println("게임을 시작하려면 Enter를 눌러주세요");
		scanner.nextLine();
		
		int max = 100;
		int min = 1;
		int mid = ( max + min ) / 2;
		
		outer: while ( true) {
			mid = ( max + min ) / 2;
			//컴퓨터는 사용자에게 임의의 숫자를 보여줍니다.
			System.out.println("정답은: "+mid);
			//사용자는 보여진 숫자보다 높으면,‘H’ 낮으면 ‘L’을 입력해 줍니다.
			System.out.println("높으면 H,낮으면 L,맞으면 C를 입력하세요.");
			String userInput = scanner.nextLine();
			
			switch ( userInput ) {
			case "H":
				min = mid + 1;
				System.out.println(mid);
				break;
			case "L":
				max = mid - 1;
				System.out.println(mid);
				break;
			case "C":
				System.out.println("정답은 "+mid+"입니다.");
				break outer;
			}
	
		} // end while
		System.out.println("프로그램을 종료합니다.");
		//컴퓨터가 정답을 맞추면 사용자는 ‘C’를 입력해서 정답임을 알려줍니다.
		//컴퓨터가 사용자가 생각한 숫자를 마칠때까지 프로그램은 계속 실행되어야 합니다.
	}
}
