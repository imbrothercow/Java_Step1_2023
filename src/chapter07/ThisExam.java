package chapter07;

public class ThisExam {
	
	int day;
	int month;
	int year;	

	public ThisExam() {}

	public ThisExam(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void printThis() {
		System.out.println(this);
	}

	public static void main(String[] args) {
		
		ThisExam birth1 = new ThisExam(27, 12, 2022);
		birth1.printThis();
		System.out.println("생년월일 : " + birth1.year + "/" + birth1.month + "/" + birth1.day);
		
		ThisExam birth2 = new ThisExam(27, 12, 2022);
		birth2.printThis();
		birth2.setYear(2023);
		birth2.setMonth(6);
		birth2.setDay(27);
		System.out.println("생년월일 : " + birth2.getYear() + "/" + birth2.getMonth() + "/" + birth2.getDay());
		
	}

}
