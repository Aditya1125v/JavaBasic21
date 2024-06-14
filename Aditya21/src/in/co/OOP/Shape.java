package in.co.OOP;

public class Shape {
	private String Colour;
	private int BoarderWidth;
	public Shape() {
		System.out.println("Please Give input");
	}
	public Shape(String Colour, int BoarderWidth) {
		this.Colour=Colour;
		this.BoarderWidth=BoarderWidth;
	}
	public String getColour() {
		return Colour;
	}
	public int getBoarderWidth() {
		return BoarderWidth;
	}
	public static void main(String[] args) {
		Shape S= new Shape("Morello",200);
		   System.out.println("Colour : "+S.getColour());
		   System.out.println("BoarderWidth : "+S.getBoarderWidth());}}
	


