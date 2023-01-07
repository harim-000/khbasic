package khie;

import java.util.Scanner;

/*
 * [문제1] 키보드로 점수를 입력받아서 90점 이상이면 "A학점",
 *        80~89점이면 "B학점", 70~79점이면 "C학점",
 *        60~69점이면 "D학점", 60점 이하이면 "F학점" 이라고
 *        화면에 출력해 보세요.
 */

public class IfElseIfExam_13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		
		int jumsu = sc.nextInt();
		
		if(jumsu >= 90) {
			System.out.println("A학점 입니다.");
		}else if(jumsu >= 80) {
			System.out.println("B학점 입니다.");
		}else if(jumsu >= 70) {
			System.out.println("C학점 입니다.");
		}else if(jumsu >= 60) {
			System.out.println("D학점 입니다.");
		}else {
			System.out.println("F학점 입니다.");
		}
		
		sc.close();

	}

}
