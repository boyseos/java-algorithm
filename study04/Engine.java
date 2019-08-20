package study04;
import java.util.Scanner;

public class Engine {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student student = new Student();
		String result = "";
		while(true) {
			System.out.println("0.종료 1.BMI 2.대출");
			switch(scan.nextInt()) {
			case 0: System.out.println("종료"); return;
			case 1:	System.out.println("BMI");
				String name = "바보", height = "166.7", weight = "55.7";
				result = student.getBmi(name,height,weight);
				break;
			case 2: System.out.println("대출");
				System.out.println("통장 잔고를 입력하세요 : ");
				int bank = scan.nextInt();
				String name2 = "바보";
				result = student.cash(bank, name2);
				System.out.println(result);
				break;
			}
		}
	}
}
