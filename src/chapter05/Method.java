package chapter05;

import java.util.Scanner;

public class Method {

	//멤버변수(=필드)
	
	//생성자 생략
	
	//메소드
	void makeBread() {
		System.out.println("빵을 만듭니다");
	}//method1
	
	void makeBread(int count) {
		for(int i=0; i<count; i++) {
			System.out.println((i+1)+"번째 빵을 만들었습니다");
		}
		System.out.println("요청하신 "+count+"개의 빵이 모두 완료되었습니다");
	}//method2
	
	void makeBread(int count, String breadname) {
		for(int i=0; i<count; i++) {
			System.out.println((i+1)+"번째 "+breadname+"빵을 만들었습니다");
		}
		System.out.println("요청하신 "+count+"개의 "+breadname+"빵이 모두 완료되었습니다");
	}//method3
	
	void order() {
		
		boolean run=true;
		Scanner scan=new Scanner(System.in);
		int breadCount = 0;
		String breadname = null;
		
		while(run) {
			System.out.println("1. 빵 갯수 선택 | 2. 빵 갯수와 종류 | 3. 종료 : ");
			System.out.print("선택> ");
			int option = Integer.parseInt(scan.nextLine());
			
			switch(option) {
			case 1:
				System.out.print("주문할 빵의 갯수 : ");
				breadCount = Integer.parseInt(scan.nextLine());
				
				makeBread(breadCount);
				break;
			case 2:
				System.out.print("주문할 빵의 갯수 : ");
				breadCount = Integer.parseInt(scan.nextLine());
				
				System.out.print("주문할 빵의 종류 : ");
				breadname = scan.nextLine();
				
				makeBread(breadCount, breadname);
				break;
			case 3:
				run=false;
				System.out.println("프로그램 종료");
				break;
			}
		}
		scan.close();
	}//order method
	
}
