package study02;

public class Sum1to5 {

	public static void main(String[] args) {
		//while(true) {}
		int b = 5, sum = 0;
		String eval = "";
		for(int i = 1; i<=b; i++) {
			
			/*
			if(i == 5) {
				result += i+" = ";
			}else {
				result += i+" + ";
			}
			*/
			eval += (i == 5) ? i+" = " : i+" + "; // 삼항연산자
			sum += i;
			//System.out.print(result);
			//switch(i){
			//default : System.out.print(i + "+"); break;
			//case 6 : System.out.println(b + "="); break;			
			//}
		}System.out.print(eval + sum);
	}
}
