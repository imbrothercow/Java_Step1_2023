package chapter03.IF.SWITCH;

public class SwitchCase06 {

	public static void main(String[] args) {
		// 오전 9시 ~ 오후 6시
		int time=(int)(Math.random()*10 + 9);
		System.out.println("[현재시간 : "+time+"시]");
		System.out.print("할 일 : ");
		
		switch(time) {
		case 9:
			System.out.println("이진법 수업듣기"); break;
		case 10:
			System.out.println("자료형 수업듣기"); break;
		case 11:
			System.out.println("객체 수업듣기"); break;
		case 12:
			System.out.println("함수 수업듣기"); break;
		case 13:
			System.out.println("삼항연산자 수업듣기"); break;
		case 14:
			System.out.println("if문 수업듣기"); break;
		case 15:
			System.out.println("Scanner사용법 수업듣기"); break;
		case 16:
			System.out.println("JOptionPane사용법 수업듣기"); break;
		case 17:
			System.out.println("switch문 수업듣기"); break;
		case 18:
			System.out.println("전후위 연산자 수업듣기"); break;
		default:
			System.out.println("복습하기");
		}
		
	}
}
