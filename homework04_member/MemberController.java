package homework04_member;
import javax.swing.JOptionPane;

public class MemberController {
	public static void main(String[] args) {
		Member member = null;
		Service service = new Service();

		while(true) {
			switch(JOptionPane.showInputDialog("0.종료 1.회원가입 2.회원정보 3.비번찾기 4.BMI 5.세금")) {
			case "0" : JOptionPane.showMessageDialog(null, "종료"); return;
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
				member.setId(JOptionPane.showInputDialog("아이디"));
				member.setPw(JOptionPane.showInputDialog("비번"));
				member.setName(JOptionPane.showInputDialog("이름"));
				member.setBirth(JOptionPane.showInputDialog("생일(19490909)"));
				member.setHeight(JOptionPane.showInputDialog("키"));
				member.setWeight(JOptionPane.showInputDialog("몸무게"));
				member.setBlood(JOptionPane.showInputDialog("혈액형"));
				member.setPay(JOptionPane.showInputDialog("연봉"));
				member.setCountry(JOptionPane.showInputDialog("국적"));
				member.setGender(JOptionPane.showInputDialog("성별(남자,여자)"));
				member.ssnCal();
				break;
			case "2":
				JOptionPane.showMessageDialog(null, "2.마이페이지\n" + member.toString());
				break;
			case "3":
				String searchName = JOptionPane.showInputDialog("이름을 알려주세요");
				String searchId = JOptionPane.showInputDialog("아아디를 알려주세요");
				JOptionPane.showMessageDialog(null, (searchName.equals(member.getName()) && searchId.equals(member.getId())) ? 
						String.format("비번 : %s\n주민번호 : %s",member.getPw(), member.getSsn()): "이름이나 아이디가 틀렸습니다.");
				break;
			case "4":
				JOptionPane.showMessageDialog(null, service.getBmical(member));
				break;
			case "5":
				JOptionPane.showMessageDialog(null, service.getTax(member));
				break;
			}
		}
	}
}
