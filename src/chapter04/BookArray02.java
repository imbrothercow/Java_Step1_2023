package chapter04;

public class BookArray02 {

	public static void main(String[] args) {
		
		//Book(); 5번 호출
		Book[] library=new Book[5];
		
		library[0]=new Book("데미안", "헤르만 헤세");
		library[1]=new Book("피노키오", "안데르센");
		library[2]=new Book("개미", "베르나르 베르베르");
		library[3]=new Book("그리고 아무도 없었다", "애거사 크리스티");
		library[4]=new Book("안네의 일기", "안네 프랑크");
		/*
		library[0].showBookinfo();
		library[1].showBookinfo();
		library[2].showBookinfo();
		library[3].showBookinfo();
		library[4].showBookinfo();
	    */
		
		for(int i=0; i<library.length; i++) {
			library[i].showBookinfo();
		}
	}

}
