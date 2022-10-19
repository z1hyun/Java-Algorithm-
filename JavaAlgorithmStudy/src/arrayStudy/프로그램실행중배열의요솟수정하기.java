package arrayStudy;

import java.util.Scanner;

public class 프로그램실행중배열의요솟수정하기 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("키의 최댓값을 구합니다.");
		
		System.out.println("사람 수 : ");
		int num = stdIn.nextInt();	//배열의 요솟수를 입력받음
		
		int[] height = new int[num];//요솟수가 num(입력한 수 만큼) 배열을 생성
		
		for(int i = 0; i < num; i++) { //입력한 수-1만큼 배열에 값을 담는다.
			System.out.println("height["+i+"]:");
			height[i] = stdIn.nextInt();
		}
		
		System.out.println("최댓값은 "+maxOf(height)+"입니다.");
	}
	
	static int maxOf(int[] a) {
		
		int max = a[0]; //max에 a[0]을 미리 대입했음
		System.out.println("maxOf========");
		for(int i=1; i < a.length; i++){//그래서 for문은 1부터 시작한다.
			System.out.println("a["+i+"] = "+a[i]);
			if(a[i] > max) //맨처음에 1부터 시작해서 a[0]이랑 순차적으로 비교한다.
				max = a[i]; 
			System.out.println("max == "+max);
		}
		System.out.println("최종 max == "+max);
		return max;
	}
}
