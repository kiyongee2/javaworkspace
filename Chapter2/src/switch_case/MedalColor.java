package switch_case;

public class MedalColor {

	public static void main(String[] args) {
		// 조건문 - switch ~ case문
		// 조건 - 메달 색상에 따른 메달 선택
		// 금메달 - GOLD, 은메달-SILVER, 동메달-BRONZE
		
		String medalColor = "GOLD"; //메달의 색상
		
		switch(medalColor) { //switch(변수)
		case "GOLD":
			System.out.println("금메달");
			break;
		case "SILVER":
			System.out.println("은메달");
			break;
		case "BRONZE":
			System.out.println("동메달");
			break;
		default:
			System.out.println("메달이 없습니다.");
			break;
		}
		
		/*if(medalColor.equals("GOLD")) {
			System.out.println("금메달");
		}
		else if(medalColor.equals("SILVER")) {
			System.out.println("은메달");
		}
		else if(medalColor.equals("BRONZE")) {
			System.out.println("동메달");
		}
		else {
			System.out.println("메달이 없습니다.");
		}*/
	}

}





