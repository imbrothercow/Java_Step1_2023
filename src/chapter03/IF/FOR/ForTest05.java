package chapter03.IF.FOR;

import java.util.Scanner;

public class ForTest05 {

	public static void main(String[] args) {
		//문제1 정수를 입력받아(Scanner) 입력받은 정수부터 100까지의 합을 출력하시오
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오(100이하의 정수) : ");
		int input = Integer.parseInt(scan.nextLine());
		int sum=0;
		for(int i=input; i<=100; i++) {
			sum += i;
		}
		System.out.println(input + " ~ 100까지의 정수의 합 : " + sum);
		
		//문제2 1서부터 10까지 반복하면서 정수를 입력받아 그 수중에 짝수
		//단 입력받은 수가 0이면 무시
		
		int cnt=0;
		for(int j=1; j<=10; j++) {
			System.out.println("============================");
			System.out.print(j+"번째 정수를 입력하시오 : ");
			int input2 = Integer.parseInt(scan.nextLine());
			
			if(input2 == 0) continue;
			if(input2%2 == 0) cnt++;
		}
		System.out.println("\n짝수의 갯수 : " + cnt + "개 입니다");
		
		scan.close();
	}

}
