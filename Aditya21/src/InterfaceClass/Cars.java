package InterfaceClass;

public class Cars extends Rupali{
	private int length;
	private int height;
	public Cars(String colour,int boarderlength,int length,int height) {
		super(colour,boarderlength);
		this.height=height;
		this.length=length;
		}
	public int getLength() {
		return length;
	}
	public int getHeight() {
		return height;
	}

}
