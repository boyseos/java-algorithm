package study05;

public class Member {
	private String name, id, pw, birth, blood, country, sex, ssn;
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
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getSex() {
		return this.sex;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getSsn() {
		return ssn;
	}
	
	@Override
	public String toString() {
		return String.format("회원정보\n이름 : %s\n아이디 : %s\n비번 : %s\n생일(6자리) : %s\n혈액형 : %s\n키 : %.1f\n몸무게 : %.1f\nBmi : %.1f\n주민번호 : %s\n"
							       , name,      id,        pw,     birth,          blood,      height,   weight,      bmi,        ssn);
	}
}
