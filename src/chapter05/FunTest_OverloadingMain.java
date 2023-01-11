package chapter05;

public class FunTest_OverloadingMain {

	public static void main(String[] args) {

		FunTest_Overloading obj = new FunTest_Overloading();
		obj.getResult(0);
		obj.getResult("0");
		obj.getResult('0');
		obj.getResult(6, "2023");
		
	}

}
