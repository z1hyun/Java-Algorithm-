package testProblem;

import java.util.Scanner;

public class 연습문제_3 {

	/*
	 * 양의 정수를 입력하고 자릿수를 출력하는 프로그램을 작성하세요.
	 * 예를 들어 135를 입력하면 '그 수는 3자리입니다.'라고 출력하고, 1314를 입력하면 
	 * '그 수는 4자리입니다.'라고 출력합니다.
	 */
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		int num = stdIn.nextInt();
		int length = (int) (Math.log10(num)+1);
		System.out.println("입력 값  :" +num);
		if(num>0) {
			System.out.println("그 수는"+length+"자리 입니다.");
		}
	}
}
