package exam;

public class ExamBlueprint {
	private int oneMark;
	private  int fiveMark;
	private int tenMark;
	
	public ExamBlueprint(int oneMark,int fiveMark, int tenMark) { //parameterized
		this.oneMark=oneMark;
		this.fiveMark=fiveMark;
		this.tenMark=tenMark;
	}
	public ExamBlueprint() {
		//no argument constructor
	}
	public int getOneMark() {
		return oneMark;
	}
	public void setOneMark(int oneMark) {
		this.oneMark = oneMark;
	}
	public int getFiveMark() {
		return fiveMark;
	}
	public void setFiveMark(int fiveMark) {
		this.fiveMark = fiveMark;
	}
	public int getTenMark() {
		return tenMark;
	}
	public void setTenMark(int tenMark) {
		this.tenMark = tenMark;
	}
	
	
	

}