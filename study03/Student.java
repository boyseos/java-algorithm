package study03;
import java.util.Scanner;

public class Student {
	// BMI Raking HowMuch ReportCard
	public /*static 절차지향*/ String getBmi(String name, String weight, String height) {
		double bmi = Double.parseDouble(weight) / (Double.parseDouble(height)*Double.parseDouble(height)/10000);
		System.out.printf("%s 의 BMI는 %f로 %s입니다.\n",name, bmi, (bmi > 30) ? "고도비만" : (bmi > 25) ? "비만" : (bmi > 23) ? "과체중" : (bmi > 18.5) ? "정상" : "저체중");
		return String.valueOf(bmi);
		
	}
	public void getRank() {
		Scanner scan = new Scanner(System.in);
		String[] name = {"A","B","C"}, time = new String[name.length];
		int arrayLength = name.length;
		boolean[] check = new boolean[arrayLength];
		for(int i = 0; i < arrayLength; i++) {
			System.out.print(name[i]+" 선수 기록 : ");
			time[i] = scan.next();
		}
		String result = "####### 성적 랭킹 #######\n";
		for(int i = 0; i < arrayLength; i++) {
			int temp = i;
			String tempS = String.format("%d등 : %s 선수(%s초)\n",i + 1, name[i], time[i]);
			for(int j = 0; j < arrayLength; j++) {				
				if(check[temp] == true || (check[j] != true && Double.parseDouble(time[temp]) > Double.parseDouble(time[j]))){
					tempS = String.format("%d등 : %s 선수(%s초)\n",i + 1, name[j], time[j]);
					temp = j;
				}
			}
			check[temp] = true; 
			result += tempS;
		}
		System.out.println(result);
	}
	public void howMuch() {
		Scanner scan = new Scanner(System.in);
		System.out.println("얼마입니까 : ");
		int cost = scan.nextInt();
		System.out.println(cost+"원 입니다."+"\n몇개 드릴까요? : ");
		int many = scan.nextInt();
		System.out.printf("총 금액은 %d원 입니다.\n비싸요 깍아주세요.\n",cost*many);
		System.out.println("얼마나 깍아드릴까요.(ex.10) : ");
		int dc = scan.nextInt();
		System.out.printf("그럼 %d원만 주세요.\n", cost*many*(100-dc)/100);
	}
	public void getRcard() {
		Scanner scan = new Scanner(System.in);
		String[] item = {"학생","국어","영어","수학","총점","평균","합격여부"};
		String[] stu = new String[item.length];
		String result = "";
		int sum = 0, arrLength = item.length;
		//입력부
		for(int i = 0; i < arrLength; i++) {
			System.out.print((i < arrLength - 3) ? (i == 0) ? item[0]+"이름을 입력하세요. : " : item[i]+"점수를 입력하세요.(정수만) : " : "");
			stu[i] = (i < arrLength - 3) ? scan.next() : "";
			result += item[i]+"\t";//String.format("%s\t", item[i]);
		}
		result += "\n===============================================================\n";
		for (int i = 1; i< arrLength - 3; i++) {
		sum += Integer.parseInt(stu[i]);
		}		
		for(int i= 0; i< arrLength; i++) {
			result += (i == arrLength - 3) ? String.format("%d\t",sum) : (i == arrLength - 2) ? String.format("%d\t",sum/(arrLength-4)) : (i == arrLength - 1) ? (sum/(arrLength-4) >= 90) ? "장학생" : (sum/(arrLength-4) >= 70) ? "합격" : "불합격" : stu[i]+"\t";
		}//한줄같지 않은 한줄 완성.
		System.out.println(result);
	}
}
