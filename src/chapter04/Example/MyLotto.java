package chapter04.Example;

import java.util.Random;

import javax.swing.JOptionPane;

public class MyLotto {

	public static void main(String[] args) {
		
		//로또번호 6개를 담을 배열
		int lottoCount=Integer.parseInt(JOptionPane.showInputDialog("로또 수를 입력하세요"));
		int[][] lotto = new int[lottoCount][6];
		
		
		int numCount=0;
		/*
		while(numCount<lottoCount) {
			for(int i=0; i<6; i++) {
				int num = (int)(Math.random()*45) + 1;
				lotto[numCount][i] = num;
				for(int j=0; j<i; j++) {
					if(lotto[numCount][j] == num) {
						i--;
						break;
					}
				}
			}
			numCount++;
		}
		
		for(int i=0; i<numCount; i++) {
			System.out.print("["+(i+1)+"] : ");
			for(int j=0; j<6; j++) {
				System.out.print(lotto[i][j] + " \t");
			}
			System.out.println();
		}
		*/
		
		while(numCount<lottoCount) {
			System.out.print("[" + (numCount+1) + "] : ");
			outer : for(int i=0; i<lotto[numCount].length;) {
				lotto[numCount][i] = new Random().nextInt(45) + 1;
				for(int j=0; j<i; j++) {
					if(lotto[numCount][i] == lotto[numCount][j]) {
						continue outer;
					}
				}
				System.out.print(lotto[numCount][i] + " ");
				i++;
			}
			numCount++;
			System.out.println();
		}

	}

}
