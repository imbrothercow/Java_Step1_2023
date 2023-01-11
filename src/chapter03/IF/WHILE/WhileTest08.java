package chapter03.IF.WHILE;

import java.util.Scanner;

public class WhileTest08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		String menu="";
		
		while(true){
			System.out.print("1.입력하기\n2.출력하기\n3.삭제하기\n4.끝내기\n작업할 번호를 선택하세요 : ");
			num=scan.nextInt();
			
			//예외처리
			switch(num) {
			case 1:
				menu = "입력하기를 선택하셨습니다";
				break;
			case 2:
				menu = "출력하기를 선택하셨습니다";
				break;
			case 3:
				menu = "삭제하기를 선택하셨습니다";
				break;
			case 4:
				menu = "끝내기를 선택하셨습니다";
				break;
			default:
				menu = "잘못 입력하셨습니다";
				break;
			}//switch
			
			System.out.println(menu);
			if(num == 4) break; //while문 종료 구현
			
		}//while

	}//main

}//class
