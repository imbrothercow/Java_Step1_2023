package chapter02;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Q1 바이트 크기가 작은 자료형을 더 큰 자료형으로 대입하는 자동 형변환의 코드 2가지
		System.out.println("Q1 ===============================================");
		double dVal = 1;
		int iVal = 'a';
		System.out.println(dVal);
		System.out.println(iVal);
		
		//Q2 실수를 정수형 변수에 대입하는 경우에 형번환이 자동으로 이루어지고 소수점이하 부분이 없어지는 형변환 코드 2가지 구현
		System.out.println("Q2 ===============================================");
		int a = (int)10.2f/2;
		int b = (int)(1.1 + 1234);
		System.out.println("10.2f / 2 : " + a);
		System.out.println("1.1 + 1234 : " + b);
		
		//Q3 더 많은 실수를 표현하기 위해서 가수부와 지수부로 비트를 나누어 표현한 방식
		System.out.println("Q3 ===============================================");
		System.out.println("부동소수점");
		
		//Q4 변수 두개를 선언해서 10과 2.5를 대입하고 두 변수의 사칙연산 결과를 정수로만 출력 
		int ten = 10;
		double twotwo = 2.2;
		System.out.println("Q4 ===============================================");
		System.out.println(ten + " + " + twotwo + " = " + (int)(ten+twotwo));
		System.out.println(ten + " - " + twotwo + " = " + (int)(ten-twotwo));
		System.out.println(ten + " * " + twotwo + " = " + (int)(ten*twotwo));
		System.out.println(ten + " / " + twotwo + " = " + (int)(ten/twotwo));

		//Q5 '글'이라는 한글문자의 유니코드 값을 찾아서 char형으로 선언한 변수에 저장한 뒤 그 변수를 출력
		System.out.println("Q5 ===============================================");
		char guel = '\uAE00';
		System.out.println(guel);
	}

}
