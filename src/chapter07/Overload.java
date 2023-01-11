package chapter07;

public class Overload {

	private String name;
	private int age;
	private float h;
	
	public Overload() {
		age = 0;
		h = 0;
		name = "익명";
	}

	public Overload(int age, float h) {
		this.name = "익명";
		this.age = age;
		this.h = h;
	}

	public Overload(String name, int age, float h) {
		super();
		this.name = name;
		this.age = age;
		this.h = h;
	}
	
	public void disp() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + h);
	}
	
	
	
}
