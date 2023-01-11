package chapter05;

import java.util.Scanner;

public class Method2 {

	int cnt, num;
	boolean run = true;
	String str = "";
	Scanner scan = new Scanner(System.in);
	Method br;
	
	public Method2() {
		br=new Method();
	}
	
	void order2() {
		
		while(run) {
			System.out.println("1. 빵 갯수 선택 | 2. 빵 갯수와 종류 | 3. 종료 : ");
			System.out.print("선택> ");
			
			num=scan.nextInt();
			int breadCount=0;
			String breadname="";
			
			switch (num) {
			case 1:
				//br.makeBread 함수에 아래 입력 코드를 넣으면 더욱 깔끔해진다.
				System.out.print("주문할 빵의 갯수 : ");
				breadCount = Integer.parseInt(scan.nextLine());
				
				br.makeBread(breadCount);
				break;
			case 2:
				System.out.print("주문할 빵의 갯수 : ");
				breadCount = Integer.parseInt(scan.nextLine());
				
				System.out.print("주문할 빵의 종류 : ");
				breadname = scan.nextLine();
				
				br.makeBread(breadCount, breadname);
				break;
			case 3:
				run=false;
				break;
			default:
				System.out.println("잘못된 번호입니다");	
			}//switch
			
		}//while
		
	}//order2	
	
}//class
