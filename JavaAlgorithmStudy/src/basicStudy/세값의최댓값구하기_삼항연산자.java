package basicStudy;

import java.util.Scanner;

public class 세값의최댓값구하기_삼항연산자 {

	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("세 정수의 최댓값을 구합니다.");
		
		System.out.println("a의 값 : "); 
		int a = stdIn.nextInt(); // a값을 입력받는다.
	
		System.out.println("b의 값 : "); 
		int b = stdIn.nextInt(); // b값을 입력받는다.
		System.out.println("c의 값 : "); 
		int c = stdIn.nextInt(); // c값을 입력받는다.
		
		int max = a>b?a:b;
		System.out.println("max(1) : "+max);
		max = max > c ? max : c;
		System.out.println("max(2) : "+max);
		
	}
}
