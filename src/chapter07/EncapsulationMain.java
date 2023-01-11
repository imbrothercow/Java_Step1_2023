package chapter07;

import javax.swing.JOptionPane;

public class EncapsulationMain {

	public static void main(String[] args) {
		
		int side;
		int height;
		int area;
		
		side = Integer.parseInt(JOptionPane.showInputDialog("밑변"));
		height = Integer.parseInt(JOptionPane.showInputDialog("높이"));
		
		Encapsulation obj1 = new Encapsulation();
		area = obj1.cal_area(side, height);
		
		System.out.println("사각형의 넓이 : " + area);
		String str = "사격형의 넓이 : " + area;
		JOptionPane.showMessageDialog(null, str);

	}

}
