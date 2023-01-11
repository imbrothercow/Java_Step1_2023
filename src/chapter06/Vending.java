package chapter06;

public class Vending {
	
	//멤버변수
	private Can can[] = new Can[5]; //선언
	private int money;
	
	//can[0] = new Can("환타", 1000); //private 변수방이므로 반드시 메소드안에서 초기화한다
	
	//메소드
	public void init() {
		can[0] = new Can("환타", 1000);
		can[1] = new Can("콜라", 1200);
		can[2] = new Can("스프라이트", 1100);
		can[3] = new Can("웰치스", 1400);
		can[4] = new Can("마운틴듀", 1500);
	}
	
	//사용가능한 음료만 보여주기
	public void showCans(int m) {
		
		money=m; //돈
		
		System.out.println("[구매 가능 음료]");
		for(int i=0; i<can.length; i++) {
			
			if(money >= can[i].getPrice())
				System.out.println(can[i].getCanName() + " \t" + can[i].getPrice() + "원");
			
		}//for
		
	}//method
	
	//선택한 음료수 제공과 잔액
	public void outCan(String name) {
		for(int i=0; i<can.length; i++) {
			if(can[i].getCanName().equals(name)) {
				System.out.println(can[i].getCanName() + "을 선택하셨습니다");
				System.out.println("잔 액 : " + (money -= can[i].getPrice()) + "원");
			}
		}//for
	}//outCan

}
