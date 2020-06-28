
public interface P14_1 {
	public void putOn();
	public void putOff();
}

class Headphone implements P14_1{
	int volume=0;
	public void putOn() {
		System.out.println("putOn Headphone");
	}
	public void putOff() {
		System.out.println("putOff Headphone");
	}
	public void setVolume(int volume) {
		this.volume=volume;
		System.out.println("volume="+volume);
	}
}

class WearableComputer implements P14_1{

	public void putOn() {
		System.out.println("putOn WearableComputer");
	}
	public void putOff() {
		System.out.println("putOn WearableComputer");
	}
	public void reset() {
		System.out.println("reset");
	}
}