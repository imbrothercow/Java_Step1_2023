package chapter06;

import java.util.Random;
import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//컴퓨터가 발생한 난수 1개
		String com = "000";
		
		while(com.charAt(0) == com.charAt(1) || com.charAt(1) == com.charAt(2) || com.charAt(2) == com.charAt(0)) {
			com = "";
			for(int i=0; i<3; i++) {
				com += (char)(new Random().nextInt(9) + 49);
			}
		}
		System.out.println("정답 : " + com);
		
		while(true) {
			System.out.print("세자리 수를 입력하세요 : ");
			String user = scan.next();
			int strike=0, ball=0;
			
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					if(com.charAt(i) == user.charAt(j)) {
						if(i == j) strike++;
						else ball++;
					}
				}
			}
			
			System.out.println(strike + " strike, " + ball + " ball ");
			
		}
	}

}
