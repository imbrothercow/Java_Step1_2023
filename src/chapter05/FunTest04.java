
package chapter05;

import javax.swing.JOptionPane;

public class FunTest04 {
	
	public static void disp(String[] a) {
		String res = "";
		
		for(int i=0; i<a.length; i++) {
			res += a[i] + " ";
		}//for
		/*
		for(String str : a) {
			res += str + " ";
		}//for
		*/
		
		System.out.println(res);
		JOptionPane.showMessageDialog(null, "배열의 원소값\n\n" + res);
	}

	public static void main(String[] args) {
		
		String str[]= {"Java", "Oracle", "Html5,CSS,JS,JQ", "JSP", "Spring", "PythonCamp"};
		
		disp(str);

	}

}
