package basicStudy;

import java.util.Scanner;

public class 양수만입력받아1부터n까지의합구하기 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("1부터 n까지의 합을 구하기");
		/*
		 * n이 0보다 클 때 까지 반복한다.
		 */
		do {
			System.out.println("n의 값 : ");
			n = stdIn.nextInt();
		} while(n<=0);
		//0을 입력하면 다시 do문으로 돌아간다.
		
		int sum = 0;
		
		for(int i=1; i<=n; i++)
			sum += i;
			
			System.out.println("1부터 "+n+"까지의 합은 "+sum+"입니다.");
	}
}
