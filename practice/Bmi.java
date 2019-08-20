package practice;
/*
 *  To. 개발자님
사람의 이름을 입력하고, 몸무게 , 키를 입력하면
해당 사람의 상태가 비만인지 저체중인지 알려주는 BMI 지수 측정하는 프로그램을 만들어 주세요.
BMI 구하는 공식은 아래와 같아요. 더 궁금하면 여기를 클릭하세요.
       BMI = x KG / (y M * y M)

Example for 175 cm height and 70 kg weight:
BMI = 70 / (1.75 * 1.75) = 22.86

(bmi > 30.0) 고도비만
(bmi > 25.0) 비만
(bmi > 23.0) 과체중
(bmi > 18.5) 정상
저체중
       이랍니다.
 */
import java.util.Scanner;
public class Bmi {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] info = {"이름","키","몸무게"};
		String[] val = new String[info.length];
		String result = "";
		for(int i = 0; i < 3; i++) {
			System.out.printf("%s : ",info[i]);
			val[i] = scan.next();
		}
		System.out.println(val[2] + val[1]);
		double bmi = Double.parseDouble(val[2]) / (Double.parseDouble(val[1])*Double.parseDouble(val[1])/10000);
		//double bmi = 5.2;
		for(int i = 0; i < 3; i++) {
			result += info[i] +" : " + val[i] + "\n";
		}
		result += String.format("BMI = %f", bmi);
		System.out.println(result);
	}

}
