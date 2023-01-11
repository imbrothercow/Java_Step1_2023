package chapter06;

import java.util.Scanner;

public class StartMain {

	public static void main(String[] args) {
		
		Start obj = new Start();
		int num;
		Scanner s = new Scanner(System.in);
		
		do{
			System.out.print("숫자 입력 : ");
			num = s.nextInt();
		}while(obj.check(num).equals("FAIL"));
		
	}

}
