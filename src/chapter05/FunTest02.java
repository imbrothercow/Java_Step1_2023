package chapter05;

import javax.swing.JOptionPane;

public class FunTest02 {
	
	public FunTest02() {
		// TODO Auto-generated constructor stub
	}
	
	//합계 메소드(함수)
	//접근지정자 : public(공용:제한없음) / protected(패키지 내에서 공용으로 사용) / private (클래스 내에서만 사용)
	//void : return 없음
	public void sum(int num1, int num2) {
		
		//int num1=3;
		//int num2=5;
		int total=num1+num2;
		System.out.println(num1+" + "+num2+" = "+total);
		
	}
	
	//실행 담당하는 메소드
	public static void main(String[] args) {
		
		int a, b;
		a=Integer.parseInt(JOptionPane.showInputDialog("값1 : "));	
		b=Integer.parseInt(JOptionPane.showInputDialog("값2 : "));	
		
		//static이 아니므로 에러 발생
		//sum(a, b);
		
		FunTest02 fun = new FunTest02();
		fun.sum(a, b);
	}

}//class
