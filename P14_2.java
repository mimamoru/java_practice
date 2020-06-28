
public interface P14_2 {
	int BLACK =0;
	int RED =1;
	int GREEN =2;
	int BLUE =3;
	int LEOPARD =4;
	void changeSkin(int skin);
}

class Skinnable implements P14_2{
	private int color;
	public Skinnable() {this.color=BLACK;}
	public Skinnable(int color) {this.color=color;}
	public void changeSkin(int skin) {
		this.color=skin;
	}
	public int getColor(){
        return color;
    }
	 public static void main(String[] args) {
		 Skinnable s1=new Skinnable();
		// Skinnable s2=new Skinnable(P14_2.GREEN);
		 s1.changeSkin(P14_2.LEOPARD);
	 }
}