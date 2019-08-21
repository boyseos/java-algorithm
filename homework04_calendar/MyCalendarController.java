package homework04_calendar;

import javax.swing.JOptionPane;

public class MyCalendarController {
	public static void main(String[] args) {
		MyCalendar mc = new MyCalendar();
		MyCalendarService mcs = new MyCalendarService();
		mc.setMonth(Integer.parseInt(JOptionPane.showInputDialog("원하는 달을 입력하세요")));
		mc.setYear(Integer.parseInt(JOptionPane.showInputDialog("년도를 입력하세요")));
		while(true) {
			switch(JOptionPane.showInputDialog(null,"종료 \n 년도 \n 월")){
			case "종료" : JOptionPane.showMessageDialog(null, "종료합니다."); return;
			case "년도" : JOptionPane.showMessageDialog(null, mcs.isLeapYear(mc)); break;
			case "월" : JOptionPane.showMessageDialog(null,mcs.getEndDay(mc)); break;
			}
		}
	}
}
