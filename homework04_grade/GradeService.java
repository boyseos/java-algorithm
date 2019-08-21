package homework04_grade;

public class GradeService {
	public String sum(Grade gr) {
		return String.valueOf(Integer.parseInt(gr.getKor()) + Integer.parseInt(gr.getEng()) + Integer.parseInt(gr.getMath()));
	}
	public String avg(Grade gr) {
		return String.valueOf(Double.parseDouble(this.sum(gr)) / 3).substring(0,6);
	}
	public String result(Grade gr) {
		return String.format("학생 : %s\n국어 : %s\n영어 : %s\n수학 : %s\n총점 : %s\n평균 : %s\n합격여부 : %s\n", 
				gr.getName(), gr.getKor(), gr.getEng(), gr.getMath(), 
				this.sum(gr), this.avg(gr).substring(0,6),(Double.parseDouble(this.avg(gr)) >= 90) ? "장학생" 
						: (Double.parseDouble(this.avg(gr)) >= 70) ? "합격" : "불합격");
	}
}


