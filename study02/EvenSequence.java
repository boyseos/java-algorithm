package study02;
import java.util.Scanner;

public class EvenSequence {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("시작값을 입력하세요 : ");
		int startNum = scan.nextInt();
		System.out.println("마지막값을 입력하세요 : ");
		int endNum = scan.nextInt();
		if(endNum < startNum) {
			int temp = endNum;
			endNum = startNum;
			startNum = temp;
		}
		String sequence = "";
		int series = 0;
		for(int i = startNum; i <= (endNum += (endNum % 2 == 0) ? 0 : -1); i++) {
			sequence += (i % 2 == 0) ? i + " + " : "";
			series += (i % 2 == 0) ? i : 0;
		}
		System.out.println(sequence + series);
	}
}
