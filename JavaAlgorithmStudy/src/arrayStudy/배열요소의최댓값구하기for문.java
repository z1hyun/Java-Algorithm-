package arrayStudy;

public class 배열요소의최댓값구하기for문 {

	public static void main(String[] args) {
	
		int[] a = {22 , 57 , 11 , 91 , 32};

		int max = a[0];
		
		int n = a.length;
		
		
		for(int i=1; i<n; i++) { //배열에 길이-1만큼 for문을 실행한다. 
		  System.out.println("max : "+max);
		  System.out.println("a["+i+"]"+a[i]);
			if(a[i] > max) max = a[i];
			//만약에 배열을 순차적으로 돌았을때 max보다 큰값이 있으면 교체해준다.
		}
		System.out.println("최종 max :"+max);
	}
	
	
}
