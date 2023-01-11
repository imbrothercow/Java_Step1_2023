package chapter03.IF.Example;

import java.util.Scanner;

public class ExampleWhile03 {

	public static void main(String[] args) {
		
		boolean run=true;
		
		int option, option2, balance=0, mon=0;
		
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------------");
			
			System.out.print("선택> ");
			option = scan.nextInt();
			
			if(option==1) {
				System.out.println("예금을 선택하셨습니다");
				System.out.println("현재금액 : " + balance);
				System.out.print("입금할 금액을 입력하세요 : ");
				mon = scan.nextInt();
				if(mon < 0) System.out.println("금액을 잘못 입력하셨습니다");
				else balance += mon;
			}else if(option==2) {
				System.out.println("출금을 선택하셨습니다");
				System.out.println("현재금액 : " + balance);
				System.out.print("출금할 금액을 입력하세요 : ");
				mon = scan.nextInt();
				balance -= mon;
				if(balance < 0) {
					System.out.println("잔액이 부족합니다");
					balance += mon;//잔액이 부족하므로 출금했던 금액을 다시 입금
				}
			}else if(option==3) {
				System.out.println("잔액확인을 선택하셨습니다");
				System.out.println("현재금액 : " + balance);
			}else if(option==4) {
				System.out.println("종료를 선택하셨습니다");
				run=false;
			}else {
				System.out.println("잘못된 서비스 번호를 선택하셨습니다");
			}//if
			
			System.out.println("1.초기메뉴 2.종료");
			option2=scan.nextInt();
			
			if(option2==2) run=false;
			else if(option2==1) run=true;
			
		}//while
		System.out.println("프로그램 종료");
		
	}//main

}//class
