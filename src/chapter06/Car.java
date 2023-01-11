package chapter06;

public class Car {
	
	//필드
	String company = "현대자동차";
	String model = "그랜져";
	String color = "검정";
	int maxSpeed = 350;
	int speed;
	
	//디폴트 생성자
	
	//메소드
	public void disp() {
		System.out.println("제작회사 : " + this.company + "\n모델명 : " + this.model + "\n색깔 : " + this.color + "\n최고속도 : " + this.maxSpeed + "\n현재속도 : " + this.speed);
	}
	public void speed(int speed) {
		this.speed = speed;
		System.out.println("변경된 현재속도 : " + speed);
	}

}
