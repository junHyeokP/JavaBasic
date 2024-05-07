package Remote;

public class Audio implements RemoteControl {
	
	private int volume;
	private int memoryvolume;
	
	@Override
	public void turnOn() {
		System.out.println("Audio on");
	}
	
	@Override
	public void turnOff() {
		System.out.println("Audio off");
	}
	
	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨: " + this.volume);
	}
}
