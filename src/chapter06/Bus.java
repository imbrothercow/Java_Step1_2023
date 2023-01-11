package chapter06;

public class Bus {
	
	//멤버
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) { //승객이 낸 돈
		this.money += money; //버스의 수입 증가
		this.passengerCount++; //승객 수
	}
	
	public void showInfo() { //버스의 정보를 출력
		System.out.println("버스 " + busNumber + "번이 승객은 " + passengerCount + "명이고, 수입은 " + money + "원 입니다");
	}

}
