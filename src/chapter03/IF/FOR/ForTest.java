package chapter03.IF.FOR;

import java.util.Scanner;

public class ForTest {

	public static void main(String[] args) {
		// 몇명의 성적을 입력 받을 것인지 정수로 인원수를 입력받아 총점과 평균을 구하시오(단, 평균은 실수로 출력할 것)
		
		Scanner scan = new Scanner(System.in);
		int i, sum=0, cnt=0;
		double avg=0;
		
		System.out.print("성적을 입력받을 인원 수를 입력하세요 : ");
		int stu=scan.nextInt();
		
		System.out.print(stu+"명 학생의 성적을 입력하세요 : ");
		for(i=1; i<=stu; i++) {
			sum+=scan.nextInt();
			cnt++;
		}
		
		System.out.println("총점 : " + sum);
		avg=(double)sum/cnt;
		System.out.println("평균 : " + avg);
		
		scan.close();

	}

}
