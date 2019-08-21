package homework04_calendar;

public class MyCalendarService {
	MyCalendar mc = new MyCalendar();
	public String getEndDay(MyCalendar mc) {
		int day = 0;
		switch(mc.getMonth()) {
		case 2: day = 28; break;
		case 4: 
		case 6: 
		case 9: 
		case 11: day = 30; break;
		default: day = 31; break;
		}
		return ((mc.getMonth() <= 12) ? String.format("%d월은 %d일 까지 입니다.", mc.getMonth(), day) 
				: String.format("%d월 없습니다.", mc.getMonth()));
	}
	public String isLeapYear(MyCalendar mc) {
		return String.format("%d 년은 %s입니다.",mc.getMonth(),(mc.getMonth() % 4 == 0) ? (mc.getMonth() % 100 != 0) ? 
				"윤년" : ((mc.getMonth() % 400 == 0) ? "윤년" : "평년") : "평년");
	}
}
