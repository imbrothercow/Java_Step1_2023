package chapter04.Example;

import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) {
		
		//학생수를 입력받아 점수를 입력하고, 점수리스트를 출력하고 총점과 평균을 분석하는 프로젝트
		
		boolean run=true;
		Scanner scan = new Scanner(System.in);
		
		int studentCount=0; //학생수
		int[] score = new int[studentCount];		//점수
		
		
		while(run) {
			System.out.println("====================================");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("====================================");
			
			System.out.print("선택> ");
			int option = scan.nextInt();
			
			switch(option) {
			case 1:
				System.out.print("학생수> ");
				studentCount = scan.nextInt();
				score = new int[studentCount];
				break;
			case 2:
				for(int i=0; i<studentCount; i++) {
					System.out.print("score["+i+"] : ");
					score[i]=scan.nextInt();
				}
				break;
			case 3:
				for(int i=0; i<studentCount; i++) {
					System.out.println("score["+i+"] : " + score[i]);
				}
				break;
			case 4:
				int max=0, sum=0;
				for(int i=0; i<studentCount; i++) {
					if(max < score[i]) max=score[i];
					sum += score[i];
				}
				System.out.println("최고점수 : " + max);
				System.out.println("총점 : " + sum);
				System.out.println("평균 : " + (double)sum/studentCount);
				break;
			case 5:
				System.out.println("프로그램 종료");
				run=false;
				break;
			}
		}
		
	}

}
