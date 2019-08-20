package homework03;

import java.util.Scanner;

public class Student {
	public String calCulator(int numA, String opp, int numB) {
		String result = "";
		switch(opp) {
		case "+" : result = String.format("%d + %d = %d", numA, numB, numA+numB);
		case "-" : result = String.format("%d - %d = %d", numA, numB, numA-numB);
		case "*" : result = String.format("%d * %d = %d", numA, numB, numA*numB);
		case "/" : result = String.format("%d / %d = %d [%d]", numA, numB, numA/numB, numA%numB);
		}
		return result;
	}
	public double bmi(String height,String weight) {
		return Double.parseDouble(weight) / (Double.parseDouble(height)*Double.parseDouble(height)/10000);
	}
	public void howMuch() {
		Scanner scan = new Scanner(System.in);
		System.out.println("얼마입니까 ? :");
		int cost = scan.nextInt();
		System.out.println("몇개 드릴까요? : ");
		int many = scan.nextInt();
		System.out.printf("%d 개 주세요.\n", many);
		System.out.printf("총 금액은 %d원 입니다.", many * cost);
		int dc = 10;
		int total = many * cost * (100 - dc) / 100;
		System.out.printf("비싸요 %d 깍아주세요.\n 그럼  %d만 주세요.", dc,total);
	}
	public String join() {
		return "";
	}
	public String leapYear(int year) {
		return String.format("%d 년은 %s 입니다.", year, (year%4 == 0) ? (year%100 != 0) ? "윤년" : (year%400 == 0) ? "윤년" : "평년" : "평년");
	}
	public String monthEnd(int month) {
		int day = 0;
		switch(month) {
		case 2: day = 28; break;
		case 4: 
		case 6: 
		case 9: 
		case 11: day = 30; break;
		default: day = 31; break;
		}
		return (month <= 12) ? String.format("%d월은 %d일 까지 입니다.", month, day) : String.format("%d월 없습니다.", month);
	}
	public String rank(double a, double b, double c) {
		String[] name = {"A","B","C"};
		double[] score = {a,b,c};
		String tempS = "", result = "";
		double tempN = 0.0;
		for( int i = 0; i <3 ; i++) {
			for(int j = 0; j < 3; j++) {
				if(score[i] < score[j]) {
					tempS = name[i];
					tempN = score[i];
					name[i] = name[j];
					score[i] = score[j];
					name[j] = tempS;
					score[j] = tempN;
				}
			}
		}			
		for(int i = 0; i < 3; i++) {
			result += String.format("%d등 %s %f초\n", i+1, name[i], score[i]);
		}
		return result;
	}
	public String reportCard(String name, int kor, int eng, int math) {	
		int avg = (kor + eng + math) /3;
		return String.format("학생\t국어\t영어\t수학\t총점\t평균\t합격여부\n==========================================================\n"
				+ "%s\t%d\t%d\t%d\t%d\t%d\t%s\n",
				name, kor, eng, math, kor + eng + math, avg, (avg >= 90) ? "장학생" : (avg >= 70) ? "합격" : "불합격" );
	}
	public String scoreCalc(int sum) {
		return (sum != -1) ? String.format("+%d",sum) : "=";
	}
	public String tax(String name, int pay) {
		double tax = 9.7;
		return String.format("연봉  %d만원을 받으시는 %s님께서 납부할 세금은 %f만원 입니다.", pay, name, pay * (100-tax)/100);
	}
	public String timeCalc(int time) {
		return String.format("%d시간 %d분 %d초입니다.", time/3600, time%3600/60, time%60);
	}
}
