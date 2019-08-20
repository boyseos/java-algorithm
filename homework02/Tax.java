package homework02;
/*
 * To 개발자님

클라이언트에서 프로그램 개발 요청이 왔습니다.
이름과 연봉을 입력받아서
연봉 ***만원을 받으시는 XXX님께서 납부할 세금은 ???만원입니다.
로 출력하는 프로그램을 만들어 주세요.
단) 세율이 정책이 바뀔 때 마다 변하니,
관리자가 쉽게 적용가능하도록 만들어 주세요.
현재는 세율이 9.7프로라고 합니다.
 */
import java.util.Scanner;
public class Tax {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("이름이 뭡니까. : ");
		String name = scan.next();
		System.out.print("연봉은 얼마입니까? : ");
		int pay = scan.nextInt();
		double tax = 9.7;
		System.out.printf("연봉  %d만원을 받으시는 %s님께서 납부할 세금은 %f만원 입니다.", pay, name, pay * (100-tax)/100);	
	}
}
