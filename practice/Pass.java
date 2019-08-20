package practice;
/*
 * To. 개발자님
       * 프로그램을 하나 개발해야 합니다.
       * 교수는 학생과 국어, 영어, 수학점수만 입력하면
       * 총점, 평균, 합격여부가 출력되는 프로그램 입니다.
       * 오더는 다음과 같이 화면에 출력하라고 합니다.
       * 학생           국어        영어        수학        총점        평균        합격여부
       * =======================================================
       * 홍길동     90       90      90     270      90       (장학생)
       * 합격여부는 다음과 같다고 합니다.
       * 평균이 90점 이상이면 장학생
       * 70점 이상 90점미만 이면 합격
       * 70미만이면 불합격이라고 하네요.
       * 단) 평균에서 소수점이하는 절삭입니다.

 */

import java.util.Scanner;
public class Pass {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] info = {"학생","국어","영어","수학","총점","평균","합격여부"};
		String[] val = new String[info.length];
		for(int i = 0; i < 4 ; i++) {
			System.out.println(info[i] + " : ");
			val[i] = scan.next();
		}
		String result = String.format("학생\t국어\t영어\t수학\t총점\t평균\t합격여부\n==========================================================\n", args);		
		int sum = Integer.parseInt(val[1]) + Integer.parseInt(val[2]) + Integer.parseInt(val[3]);
		int avg = sum/3;
		val[4] = String.valueOf(sum);
		val[5] = String.valueOf(avg);
		val[6] = (avg >= 90) ? "장학생" : (avg >= 70) ? "합격" : "불합격";
		for(int i = 0; i < info.length; i++) {
			result += String.format("%s\t", val[i]);
		}
		System.out.print(result);
	}
}
