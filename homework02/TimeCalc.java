package homework02;
//To.개발자님께
//초단위로 알려주는 시험이 있는데
//이 값을 몇시간 몇분 몇초인지 계속 계산해야 해서요.
//혹시 초값을 입력받으면 자동으로 계산되는 프로그램을 만들어 줄 수 있을까요?
//그러니까 500초 이면 뭐 몇시간 몇분 몇초라고 보여주면 좋겠죠.
import java.util.Scanner;
public class TimeCalc {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sec = 1;
		while((sec == 0) ? false : true) {
		System.out.print("초를 입력하세요.(0입력시 종료) : ");
		sec = scan.nextInt();
		System.out.printf((sec == 0) ? "종료합니다." : "%d시간 %d분 %d초 입니다.\n", sec/3600, sec%3600/60, sec%60);
		}
	}
}
