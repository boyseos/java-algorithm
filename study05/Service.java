package study05;

public class Service {
	public String getBmical(Member member) {
		double bmi = member.getWeight() /(member.getHeight()*member.getHeight()/10000);
		member.setBmi(bmi);
		return String.format("%s 님은 Bmi = %.1f 로 %s 입니다.",member.getName(), bmi, 
				(bmi > 30) ? "고도비만" : (bmi > 25) ? "비만" : (bmi > 23) ? "과체중" : (bmi > 18.5) ? "정상" : "저체중") ; 
	}
	public String getReportCard(Member member) {
		int	sum = member.getKor() + member.getEng() + member.getMath(), avg = sum / 3;
		return String.format("학생\t국어\t영어\t수학\t총점\t평균\t합격여부\n==========================================================\n"
				+ "%s\t%d\t%d\t%d\t%d\t%d\t%s\n", member.getName(), member.getKor(), member.getEng(), member.getMath(), 
				sum, avg,(avg >= 90) ? "장학생" : (avg >= 70) ? "합격" : "불합격");
	}
	public String getTax(Member member) {
		int pay = member.getPay();
		double tax = 9.7;
		return String.format("연봉  %d만원을 받으시는 %s님께서 납부할 세금은 %.2f만원 입니다.", pay, member.getName(), pay * (100-tax)/100);
	}
}
