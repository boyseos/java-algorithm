package homework01;
/**
다음은 우리나라 주민번호 체계입니다.
9 : 1800 ~ 1899년에 태어난 남성
0 : 1800 ~ 1899년에 태어난 여성
1 : 1900 ~ 1999년에 태어난 남성
2 : 1900 ~ 1999년에 태어난 여성
3 : 2000 ~ 2099년에 태어난 남성
4 : 2000 ~ 2099년에 태어난 여성
5 : 1900 ~ 1999년에 태어난 외국인 남성
6 : 1900 ~ 1999년에 태어난 외국인 여성
7 : 2000 ~ 2099년에 태어난 외국인 남성
8 : 2000 ~ 2099년에 태어난 외국인 여성
입력받은 주민등록번호를 가지고 상기 결과값이 나오도록 프로그램을 작성하시오.
String ssn = 900101-123456 이라고 주민등록번호를 입력받으면
String num = ssn.substring(7,8) 이라고 하면
1이 나옵니다
 */
import java.util.Scanner;
import java.util.Random;

public class GenderCheck {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		String eval = "", regionT = "", manNum = "";
		int ranNum = ran.nextInt(200000);
		
		System.out.print("생년 월일을 입력하세요.(yyyymmdd) : ");
		int birth = scan.nextInt();
		System.out.print("성별을 입력하세요(남자,여자) : ");
		String gender = scan.next();
		System.out.print("국적을 써주세요.(ex 한국,일본,중국) : ");
		String region = scan.next();
		int birthType = birth / 10000;
		
		switch(region) {
		case "한국": regionT = ""; break;
		default : regionT = "외국인"; break;
		}
		//int flag = Integer.parseInt(ssn.substring(7,8));
		
		switch(birthType + regionT + gender) {
			case 18+"남자": eval = "1800 ~ 1899년에 태어난 남성"; manNum = birth + " - 9" + ranNum; break;
			case 18+"여자": eval = "1800 ~ 1899년에 태어난 여성"; manNum = birth + " - 0" + ranNum; break;
			case 19+"남자": eval = "1900 ~ 1999년에 태어난 남성"; manNum = birth + " - 1" + ranNum; break;
			case 19+"여자": eval = "1900 ~ 1999년에 태어난 여성"; manNum = birth + " - 2" + ranNum; break;
			case 19+"외국인"+"남자": eval = "1900 ~ 1999년에 태어난 외국인 남성"; manNum = birth + " - 5" + ranNum; break;
			case 19+"외국인"+"여자": eval = "1900 ~ 1999년에 태어난 외국인 여성"; manNum = birth + " - 6" + ranNum; break;
			case 20+"남자": eval = "2000 ~ 2099년에 태어난 남성"; manNum = birth + " - 3" + ranNum; break;
			case 20+"여자": eval = "2000 ~ 2099년에 태어난 여성"; manNum = birth + " - 4" + ranNum; break;
			case 20+"외국인"+"남자": eval = "2000 ~ 2099년에 태어난 외국인 남성"; manNum = birth + " - 7" + ranNum; break;
			case 20+"외국인"+"여자": eval = "2000 ~ 2099년에 태어난 외국인 여성"; manNum = birth + " - 8" + ranNum; break;
			default: eval = "틀린값입니다."; break;
		}
		System.out.println(eval+"\n"+manNum);
	}
}
