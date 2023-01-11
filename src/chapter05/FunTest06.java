package chapter05;

public class FunTest06 {
	
	public String channel;
	public int channelInt;
	public int volume;
	
	//생성자 생략
	
	//void 외에 모든 타입의 메소드는 반드시 꼭 리턴값을 갖는다
	public int channelUp(int volume) {
		System.out.println("소리를 높이겠습니다");
		return this.volume = volume+2;
	}
	public int channelDown(int volume) {		
		System.out.println("소리를" + volume + "만큼 낮추겠습니다");
		return this.volume = volume-2;
	}

	public static void main(String[] args) {
		
		FunTest06 tv = new FunTest06();
		
		//방법1
		//System.out.println("소리를 " + tv.channelUp(9) + "만큼 올립니다");
		//방법2
		int volume = tv.channelUp(9);
		System.out.println("소리를 " + volume + "만큼 올립니다");
		tv.channelDown(5);

	}

}
