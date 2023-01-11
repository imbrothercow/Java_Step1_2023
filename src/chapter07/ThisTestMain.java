package chapter07;

import javax.swing.JOptionPane;

public class ThisTestMain {

	public static void main(String[] args) {
		
		ThisTest r1 = new ThisTest();
		r1.move();
		r1.move();
		System.out.println("-----------------");
		r1.rAge();
		System.out.println("-----------------");
		
		int r_speed = Integer.parseInt(JOptionPane.showInputDialog("로봇의 속도"));
		int r_age = Integer.parseInt(JOptionPane.showInputDialog("로봇의 나이"));
		String r_name = JOptionPane.showInputDialog("로봇의 이름");
		String r_num = JOptionPane.showInputDialog("로봇의 번호");
		
		ThisTest r2 = new ThisTest(r_speed, r_age, r_name, r_num);
		System.out.println("속도 : " + r2.getSpeed());
		System.out.println("나이 : " + r2.getAge());
		System.out.println("이름 : " + r2.getRobotName());
		System.out.println("번호 : " + r2.getRobotNum());
		System.out.println("-----------------");

		r2.move();
		r2.rName();
		r2.rAge();
		r2.move();
		r2.move();
		r2.move();
		r2.stop();
		
	}

}
