package ch02_1_variable;

public class VariableUseExample {

	public static void main(String[] args) {
		int hour = 3;
		int minute = 5;
		System.out.println(hour + " 시간 " + minute + "분");
//							3		시간		5		분
//					문자열 : "3"+"시간"= "3시간"
//										"5분"
		System.out.println(3 + 3);
		System.out.println("3" + 3);
//							"3"+ "3" = "33"
	
		int totalMinute = (hour*60) + minute;
//							(3 * 60)
//								180	 + 5						
		System.out.println("총 " + totalMinute + "분");

	}
	
}
