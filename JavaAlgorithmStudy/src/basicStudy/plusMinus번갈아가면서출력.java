package basicStudy;

import java.util.Scanner;

public class plusMinus번갈아가면서출력 {

	public static void main(String[] args) {

		
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		
		
		System.out.println("+와 -를 번갈아 "+n+"개 추력합니다.");
		
		for(int i=0; i<n; i++)
			if(i%2 == 0)
				System.out.print("+");
			else 
				System.out.print("-");
	}
}
