package chapter06;

public class AccessTest {
	
	//필드
	private int aa;
	public int bb;
	int cc;

	//디폴트 생성자
	public AccessTest() {
		// TODO Auto-generated constructor stub
	}
	
	//메서드
	public void setAa(int aa) {
		this.aa = aa;
	}

	public void setBb(int bb) {
		this.bb = bb;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}
	
	public void disp() {
		System.out.println("aa값 : " + aa + "\nbb값 : " + bb + "\ncc값 : " + cc);
	}

	public static void main(String[] args) {
		
		//객체(obj)
		AccessTest obj = new AccessTest();
		obj.setAa(20);
		obj.setBb(30);
		obj.setCc(35);
		obj.disp();

	}

}
