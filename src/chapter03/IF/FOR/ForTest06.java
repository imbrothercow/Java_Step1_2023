package chapter03.IF.FOR;

public class ForTest06 {

	public static void main(String[] args) {

		int i;
		char a='A'; //ASCII CODE : 65
		//String -> char => charAt(0)
		//i=a; (O) a=i; (X) 명시적 형변환 필요
		
		for(i=a; i<='Z'; i++) {
			System.out.printf("%c ", i);
		}

	}//main

}//class

