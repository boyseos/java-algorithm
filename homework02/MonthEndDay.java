package homework02;
/*
 * To. 개발자님
월을 입력하면 해당 월이 몇일까지인지
알려주는 프로그램을 작성해 주세요.
단) 2월은 윤년을 따지지 않고 무조건 29일입니다.
출력문장 : "??월은 **일 까지 입니다."
 */
import java.util.Scanner;
public class MonthEndDay {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("월을 입력하세요 : ");
		int month = scan.nextInt(), day = 0;
		switch(month) {
		case 2: day = 28; break;
		case 4: 
		case 6: 
		case 9: 
		case 11: day = 30; break;
		default: day = 31; break;
		}
		System.out.print((month <= 12) ? String.format("%d월은 %d일 까지 입니다.", month, day) : String.format("%d월 없습니다.", month));
	}
}
