package chapter03.IF;

import javax.swing.JOptionPane;

public class IfExample04 {

	public static void main(String[] args) {
		// 전시관의 입장료는 미취학 아동은 1000원
		// 전시관의 입장료는 초등학생은 2000원
		// 전시관의 입장료는 중고등학생은 3500원
		// 전시관의 입장료는 성인은 5000원

		int age, charge;
		//swing(나이를 입력하세요) 사용하여 입력 받기
		//미취학 아동 7살, 초등학생 13살, 중고등학생 19살, 성인 19살 이상
		age = Integer.parseInt(JOptionPane.showInputDialog("나이를 입력하세요"));
		
		//if 
		if(age <= 7) 
			System.out.println("미취학 아동입니다.\n입장료는 "+(charge=1000)+"원 입니다.");
		else if(age <= 13)
			System.out.println("초등학생입니다.\n입장료는 "+(charge=2000)+"원 입니다.");
		else if(age <= 19)
			System.out.println("중고등학생입니다.\n입장료는 "+(charge=3500)+"원 입니다.");
		else 
			System.out.println("성인입니다.\n입장료는 "+(charge=5000)+"원 입니다.");
	}

}
