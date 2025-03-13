public class Pc{

	private int id;
	private String version;
	private final int ram= 4;
	private final int size=200;


	Pc(int id, String version){

		this.id=id;
		this.version=version;
	
		

	}


	public float getram(){

		return ram;
	}
	
	public int getsize(){	

		return size;

	}

	public void showPc(){

		System.out.println("ID: "+ id);
		System.out.println("version"+ version);
		System.out.println("RAM: "+ ram);
		System.out.println("Disc space: "+ size);
		System.out.println("");

	}



}