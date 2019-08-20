package homework02;
/*
 * to. 개발자님
여기는 비트헬스 입니다.
입력받을 정보는 아래와 같습니다.
값을 입력받은 후에 다시 입력받은 값을 그대로 보여주는
프로그램을 보여주세요

=== 회원가입 ===
아이디 : 
비밀번호 : 
이름 : 
생년월일(예) 1980-01-01 : 
성인여부(성인true,미성년false) : 
키(소수점 첫째자리까지) :
몸무게(소수점 첫째자리까지) : 
혈액형(A) : 

입력이 종료되면 ...아래처럼 보이게 해주세요

=== 회원정보 ===
아이디 : hong
비밀번호 : 1234
이름 : 홍길동
생년월일(예) 1990-05-05 : 
성인여부(성인true,미성년false) : 성인
키(소수점 첫째자리까지) : 178.5 cm
몸무게(소수점 첫째자리까지) : 75kg
혈액형(A) : B형

 */
import java.util.Scanner;
public class Join {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] psInfoName = {"아이디 : ","비밀번호 : ","이름 : ","생년월일(ex :1980-01-01) : ","성인여부(true,false) : ","키(소수점 첫째자리까지) : ","몸무게(소수점 첫째자리까지) : ","형액형(A) : "};
		String[] psInfo = new String[psInfoName.length];
		//double[] psInfoNum = new double[2]; 소수점부분은 더블로 받아서 처리할까했지만 일단 보류
		String result = "=== 회원 정보 ===\n";
		System.out.println("=== 회원 가입 ===");
		for(int i=0; i < psInfoName.length; i++) {
			System.out.println(psInfoName[i]);
			psInfo[i] = scan.next();
			psInfo[i] = (psInfo[i].equals("true")) ? "성인": (psInfo[i].equals("false")) ? "미성년" : psInfo[i];
			switch(psInfoName[i]) {
			case "키(소수점 첫째자리까지) : ": psInfo[i] += " cm"; break;
			case "몸무게(소수점 첫째자리까지) : ": psInfo[i] += " kg"; break;
			case "형액형(A) : ": psInfo[i] += " 형"; break;	
			}
			result += psInfoName[i] + psInfo[i] + "\n";
		}
		int b;
		System.out.println(result);
	}
}
