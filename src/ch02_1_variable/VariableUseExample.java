package ch02_1_variable;

public class VariableUseExample {

	public static void main(String[] args) {
		int hour = 3;
		int minute = 5;
		System.out.println(hour + " �ð� " + minute + "��");
//							3		�ð�		5		��
//					���ڿ� : "3"+"�ð�"= "3�ð�"
//										"5��"
		System.out.println(3 + 3);
		System.out.println("3" + 3);
//							"3"+ "3" = "33"
	
		int totalMinute = (hour*60) + minute;
//							(3 * 60)
//								180	 + 5						
		System.out.println("�� " + totalMinute + "��");

	}
	
}
