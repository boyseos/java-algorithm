package study06;
import javax.swing.JOptionPane;

public class Engine {
	public static void main(String[] args) {
		String result = "";
		Member member = null;
		Service service = new Service();
		
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료 1.회원가입 2.회원정보 3.비번찾기 4.BMI 5.세금 6.성적계산")) {
			case "0" : JOptionPane.showInputDialog("종료"); return;
			case "1" :
				member = new Member();
//				member.setId("babo");
//				member.setPw("1234");
//				member.setName("바보");
//				member.setBirth("19940245");
//				member.setHeight(199.9);
//				member.setWeight(88.8);
//				member.setBlood("B");
//				member.setPay(5555);
//				member.setKor(77);
//				member.setEng(88);
//				member.setMath(88);
//				member.setCountry("중국");
//				member.setGender("여자");
//				member.ssnCal();
				System.out.print("아이디 : ");
				member.setId(scan.next());
				System.out.print("비번 : ");
				member.setPw(scan.next());
				System.out.print("이름 : ");
				member.setName(scan.next());
				System.out.print("생일 (19990405) : ");
				member.setBirth(scan.next());
				System.out.print("키 : ");
				member.setHeight(scan.nextDouble());
				System.out.print("몸무게 : ");
				member.setWeight(scan.nextDouble());
				System.out.print("혈액형 : ");
				member.setBlood(scan.next());
				System.out.print("연봉 : ");
				member.setPay(scan.nextInt());
				System.out.print("국어점수 : ");
				member.setKor(scan.nextInt());
				System.out.print("영어점수 : ");
				member.setEng(scan.nextInt());
				System.out.print("수학점수 : ");
				member.setMath(scan.nextInt());
				System.out.println("국적 : ");
				member.setCountry(scan.next());
				System.out.println("성별 (남자,여자) :");
				member.setGender(scan.next());
				member.ssnCal();
				
				break;
			case "2":
				JOptionPane.showMessageDialog(null, "2.마이페이지\n" + member.toString());
				result = "";
				break;
			case "3":
				System.out.print("회원 정보 : 이름과 아이디를 입력하면 비번과 주민번호를 알려줌\n이름 : ");
				String searchName = scan.next();
				System.out.print("아이디 : ");
				String searchId = scan.next();
				result = (searchName.equals(member.getName()) && searchId.equals(member.getId())) ? 
						String.format("비번 : %s\n주민번호 : %s",member.getPw(), member.getSsn()): "이름이나 아이디가 틀렸습니다.";
				break;
			case "4":
				System.out.println("BMI구하기");
				result = service.getBmical(member);				
				break;
			case "5":
				System.out.println("세금도둑 계산기");
				result = service.getTax(member);
				break;
			case "6":
				System.out.println("성적계산");
				result = service.getReportCard(member);
				break;
			}
			System.out.println(result);
		}
	}
}
