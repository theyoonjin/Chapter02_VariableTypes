package ch02_1_variable;

public class VariableExchangeExample {
	public static void main(String[] args) {
//		[변수에 할당된 값 스와핑]		
		int x = 100;
		int y = 200;
		int temp;
		
		temp = x; //100

		x = y; // 200
		System.out.println("x=y,x의 값: " + x);
		System.out.println("x=y,y의 값: " + y);
		
		System.out.println();
	
		y = temp;
		
		
		y = x; // x:200
		
		int x = 3; // 5
		int y = 5; // 3
		System.out.println("x:" + x + ", y:" + y);
//		x:3, y:5	
		
//		x = y; // 5 x : 5
//		y = x; // 5 y : 5
		
		int temp = x;//3
		x = y;
		y = temp;
				
		System.out.println("x:" + x + ", y:" + y);		
	}
}