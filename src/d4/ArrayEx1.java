package d4;

public class ArrayEx1 {

	public static void main(String[] args) {
		// 배열이란? 변수를 묶어논 것(혼자서는 의미가 없어서..) -> 리모컨으로 저장
		// 꼭 기억할 것은 -> 배열은 값이 아니라 리모컨이고 []로 보낸다.
		
		// 배열 만드는 방법 1. 크기와 내용물까지 한 번에 결정하는 방법
		int[] arr = { 10,20,30 };
		//type , int[] = int의 묶음이라는 뜻. 여기서 10,20,30이 의미없는 엑스트라들
		int[] arr2 = arr;
		// 여기서 arr,arr2는 4byte(int)
		
		System.out.println(arr);  // @ = 리모컨 // [I = referance = int의 배열
		System.out.println(arr2);
		
		arr[1] = 100;
		
		System.out.println(arr2[1]);  // 간접참조 -> 라면으로 기억
		// 두 개의 리모컨이 하나의 값을 공유 -> referance count = 2 -> 2개의 변수가 가르키고 있다.
		// 리모컨의 개수가 0개 = G.C ( Garbage Collection ) -> 자바가 자동으로 지운다.
		
		
	}
}
