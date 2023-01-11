package chapter04.Example;

public class Example01 {

	public static void main(String[] args) {

		// for문을 이용하여 다음 배열의 점수를 줄단위로 평균을 구하시오
		int[][] array = {{95, 86}, {83,92,96}, {78,83,93,87,88}};
		
		double avg=0;
		int total=0;
		int alltotal=0;
		int count=0;
		
		//방법1
		/*
		int sum[]=new int[3];
		for(int i=0; i<array.length; i++) {
			
			count = 0;
			
			for(int j=0; j<array[i].length; j++) {
				sum[i] += array[i][j]; //(0,0) (0,1) | (1,0) (1,1) (1,2) | (2,0) (2,1) (2,2) (2,3) (2,4)
				count++;
			}
			
			System.out.println("각 행의 합 : " + sum[i]);
			avg = (double)sum[i] / count;
			System.out.println("각 행의 평균 : " + avg);
			System.out.println("=======================");
			
		}
		*/
		//방법2
		/*
		for(int i=0; i<array.length; i++) {
			
			total = 0;
			
			for(int j=0; j<array[i].length; j++) {
				total += array[i][j];//각행의 합
				count++; //각행의 데이터 수
			}
			alltotal += total;
			
			System.out.println("각 행의 합 : " + total);
			avg = (double)total / array[i].length;
			System.out.println("각 행의 평균 : " + Math.round(avg));
			System.out.println("=======================");
			
		}
		//전체평균
		double allavg=(double)alltotal/count;
		System.out.println("전체 총합 : " + alltotal);
		System.out.println(String.format("전체 평균 : %.2f", allavg));
		*/
		
		//방법3
		for(int[] num : array) { //95, 86
			
			total = 0;
			for(int score : num) { //95 //86
				total += score;
			}//in for
			count++;
			System.out.println(count + "번째 학생의 합계 : " + total);
			
		}//out for
	}

}
