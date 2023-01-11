package chapter07;

public class OverloadMain {

	public static void main(String[] args) {
		
		Overload obj1 = new Overload();
		obj1.disp();
		Overload obj2 = new Overload(22, 172.6f);
		obj2.disp();
		Overload obj3 = new Overload("김오브젝트", 22, 172.6f);
		obj3.disp();

	}

}
