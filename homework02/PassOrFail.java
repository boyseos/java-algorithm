package homework02;
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
public class PassOrFail {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] item = {"학생","국어","영어","수학","총점","평균","합격여부"};
		String[] stu = new String[item.length];
		String result = "";
		int sum = 0, arrLength = item.length;
		//입력부
		for(int i = 0; i < arrLength; i++) {
			System.out.print((i < arrLength - 3) ? (i == 0) ? item[0]+"이름을 입력하세요. : " : item[i]+"점수를 입력하세요.(정수만) : " : "");
			stu[i] = (i < arrLength - 3) ? scan.next() : "";
			result += item[i]+"\t";//String.format("%s\t", item[i]);
		}
		result += "\n===============================================================\n";
		for (int i = 1; i< arrLength - 3; i++) {
		sum += Integer.parseInt(stu[i]);
		}//연산부분 삼항쪽이 너무 길어져서 총합만 따로 처리.
		
		//연산부
		for(int i= 0; i< arrLength; i++) {
			result += (i == arrLength - 3) ? String.format("%d\t",sum) : (i == arrLength - 2) ? String.format("%d\t",sum/(arrLength-4)) : (i == arrLength - 1) ? (sum/(arrLength-4) >= 90) ? "장학생" : (sum/(arrLength-4) >= 70) ? "합격" : "불합격" : stu[i]+"\t";
		}//한줄같지 않은 한줄 완성.
		System.out.println(result);
	}
}
