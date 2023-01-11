package chapter04;

import java.util.Scanner;

public class TwoDimension02 {

	public static void main(String[] args) {
		
		int JavaScore[][]=new int[2][3];
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("=========================");
		for(int i=0; i<JavaScore.length; i++) {
			System.out.print(i + "행 점수를 " + JavaScore[i].length +"개 입력하세요 : ");
			for(int j=0; j<JavaScore[i].length; j++) {
				JavaScore[i][j] = scan.nextInt();
				System.out.print(JavaScore[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("=========================");
		
	}

}
