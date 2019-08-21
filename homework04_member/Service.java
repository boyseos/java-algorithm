package homework04_member;

public class Service {
	public String getBmical(Member m) {
		double bmi = Double.parseDouble(m.getWeight()) /(Double.parseDouble(m.getHeight())*Double.parseDouble(m.getHeight())/10000);
		m.setBmi(String.valueOf(bmi));
		return String.format("%s 님은 Bmi = %.1f 로 %s 입니다.",m.getName(), bmi, 
				(bmi > 30) ? "고도비만" : (bmi > 25) ? "비만" : (bmi > 23) ? "과체중" : (bmi > 18.5) ? "정상" : "저체중") ; 
	}	
	public String getTax(Member member) {
		int pay = Integer.parseInt(member.getPay());
		double tax = 9.7;
		return String.format("연봉  %d만원을 받으시는 %s님께서 납부할 세금은 %.2f만원 입니다.", pay, member.getName(), pay * tax/100);
	}
}
