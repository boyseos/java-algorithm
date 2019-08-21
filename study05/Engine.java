package study05;
import java.util.Scanner;

public class Engine {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String result = "";
		Member member = null;
		Service service = new Service();
		while(true) {
			System.out.println("0.종료 1.Join 2.회원정보 3.아이디찾기 4.BMI 5.Tax 6.성적구하기");
			switch(scan.nextInt()) {
			case 0 : System.out.println("종료"); return;
			case 1:
				member = new Member();
				member.setId("바보");
				member.setPw("알아서뭐해");
				member.setName("몰라");
				member.setBirth("19940245");
				member.setHeight(199.9);
				member.setWeight(88.8);
				member.setBlood("B");
				member.setPay(5555);
				member.setKor(77);
				member.setEng(88);
				member.setMath(88);
				member.setCountry("중국");
				member.setGender("여자");
				member.ssnCal();
//				System.out.print("아이디 : ");
//				member.setId(scan.next());
//				System.out.print("비번 : ");
//				member.setPw(scan.next());
//				System.out.print("이름 : ");
//				member.setName(scan.next());
//				System.out.print("민번 : ");
//				member.setSsn(scan.next());
//				System.out.print("키 : ");
//				member.setHeight(scan.nextDouble());
//				System.out.print("몸무게 : ");
//				member.setWeight(scan.nextDouble());
//				System.out.print("혈액형 : ");
//				member.setBlood(scan.next());
//				System.out.print("연봉 : ");
//				member.setPay(scan.nextInt());
				break;
			case 2:
				System.out.println(member.toString());
				result = "";
				break;
			case 3:
				System.out.print("회원 정보 : 이름과 아이디를 입력하면 비번과 주민번호를 알려줌\n이름 : ");
				String searchName = scan.next();
				System.out.print("아이디 : ");
				String searchId = scan.next();
				result = (searchName.equals(member.getName()) && searchId.equals(member.getId())) ? 
						String.format("비번 : %s\n주민번호 : %s",member.getPw(), member.getSsn()): "이름이나 아이디가 틀렸습니다.";
				break;
			case 4:
				System.out.println("BMI구하기");
				result = service.getBmical(member);				
				break;
			case 5:
				System.out.println("세금도둑 계산기");
				result = service.getTax(member);
				break;
			case 6:
				System.out.println("성적계산");
				result = service.getReportCard(member);
				break;
			}
			System.out.println(result);
		}
	}
}
