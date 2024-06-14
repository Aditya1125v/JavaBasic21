package in.co.OOP;

public class ConstructorUsed {
	private String id;
	private String maker;
	private int model;
	private String cc;


	public ConstructorUsed(String id,String maker,int model,String cc){
		this.id=id;
		this.maker=maker;
		this.model=model;
		this.cc=cc;
	}
	public ConstructorUsed() {
		System.out.println("it is default");}

	public String getId() {
		return id;
	}

	public String getMaker() {
		return maker;
	}

	public int getModel() {
		return model;
	}

	public String getCc() {
		return cc;
	}
	public static void main(String[] args) {
		ConstructorUsed c = new ConstructorUsed("102b","volvo",2024,"1900cc");
		System.out.println(c.getCc()+"  "+c.getId()+" "+c.getMaker()+" "+c.getModel());}}
	
	


