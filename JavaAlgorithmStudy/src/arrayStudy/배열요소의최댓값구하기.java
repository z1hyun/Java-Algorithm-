package arrayStudy;

public class 배열요소의최댓값구하기 {

	public static void main(String[] args) {
		
		int a[] = {22 , 57, 11, 91};
		
		int max; //변수 max 선언
		 
		max = a[0];
		
		if(a[1] > max) max = a[1]; //요소가 4개면 if문을 3회 실행
		if(a[2] > max) max = a[2];
		if(a[3] > max) max = a[3];
		
			
		
	}
}
