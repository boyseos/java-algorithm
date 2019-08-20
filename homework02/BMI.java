package homework02;
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
public class BMI {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] psTitle = {"이름","몸무게","키","BMI"};
		String[] psInfo = new String[psTitle.length];
		String result = "";
		for(int i = 0; i < psTitle.length - 1; i++) {
			System.out.print(psTitle[i] + " : ");
			psInfo[i] = scan.next();
			result += psTitle[i] + " : "+ psInfo[i]+"\n";
		}//if나 삼항연산자는 최대한 포문에서 배제
		double bmi = Double.parseDouble(psInfo[1]) / (Double.parseDouble(psInfo[2])*Double.parseDouble(psInfo[2])/10000);
		psInfo[psInfo.length-1] = String.valueOf(bmi);
		result += String.format("%s : %f\n",psTitle[psTitle.length-1], bmi) ; 
		System.out.print(result);
		System.out.println((bmi > 30) ? "고도비만입니다" : (bmi > 25) ? "비만입니다." : (bmi > 23) ? "과체중입니다." : (bmi > 18.5) ? "정상입니다." : "저체중입니다.");
//		if(bmi > 30.0) {
//			System.out.println("고도비만 입니다.");
//		}else if (bmi > 25.0) {
//			System.out.println("비만 입니다.");
//		}else if (bmi > 23.0) {
//			System.out.println("과체중 입니다.");
//		}else if (bmi > 18.5) {
//			System.out.println("정상 입니다.");
//		}else{
//			System.out.println("저체중 입니다.");
//		}
		
	}
}
