package study02;
import java.util.Scanner;
public class OddSequence {

	public static void main(String[] args) {
		//1 + 3 + 5 + 7 + 9 = 
		// i % 2 = 0 이면 짝수 1이면 홀수
		Scanner scan = new Scanner(System.in);
		System.out.println("==================");
		System.out.println("입력된 시작값에서부터 마지막값까지의 홀수의 합");
		System.out.println("==================");
		System.out.println("시작값을 입력하세요 : ");
		int startNum = scan.nextInt();
		System.out.println("끝값을 입력하세요 : ");
		int endNum = scan.nextInt();
		if(endNum < startNum) {
			int temp = endNum;
			endNum = startNum;
			startNum = temp;
		}
		String sequence = "";
		int series = 0;
		for ( int i = startNum ; i <= (endNum += (endNum % 2 == 0) ? -1 : 0); i++) {
//			if(endNum == i) {
//				sequence += i + " = ";
//			}else if(i%2 != 0) {
//				sequence += i + " + ";
//			}
			series += (i%2 != 0) ? i : 0;
			sequence += (i%2 != 0) ? ((i == endNum) ? i + " = " : i + " + " ) : "";
		}
		System.out.println(sequence + series);
	}
}
