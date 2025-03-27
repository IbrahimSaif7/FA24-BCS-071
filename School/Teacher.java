public class Teacher extends Person{

	private String subject;
	private int id;

	public Teacher(String name, int age, String subject, int id){

        	super(name, age);
        	this.subject = subject;
        	this.id = id;
        }

	 @Override
         public String toString(){

        	return super.toString() + ", Subject: " + subject;

         }






}