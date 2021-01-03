package d3;

public class RandomNum {

	public static void main(String[] args) {
		
		// 0에서 0.999999999999999까지 -> 1미만
		//double value = Math.random() * 3;
		//int valueInt = ( int ) value;
		int computer = ( int ) (Math.random() * 3);

		System.out.println(computer);
	}
}
