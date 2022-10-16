package testProblem;

public class 연습문제_1 {

	/*
	 * 네 값의 최댓값을 구하는 max4메소드를 작성하네요. 작성한 메소드를 
	 * 테스트하기 위해 amin메소드를 포함한 프로그램을 작성해야 합니다.
	 */
	
	public static void main(String[] args) {
		
		System.out.println("max4(4,8,2,3) : "+max4(4,8,2,3));
		System.out.println("min3(10,2,6) : "+min3(10,2,6));
		System.out.println("min4(8,4,7,10) : "+min4(8,4,7,10));
		
	}
	
	static int max4(int a, int b, int c, int d) {
		
		int max = a;
		
		if(b > max) max = b;
		if(c > max) max = c;
		if(d > max) max = d;
		
		return max;
	}
	
	static int min3(int a, int b , int c) {
		
		int min = a;
		if(b < min) min = b;
		if(c < min) min = c;
		
		return min;
	}
	
	static int min4(int a, int b, int c, int d) {
		
		int min = a;
		if(b < min) min = b;
		if(c < min) min = c;
		if(d < min) min = d;
		
		return min;
	}
	
}
