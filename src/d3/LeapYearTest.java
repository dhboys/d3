package d3;

public class LeapYearTest {

	public static void main(String[] args) {
		
		int year = 2020;
		
		boolean leapYear = false;
		
		if( year % 400 == 0) {
			leapYear = true;
		}else if ( year % 100 == 0) {
			leapYear = false;   // 제외 가능
		}else if ( year % 4 == 0) {
			leapYear = true;
		}
		
		int lastDate = leapYear ? 29 : 28;
		int firstDay = 6;  // 0 = 일,1 = 월, ..... 6 = 토,
		
		for (int i = 0; i < lastDate + firstDay; i++) {
			
			if ( i < firstDay ) {
				System.out.print(" " + "\t");
			}else {
				System.out.print(( i -  firstDay +1 ) +"\t");		
			}
			
			if( i % 7 == 6) {
				System.out.println("");
			}
		}
		
	}
}
