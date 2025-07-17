package interfaces.remotecontrol;

public class RemoconTest {

	public static void main(String[] args) {
		// 부모 타입(인터페이스 형)으로 인스턴스 생성
		RemoteControl remocon = new Television();
		
		//기능 테스트
		remocon.turnOn();
		remocon.setVolume(7);
		remocon.setVolume(-2);  //볼륨을 0으로 제한
		remocon.setVolume(15);  //볼륨을 10으로 제한
		
		remocon.setMute(true);  //무음 모드
		remocon.setMute(false); //무음 해제
		remocon.turnOff();
		
		//배터리 교환 - 인터페이스 이름으로 직접 접근
		RemoteControl.replaceBattery();
		
	}

}
