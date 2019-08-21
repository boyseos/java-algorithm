package study05;

import java.util.Random;

public class Member {
	private String name, id, pw, birth, blood, country, gender, ssn;
	private double height, weight, bmi;
	private int kor, eng, math, pay;
	
	public void setName(String name) {//세터 setter
		this.name = name; //write한다
	}
	public String getName( ) {//겟터
		return this.name;//read only
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return this.id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getPw() {
		return this.pw;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getBirth() {
		return this.birth;
	}
	public void setBlood(String blood) {
		this.blood = blood;
	}
	public String getBlood() {
		return this.blood;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return this.height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getWeight() {
		return this.weight;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getKor() {
		return this.kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getEng() {
		return this.eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getMath() {
		return this.math;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public int getPay() {
		return this.pay;
	}
	public void setBmi(double bmi) {
		this.bmi = bmi;
	}
	public double getBmi() {
		return this.bmi;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCountry() {
		return this.country;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getGender() {
		return this.gender;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getSsn() {
		return this.ssn;
	}
	public void ssnCal() {
		Random ran = new Random();
		String temp = "";
		switch(this.birth.substring(0,2) + (country.equals("한국") ? "" : "외국인") + this.gender) {
			case 18+"남자": temp = " - 9"; break;
			case 18+"여자": temp = " - 0"; break;
			case 19+"남자": temp = " - 1"; break;
			case 19+"여자": temp = " - 2"; break;
			case 19+"외국인"+"남자": temp = " - 5"; break;
			case 19+"외국인"+"여자": temp = " - 6"; break;
			case 20+"남자": temp = " - 3"; break;
			case 20+"여자": temp = " - 4"; break;
			case 20+"외국인"+"남자": temp = " - 7"; break;
			case 20+"외국인"+"여자": temp = " - 8"; break;
			default: temp = "x" ; break;
		}
		this.ssn = this.birth.substring(2,8) + temp + ran.nextInt(400000);
	}
	
	@Override
	public String toString() {
		String temp = String.format("회원정보\n이름 : %s	\n아이디 : %s	\n비번 : %s	\n생일(6자리) : %s	\n혈액형 : %s	\n키 : %.1f	\n몸무게 : %.1f	\n주민번호 : %s\n",
											name,		id,			pw,			birth,		blood,		height,		weight,			ssn);
		//switch() {
		//
		//}
		return temp;
	}
}
