package basicStudy;

import java.util.Scanner;

public class 세값의최댓값구하기 {

	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("세 정수의 최댓값을 구합니다.");
		
		System.out.println("a의 값 : "); 
		int a = stdIn.nextInt(); // a값을 입력받는다.
		
		/*
		 * nextInt 입력할 수 있는 입력값에는
		 * -2,147,483,648 ~ 2,147,483,647로 제한된다.
		 * 알파벳이나 기호는 입력할 수 없다.
		 */
		
		System.out.println("b의 값 : "); 
		int b = stdIn.nextInt(); // b값을 입력받는다.
		System.out.println("c의 값 : "); 
		int c = stdIn.nextInt(); // c값을 입력받는다.
	
		int max = a; // max에 a값을 넣는다.
		if (b > max) max = b; // b가 max값보다 크면 max에 b를 넣는다. 아니면 그대로 값 유지
		System.out.println("max(1) : "+max);
		if (c > max) max = c; // c가 max값보다 크면 max에 c를 넣는다. 아니면 그대로 값 유지
		System.out.println("max(2) : "+max);
	
	}
}
