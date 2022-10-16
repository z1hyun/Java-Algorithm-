package basicStudy;

import java.util.Scanner;

public class for문사용1부터n까지의합과과정 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		
		do {
			System.out.println("n값 : ");
			n = stdIn.nextInt();
		} while(n <= 0);
		
		int sum = 0; // 합계
		
		for(int i=1; i<n; i++) {
			System.out.println(i+"+");
			sum += i;
		}
		
		System.out.println(n+"=");
		sum += n;
		System.out.println(sum);
	}
}
