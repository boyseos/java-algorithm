package study05;

import java.util.Random;

public class Service {
	public String getBmical(Member member) {
		String name = member.getName();
		double height = member.getHeight(), weight = member.getWeight(), 
		       bmi = weight /(height*height/10000);
		member.setBmi(bmi);
		return String.format("%s 님은 Bmi = %.1f 로 %s 입니다.",name, bmi, (bmi > 30) ? "고도비만" : (bmi > 25) ? "비만" : (bmi > 23) ? "과체중" : (bmi > 18.5) ? "정상" : "저체중") ; 
	}
	public String getReportCard(Member member) {
		int kor = member.getKor(), eng = member.getEng(), math = member.getMath(), 
				  sum = kor + eng + math, avg = sum / 3;
		String name = member.getName();
		return String.format("학생\t국어\t영어\t수학\t총점\t평균\t합격여부\n==========================================================\n"
				+ "%s\t%d\t%d\t%d\t%d\t%d\t%s\n", name, kor, eng, math, sum, avg,(avg >= 90) ? "장학생" : (avg >= 70) ? "합격" : "불합격");
	}
	public String getTax(Member member) {
		String name = member.getName();
		int pay = member.getPay();
		double tax = 9.7;
		return String.format("연봉  %d만원을 받으시는 %s님께서 납부할 세금은 %f만원 입니다.", pay, name, pay * (100-tax)/100);
	}
	public void getSsn(Member member) {
		Random ran = new Random();
		String eval = "", manNum = "", birth = member.getBirth(),
				countryType = (member.getCountry().equals("한국")) ? "" : "외국인";
		int ranNum = ran.nextInt(200000);
		int birthType = Integer.parseInt(birth) / 10000;
		//int flag = Integer.parseInt(ssn.substring(7,8));
		
		switch(birthType + countryType + member.getSex()) {
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
		System.out.println(manNum);
		member.setSsn(manNum);
	}
}
