package basicStudy;

import java.util.Scanner;

public class n개출력하되w개마다줄바꾸기 {
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		int n,w;
		
		System.out.println("*를 n개 출력하되 w개마다 줄을 바꿔서 출력합니다.");
	
		do {
			System.out.println("n의 값 :");
			n = stdIn.nextInt();
		}while (n <= 0);
		
		
		do {
			System.out.println("w의 값 :");
			w = stdIn.nextInt();
		} while ( w <= 0 || w > n);
		
		for(int i = 0; i < n; i++) {
			System.out.println("*");
			
			if( i % w == w -1)
				System.out.println();
		}
		
		if(n % w != 0)
			System.out.println();
	}

}
