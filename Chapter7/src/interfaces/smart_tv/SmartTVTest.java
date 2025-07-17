package interfaces.smart_tv;

import interfaces.remotecontrol.RemoteControl;

public class SmartTVTest {

	public static void main(String[] args) {
		// 인터페이스 타입으로 인스턴스 생성
		RemoteControl remocon = new SmartTV();
		// (WebSearchable)remocon - 명시적 형변환(다운 캐스팅)
		WebSearchable searcher = (WebSearchable)remocon;
		
		//리모컨 테스트
		remocon.turnOn();
		remocon.setVolume(8);
		remocon.setVolume(15);
		remocon.setVolume(-2);
		remocon.setMute(true);
		remocon.setMute(false);
		remocon.turnOff();
		
		//검색 기능
		searcher.searchWeb("www.youtube.com");
		searcher.searchWeb("www.naver.com");
		
		//배터리 교환
		RemoteControl.replaceBattery();
	}

}
