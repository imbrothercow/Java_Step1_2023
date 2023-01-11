package chapter06;

import java.util.Random;

public class Start {
	
	private int random = new Random().nextInt(50)+1; // 1~50까지의 정수중 추출
	private int count = 0;
	private String result = "FAIL";
	
	public String check(int mynumber) {
		
		//random값보다 작으면 up / 크면 down / 일치하면 -> result="SUCCESS"
		
		count++;
		
		if(random == mynumber){
			result = "SUCCESS";
			System.out.println("정답! " + count + "회 만에 성공하셨습니다.");
		}else if(random > mynumber) {
			System.out.println("up");
		}else {
			System.out.println("down");
		}
		
		return result;
		
	}

}
