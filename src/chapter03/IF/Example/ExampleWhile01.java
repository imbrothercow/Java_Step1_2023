package chapter03.IF.Example;

import java.util.Scanner;

public class ExampleWhile01 {

	public static void main(String[] args) {
		
		boolean run=true;
		
		int option, balance=0, mon=0;
		
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------------");
			
			System.out.print("선택> ");
			option = scan.nextInt();
			
			switch(option) {
			case 1:
				System.out.print("예금액> ");
				mon = scan.nextInt();
				if(mon > 0)balance += mon;
				else System.out.println("예금액은 0보다 커야합니다");
				break;
			case 2:
				System.out.print("출금액> ");
				mon = scan.nextInt();
				if(mon <= balance) balance -= mon;
				else System.out.println("잔고가 부족합니다");
				break;
			case 3:
				System.out.println("잔고> " + balance);
				break;
			case 4:
				System.out.println("종료를 선택하였습니다"); 
				run=false; 
				break;
			default:
				System.out.println("다시 입력해주세요");	
			}
		}
		
	}

}
