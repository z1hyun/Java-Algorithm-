package basicStudy;

import java.util.Scanner;

public class 반복과정1부터n까지의합과과정 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		
		do {
			System.out.println("n값 : ");
			n = stdIn.nextInt();
		} while(n <= 0);
		
		int sum = 0; // 합계
		
		for(int i = 1; i<=n; i++) {
			if(i<n)
				System.out.println(i+"+");//중간과정
			else
				System.out.println(i+"="); // 마지막 과정
			sum+=i; // i까지의 과정을 총 합계
		}
		System.out.println(sum);
	}
}
