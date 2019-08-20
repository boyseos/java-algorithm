package study04;

public class Student {
	public String getBmi(String name, String height, String weight) {
		double bmi = Double.parseDouble(weight) / (Double.parseDouble(height)*Double.parseDouble(height)/10000);
		System.out.printf("%s 의 BMI는 %f로 %s입니다.\n",name, bmi, (bmi > 30) ? "고도비만" : (bmi > 25) ? "비만" : (bmi > 23) ? "과체중" : (bmi > 18.5) ? "정상" : "저체중");
		return String.valueOf(bmi);
}


public String cash(int bank, String name) {
	System.out.printf("%d 원이나 있으시다니 %s님은 부자시군요.\n",bank,name);
	return "1억대출해드립니다.";
	}
}