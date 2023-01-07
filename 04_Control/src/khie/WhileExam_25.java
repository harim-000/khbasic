package khie;

import java.util.Scanner;

/*
 * [문제] 키보드로 입력 받은 수까지의 홀수의 합과
 *       짝수를 합을 구하여 화면에 보여주세요.
 *       (while 반복문을 이용할 것)
 */

public class WhileExam_25 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요. : ");
		
		int max = sc.nextInt();
		
		int oddSum = 0, evenSum = 0;
		
		int su = 1;          // 반복문에서의 초기식
		
		while(su <= max) {
			
			if((su % 2) == 1) {
				// 참인 경우 - 홀수인 경우
				oddSum = oddSum + su;
			}else {
				// 거짓인 경우 - 짝수인 경우
				evenSum = evenSum + su;
			}
			
			su++;
		}
		
		System.out.println("홀수의 합 >>> " + oddSum);
		
		System.out.println("짝수의 합 >>> " + evenSum);
		
		sc.close();

	}

}
