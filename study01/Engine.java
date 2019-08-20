package study01;

import java.util.Scanner;
public class Engine {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int flag = 0;
		while(true) {
			System.out.println("0. 종료, 1. 계산기, 2.달력;");
			flag = scan.nextInt();
			System.out.println("안녕");
			switch (flag) {
			case 0:
				System.out.println("시스템 종료");
				System.out.println("while 에서 빠져나옴");
				return;
			case 1:
				System.out.println("시스템 진행");
				break;
			}
		}
	}
}
