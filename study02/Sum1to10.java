package study02;

public class Sum1to10 {

	public static void main(String[] args) {
		//while(true) {}
		int b = 10, sum = 0;
		String eval = "";
		for(int i = 1; i<=b; i++) {
			if(i == 10) {
				eval += i+" = ";
			}else {
				eval += i+" + ";
			}
			sum +=i;
			//switch(i){
			//default : System.out.print(i + "+"); break;
			//case 6 : System.out.println(b + "="); break;			
			//}
		}
		System.out.print(eval + sum);
	}
}
