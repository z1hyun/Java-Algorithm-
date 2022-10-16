package basicStudy;

import java.util.Scanner;

public class 세값의중앙값구하기 {

	static int med3(int a, int b , int c) {
		if(a>=b)
			if(b>=c) 
				return b;
			else if(a<=c) 
				return a;
			else 
				return c;
		else if(a>c)
			return a;
		else if(b>c)
			return c;
		else
			return b;
		
	}
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("a의 값 : "); 
		int a = stdIn.nextInt(); // a값을 입력받는
		
		System.out.println("b의 값 : "); 
		int b = stdIn.nextInt(); // b값을 입력받는다.
		System.out.println("c의 값 : "); 
		int c = stdIn.nextInt(); // c값을 입력받는다.
		
		System.out.println("중앙 값은 : "+med3(a,b,c)+"입니다.");
		
	}
}
