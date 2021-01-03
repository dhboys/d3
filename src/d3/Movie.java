package d3;

import java.util.Iterator;

public class Movie {

	public static void main(String[] args) {
		//영화 티켓 가격을 자유롭게 할 수 있는 극장주를 상상하자. 
		//티켓 가격을 내릴수록 더 많은 사람들이 들어오게 할 수 있다. 
		//실험을 통해 극장주는 가격이 10000원일때 회당 120명이 들어온다는 것을 알게 되었다.
		// 값을 1000원 낮출때마다 30명씩 증가한다. 안타깝게도 관객의 증가는 비용 증가를 가져온다. 
		// 영화를 상영하는데 180000원가 필요하며, 관객 1명당 800원의 추가비용이 발생한다. 

		//극장주는 이익과 티켓가격 간의 정확한 관계를 파악하여 이익을 최대로 낼 수 있는 가격을 결정하고자 한다.
		
		// 메인로직 
		// 수익 = 수입 - 지출
		// 수입 = 티켓가격 * 관객수
		// 지출 = 영화상영비 + ( 관객수 * 800 )
		
		// 누적 or 변하는 변수는 무조건 바깥쪽 !
		int price = 10000;
		int count = 120;
		
		for (int i = 0; i < 10; i++) {
			
			
			int income = price * count;
			
			int outcome = 180000 + ( count * 800 );
			
			int money = income - outcome;
			
			System.out.println("가격: "+price);
			System.out.println("관객수: "+count);
			System.out.println(money);
			System.out.println("------------------------------");
			
			price = price - 1000;
			count = count + 30;
			
		} // end loop
	}
}
