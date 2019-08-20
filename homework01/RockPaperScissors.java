package homework01;
/**
 * 가위바위보에서 
 * Random(3)+1 을 사용하면 1 ~ 3까지 나옵니다.
 * 컴퓨터가 만든 값이 1이면 가위를 낸 것이고
 * 2이면 바위를 낸 것이고
 * 3이면 보를 낸 것으로 할 때,
 * 사용자측이 가위, 바위, 보를 냈을 때
 * 승패를 결정하는 프로그램을 작성하시오
 */
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		while(true) {
			System.out.print("안내면 술래 가위, 바위, 보! : ");
			String myHand = scan.next(), eval ="";
			int myNum = 0, comNum = ran.nextInt(3)+1;
			
			switch(myHand) {
			case "가위": myNum = 2; break;
			case "바위": myNum = 5; break;
			case "보" : myNum = 7; break;
			default: System.out.println("입력을 잘못하셧습니다. 할맘이 없군요 종료합니다."); return; 
			}
			
			switch(myNum*comNum) {
			case 2: eval = "당신은 가위를 컴퓨터는 가위를 냈습니다. 비겼습니다."; break;		
			case 4: eval = "당신은 가위를 컴퓨터는 바위를 냈습니다. 졌습니다."; break;		
			case 6: eval = "당신은 가위를 컴퓨터는 보를 냈습니다. 이겼습니다."; break;		
			case 5: eval = "당신은 바위를 컴퓨터는 가위를 냈습니다. 이겼습니다."; break;		
			case 10: eval = "당신은 바위를 컴퓨터는 바위를 냈습니다. 비겼습니다."; break;		
			case 15: eval = "당신은 바위를 컴퓨터는 보를 냈습니다. 졌습니다."; break;		
			case 7: eval = "당신은 보를 컴퓨터는 가위를 냈습니다. 졌습니다."; break;		
			case 14: eval = "당신은 보를 컴퓨터는 바위를 냈습니다. 이겼습니다."; break;		
			case 21: eval = "당신은 보를 컴퓨터는 보를 냈습니다. 비겼습니다."; break;		
			}
			System.out.println(eval);
		}
	}
}
