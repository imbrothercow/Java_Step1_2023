package chapter06;

public class CarMain {

	public static void main(String[] args) {
		
		//객체 생성
		Car myCar = new Car();
		
		myCar.disp();
		System.out.println("====================");
		myCar.speed(10);
		System.out.println("====================");
		myCar.disp();
		
	}

}
