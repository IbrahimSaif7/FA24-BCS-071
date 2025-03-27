public class Student extends Person{
	
	private int rollnum;

	public Student(String name, int age, int rollnum){

        	super(name, age);
        	this.rollnum = rollnum;

        }

	 @Override
         public String toString(){

        	return super.toString() + ", Roll Number: " + rollnum;

         }
	

	




}