package homework02;
//To. 개발자님
//프로그램을 하나 개발해야 합니다.
//교수가 요청하기를 브라우저에서 사용할 계산기를 만들어 달랍니다.
//복잡할 필요는 없고, 사칙연산 가능하고 나눗셈은
//몫과 나머지값으로 출력하면 된답니다.
//출력결과물은 예를 들어
//5 + 5 = 10
//2 - 7 = -5
//이렇게 되고,
//10 / 3 = 3 [1] 나눗셈은 이렇게 나오면 된답니다.
//그러면 []값이 나머지인지는 교수가 이미 알고 있겠답니다.
import java.util.Scanner;
public class ArithmeticCalculator {
	public static void main(String[] args) {
		//포문 하나로 처리하려고했으나 너무 복잡하고 정리가 안되서 앞의포문은 사용자가 입력한 식을 받아서 숫자부분과 연산기호를 나누는부분으로 만듬.
		Scanner scan = new Scanner(System.in);
		int[] number = new int[50];
		String[] input = new String[50], opr = new String[50];
		String temp = "";
		int count = 0;
		System.out.println("계산식을 써주세요.(ex. xx+yy-zz=) : ");
		String inputFormula = scan.next();
		//스트링 하나하나를 문자열에 넣고 연산자가 나올때까지 누적저장. 연산자가 나올시 숫자부분과 연산자부분을 각각의 배열에 따로 저장. length 는 배열갯수말고 스트링 길이로도 사용가능한듯.
		for(int i = 0; i < inputFormula.length(); i++) {
			input[i] = inputFormula.substring(i,i+1);
			switch(input[i]) {
			default : temp += input[i]; break;
			case "+": number[count] = Integer.parseInt(temp); temp = ""; opr[count] = "+"; count++; break;
			case "-": number[count] = Integer.parseInt(temp); temp = ""; opr[count] = "-"; count++; break;
			case "*": number[count] = Integer.parseInt(temp); temp = ""; opr[count] = "*"; count++; break;
			case "/": number[count] = Integer.parseInt(temp); temp = ""; opr[count] = "/"; count++; break;
			case "=": number[count] = Integer.parseInt(temp); temp = ""; opr[count] = "="; count++; break;
			}
		}
		//연산부분. 나눗셈과 곱셈의 우선순위까지는 미구현. 본문의 나눗셈 나머지 처리를 위해 나눗셈은 무조건 마지막에 위치패야함.
		int result = number[0], a = -1;
		for(int i = 0; i < count; i++) {
			System.out.print(number[i] + opr[i]);
			switch(opr[i]) {
			case "+": result += number[i+1]; break;
			case "-": result -= number[i+1]; break;
			case "*": result *= number[i+1]; break;
			case "/": a = result % number[i+1]; result /= number[i+1]; break;
			case "=": break;
			}
		}
		System.out.println(result+((a != -1) ? String.format("[%d]", a) : ""));
	}
}
