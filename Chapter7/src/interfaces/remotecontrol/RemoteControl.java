package interfaces.remotecontrol;

public interface RemoteControl {
	
	//변수 -> 인터페이스 상수(final이 자동으로 붙음)
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//추상 메서드
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	//무음 처리 - 디폴트 메서드
	default void setMute(boolean mute) { //true/false
		//조건 연산자 사용
		System.out.println(mute ? "무음 모드 활성화" : "무음 모드 해제");
	}
	
	//정적 메서드
	static void replaceBattery() {
		System.out.println("배터리를 교환합니다.");
	}
}







