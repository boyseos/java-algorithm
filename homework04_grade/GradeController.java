package homework04_grade;

import javax.swing.JOptionPane;

public class GradeController {
	public static void main(String[] args) {
		Grade gr = new Grade();
		GradeService grs = new GradeService();
		gr.setName(JOptionPane.showInputDialog("이름을 입력하세요"));
		gr.setKor(JOptionPane.showInputDialog("국어점수를 입력하세요"));
		gr.setEng(JOptionPane.showInputDialog("영어점수를 입력하세요"));
		gr.setMath(JOptionPane.showInputDialog("수학점수를 입력하세요"));
		while(true) {
			switch(JOptionPane.showInputDialog("0 종료 1 평균 2 총합 3 결과")) {
			case "0" : return;
			case "1" : JOptionPane.showMessageDialog(null, grs.avg(gr)); break;
			case "2" : JOptionPane.showMessageDialog(null, grs.sum(gr)); break;
			case "3" : JOptionPane.showMessageDialog(null, grs.result(gr)); break;
			}
		}
	}
}
