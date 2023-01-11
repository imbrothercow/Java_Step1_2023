package chapter03.IF.FOR;

import java.util.Scanner;

public class ForTest17 {

	public static void main(String[] args) {
		
		// 정수를 입력받아서 입력된 수만큼 ★ 출력
		
		System.out.print("숫자를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		/*
		for(int i=1; i<=a; i++) {
			for(int j=1; j<=a; j++) {
				if(i>a-j) System.out.print("★");
				else System.out.print(" ");
			}
			System.out.println();
		}
		*/
		
		//전체회전수
		for(int i=0; i<a; i++) {
			//공백
			for(int j=0; j<=a-1-i; j++) {
				System.out.println(" ");
			}
			//별
			for(int j=0; j<2*i+1; j++) {
				System.out.println("★");
			}
			System.out.println();
		}
		

	}

}
