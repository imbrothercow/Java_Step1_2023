package chapter07;

public class ThisTest {
	
	private int speed;
	private int age;
	private String robotName;
	private String robotNum;
	
	public ThisTest() {}
	
	public ThisTest(int speed, int age, String robotName, String robotNum) {
		this.speed = speed;
		this.age = age;
		this.robotName = robotName;
		this.robotNum = robotNum;
	}
	
	public void move() {
		speed += 20;
		System.out.println("robotSpeed : " + speed);
	}
	
	public void stop() {
		speed -= 20;
		System.out.println("robotSpeed : " + speed);
	}
	
	public void rAge() {
		age += 1;
		System.out.println("robotAge : " + age);
	}
	
	public void rName() {
		System.out.println("robotName : " + robotName);
	}

	public int getSpeed() {
		return speed;
	}

	public int getAge() {
		return age;
	}

	public String getRobotName() {
		return robotName;
	}

	public String getRobotNum() {
		return robotNum;
	}	
	
}
