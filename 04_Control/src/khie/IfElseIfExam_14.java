package khie;

import java.util.Scanner;

/*
 * [문제2] 이름과 국어점수, 영어점수, 수학점수, 자바점수를
 *        키보드로 입력을 받아서 성적을 처리해 보세요.
 *        각 과목의 점수와 총점, 평균, 학점을 화면에
 *        출력해 주세요..
 */

public class IfElseIfExam_14 {

	public static void main(String[] args) {
		
		// 1. 키보드 준비 작업
		Scanner sc = new Scanner(System.in);
		
		// 2-1. 키보드로 이름을 입력을 받자.
		System.out.print("이름을 입력하세요. : ");
		String name = sc.next();
		
		// 2-2. 키보드로 국어점수를 입력을 받자.
		System.out.print("국어 점수 입력 : ");
		int kor = sc.nextInt();
		
		// 2-3. 키보드로 영어점수를 입력을 받자.
		System.out.print("영어 점수 입력 : ");
		int eng = sc.nextInt();
		
		// 2-4. 키보드로 수학점수를 입력을 받자.
		System.out.print("수학 점수 입력 : ");
		int mat = sc.nextInt();
		
		// 2-5. 키보드로 자바점수를 입력을 받자.
		System.out.print("자바 점수 입력 : ");
		int java = sc.nextInt();
		
		// 3. 총점을 구하자.
		//    각 과목 점수 더해 주면 된다.
		int sum = kor + eng + mat + java;
		
		// 4. 평균을 구하자.
		//    평균 = 총점 / 과목 수
		double avg = sum / 4.0;
		
		// 5. 학점을 구하자.
		//    학점 = 평균을 가지고 다중 if~else문으로 처리.
		String grade;
		
		if(avg >= 90) {
			grade = "A학점";
		}else if(avg >= 80) {
			grade = "B학점";
		}else if(avg >= 70) {
			grade = "C학점";
		}else if(avg >= 60) {
			grade = "D학점";
		}else {
			grade = "F학점";
		}
		
		
		// 6. 한꺼번에 성적 정보를 화면에 출력을 하자.
		System.out.println("이   름 : " + name);
		System.out.println("국어점수 : " + kor +"점");
		System.out.println("영어점수 : " + eng +"점");
		System.out.println("수학점수 : " + mat +"점");
		System.out.println("자바점수 : " + java +"점");
		System.out.println("총   점 : " + sum +"점");
		System.out.printf("평   균 : %.2f점\n", avg);
		System.out.println("학   점 : " + grade);

		sc.close();
	}

}
