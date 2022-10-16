package basicStudy;

public class 세값의최댓값구하기_메소드 {

	
	public static void main(String[] args) {
		
		System.out.println("max(3,5,8) : "+max3(3,5,8));
		System.out.println("max(4,8,1) : "+max3(4,8,1));
		System.out.println("max(2,6,4) : "+max3(2,6,4));
		System.out.println("max(1,8,9) : "+max3(1,8,9));
	}
	
	/*
	 * 매개변수 : 메소드를 정의할 때는 넣는 값
	 * 실인수 : 메소드 호출할 때 넣는 값 
	 */
	
	
	
	
	public static int max3(int a , int b , int c) {
		int max = a;
		if(b>max) max = b;
		if(c>max) max = c;
		
		return max;
	}
}
