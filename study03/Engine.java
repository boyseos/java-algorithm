package study03;
import java.util.Scanner;
import study03.Student;

public class Engine {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student student = new Student();
		String[] item = {"이름","몸무게","키","BMI"};
		String[] info = new String[item.length];
		String result = "";
		
		int flag = 0;
		while(true) {
			System.out.println("메뉴 : 0 종료 1.BMI 2.Ranking 3.HowMuch 4.ReportCard 5.학생정보");
			flag = scan.nextInt();
			switch(flag) {
			case 0 : System.out.println("종료"); return;
			case 1 : 
				System.out.println("BMI");
				for(int i = 0; i < item.length - 1; i++) {
					System.out.printf("%s : ", item[i]);
					info[i] = scan.next();
				}
				result = student.getBmi(info[0],info[1],info[2]);
				info[3] = result;
			break;
			case 2 : System.out.println("Ranking"); student.getRank(); break;
			case 3 : System.out.println("HowMuch"); student.howMuch(); break;
			case 4 : System.out.println("ReportCard");student.getRcard(); break;
			case 5 :
				result = "";
				for(int i = 0; i < item.length; i++) {
					result += item[i] + " : " + info[i] + "\n";
				}
				System.out.printf("학생정보\n%s",result);				
				break;
			}
		}
	}
}
