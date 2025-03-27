public class Principal extends Person{

	private int xp;

	public Principal(String name, int age, int xp){

        	super(name, age);
        	this.xp = xp;
    	}

	 @Override
         public String toString() {
        	return super.toString() + ", Experience: " + xp + " years";
    	}







}