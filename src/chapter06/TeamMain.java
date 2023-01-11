package chapter06;

public class TeamMain {

	public static void main(String[] args) {
		
		TeamGroup team = new TeamGroup();
		TeamMember t = new TeamMember();
		
		//메소드를 통해서 팀명을 초기화
		t.setTeamName("IT프렌즈");
		System.out.println("팀명 : " + t.getTeamName());
		
		System.out.println("----[팀원 명단]----");
		team.init();
		team.disp();
		
		System.out.println();
		t.setmName("김병효");
		System.out.println("팀장 : " + t.getmName());
		t.setMPhone("01012345678");
		System.out.println("번호 : " + t.getMPhone());
	}

}
