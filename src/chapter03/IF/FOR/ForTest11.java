package chapter03.IF.FOR;

public class ForTest11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=1;i<=5;i++) {
			for(j=1;j<=i;j++) {
				System.out.println(j+" ");
			}//안쪽 for
		}//바깥 for
	}//main

}//class
