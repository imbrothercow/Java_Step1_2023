package chapter03.IF.FOR;

import java.util.Scanner;

public class ForTest07 {

	public static void main(String[] args) {
		System.out.print("숫자를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);

		int i;
		int a=scan.nextInt();
		
		scan.close();
		
		//if문의 조건에 0보다 크면서 11보다 작은 수
		if(0 < a && a < 11) {
			for(i=1; i<=a; i++) {
				System.out.println("Java 프로그래밍!");
			}
		}else {
			System.out.println("입력값이 잘못 되었습니다");
		}
		
	}

}
