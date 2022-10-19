package arrayStudy;

public class array기본값 {

	public static void main(String[] args) {
		
		//배열을 선언한후에 배열에 값 할당하기
		int[] a = new int[5];
		
		a[1] = 37;
		a[2] = 51;
		a[4] = a[1]*2;
		
		
		for(int i = 0; i < a.length; i++)
			System.out.println("a["+i+"] = "+a[i]);
		
		int[] b = {1,2,3,4,5};//배열 초기화에 의해 생성
		
		for(int i = 0; i < b.length; i++) {
			System.out.println("a["+i+"] = "+b[i]);
		}
	}
	
	
}
