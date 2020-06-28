public class P14_5 implements P14_1,P14_2{
    private int volume;
    private int color;
    P14_5(int v,int c){
        this.volume=0;
        this.color=BLACK;
    }
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
    public void changeSkin(int skin) {
		this.color=skin;
    }
    public int getVolume(){
        return volume;
    }
    public int getColor(){
        return color;
    }
    public static void main(String[] args) {
        P14_5 s1=new P14_5(20,GREEN);
       // Skinnable s2=new Skinnable(P14_2.GREEN);
        s1.changeSkin(LEOPARD);
    }
}