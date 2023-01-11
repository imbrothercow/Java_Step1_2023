package chapter02;

public class Example02 {

	public static void main(String[] args) {
		//원의 넓이를 구하시오(반지름*반지름*3.14)
		//반지름 : 10, 3.14는 double로 정의하여 구하시오
		//반지름 변수방 num1 / 3.14 변수방 pi / 넓이 변수방 result
		
		int num=10;
		double pi=3.14;
		double result=num*num*pi;
		
		System.out.println("원의 넓이 : " + result);
		
		double result2 = num*num*Double.parseDouble(3+"."+14);

		System.out.println("원의 넓이 : " + result2);
	}

}
