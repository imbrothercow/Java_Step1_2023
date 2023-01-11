package chapter07;

public class CarMain {

	public static void main(String[] args) {
		
		//생성자를 통하여 초기화
		Car car = new Car("검정색", 100);
		
		//멤버변수에 직접 접근해서 출력
		System.out.println("색 : " + car.color + ", CC : " + car.cc);
		
		System.out.println("------------------");
		
		//메소드를 이용한 출력
		System.out.println("색 : " + car.getColor() + ", CC : " + car.getCc());
		
		
	}

}
