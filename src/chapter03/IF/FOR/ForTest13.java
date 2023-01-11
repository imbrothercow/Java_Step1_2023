package chapter03.IF.FOR;

import java.util.Scanner;

public class ForTest13 {

	public static void main(String[] args) {
		
		//구구단
		/*
		for(int i=2; i<=9; i++) {
			System.out.println(i + "단-----------------------");
			for(int j=1; j<=9; j++) { //i=2 -> j=1~9
				System.out.println(i + " * " + j + " = " + j*i);
			}
		}
		*/
		
		System.out.print("단을 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		int dan = scan.nextInt();
		
		for(int k=1; k<=9; k++) {
			System.out.println(dan + " * " + k + " = " + dan*k);
		}
	}

}
