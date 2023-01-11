package chapter07;

public class PersonMain {

	public static void main(String[] args) {
		
		Person personKim = new Person();
		System.out.println(personKim.name = "김문자");
		System.out.println(personKim.height = 168);
		System.out.println(personKim.weight = 100);

		Person personGim = new Person("김통화");
		System.out.println(personGim.name);
		System.out.println(personGim.height = 173);
		System.out.println(personGim.weight = 75);
		
		Person personYoon = new Person("윤연락", 180, 70);
		System.out.println(personYoon.name);
		System.out.println(personYoon.height);
		System.out.println(personYoon.weight);

	}

}
