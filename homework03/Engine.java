package homework03;
import java.util.Scanner;

public class Engine {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student stu = new Student();
		String list[] = {"사칙연산", "BMI", "하우머치", "회원가입", "윤년구하기", "달력", "랭킹", "시험결과", "누적연산", "세금", "시간계산"};
		String menu = "", result = "", st1 = "", st2 = "", st3= "";
		String[] info = {"이름","국어","영어","수학","총점","평균","합격여부","키","몸무게","BMI"};
		String[] val = new String[info.length];
		int num1 = 0, num2 = 0, num3 =0;
		System.out.println("이름을 입력하세요 : ");
		String name = scan.next();
		val[0] = name;
		for(int i = 1; i < list.length + 1; i++) {
			menu += String.format("%d.%s\t%s",i, list[i-1],(i % 7 == 0) ? "\n" : "");
		}
		menu += "\n하고싶은것을 입력하세요.(그외 종료) : ";
		while(true) {
			System.out.println(menu);
			switch(scan.nextInt()) {
			default : System.out.println("종료합니다.") ; return;
			
			case 1 : System.out.println("사칙연산");
				System.out.println("첫번째 숫자를 입력하세요 : ");
				num1 = scan.nextInt();
				System.out.println("연산자를 입력하세요 : ");
				st1 = scan.next();
				System.out.println("두번째 숫자를 입력하세요 : ");
				num2 = scan.nextInt();
				result = stu.calCulator(num1, st1, num2);
			break;
			case 2 : System.out.println("BMI");
				for(int i = 7; i < info.length - 1; i++) {
					System.out.printf("%s : ",info[i]);
					val[i] = scan.next();
				}
				val[9] = String.valueOf(stu.bmi(val[7], val[8]));
				result = String.format("%s 님의 BMI수치는 %s 입니다.\n", name , val[9]);
			break;
			case 3 : System.out.println("how much");
				stu.howMuch();
			break;
			case 4 : System.out.println("회원가입");
				
			break;
			case 5 : System.out.println("윤년구하기");
				System.out.println("구하고싶은 년도를 입력하세요 : ");
				result = stu.leapYear(scan.nextInt());
			break;
			case 6 : System.out.println("달력");
				System.out.println("월을 입력하세요 : ");
				result = stu.monthEnd(scan.nextInt());
			break;
			case 7 : System.out.println("랭킹");
					System.out.println("a의 기록을 입력하세요 : ");
					double a = scan.nextDouble();
					System.out.println("b의 기록을 입력하세요 : ");
					double b = scan.nextDouble();
					System.out.println("c의 기록을 입력하세요 : ");
					double c = scan.nextDouble();
					result = stu.rank(a, b, c);
					
				
			break;
			case 8 : System.out.println("시험결과");
				for(int i = 1; i < 4 ; i++) {
					System.out.println(info[i] + "점수 : ");
					val[i] = scan.next();
				}
				result = stu.reportCard(name, Integer.parseInt(val[1]), Integer.parseInt(val[2]), Integer.parseInt(val[3]));
			break;
			case 9 : System.out.println("누적연산(보이드로처리)");
				int eval = 0, count = 0;
				while(num1 != -1) {
					System.out.println("더하고 싶은 값을 입력하세요 (-1은 종료) : ");
					num1 = scan.nextInt();					
					result += (count != 0) ? stu.scoreCalc(num1) : num1 ;
					eval += num1;
					count ++;
					}
				result += String.format("%d 평균은 %d",eval + 1, (eval + 1)/(count-1));
			break;
			case 10 : System.out.println("연봉계산");
				System.out.print("연봉은 얼마입니까? : ");
				num1 = scan.nextInt();
				result = stu.tax(name, num1);
			break;
			case 11 : System.out.println("시간계산");
				System.out.println("원하는 초를 입력하세요 : ");
				result = stu.timeCalc(scan.nextInt());
			break;			
			}
			System.out.println(result);
		}
	}
}
