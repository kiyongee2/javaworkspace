package interfaces.remotecontrol;

public class Television implements RemoteControl{
	private int volume;  //멤버 변수
	private boolean isPoweredOn; //토글(toggle) 변수

	@Override
	public void turnOn() {
		if(!isPoweredOn) { //!false
			isPoweredOn = true;
			System.out.println("TV를 켭니다. 현재 상태: ON");
		}
	}

	@Override
	public void turnOff() {
		if(isPoweredOn) {
			isPoweredOn = false;
			System.out.println("TV를 끕니다. 현재 상태: OFF");
		}
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;  //최대 볼륨 설정
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;  //최소 볼륨 설정
		}else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨: " + this.volume);
		
	}

}
