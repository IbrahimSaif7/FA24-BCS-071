public class Person{

	private String name;
	private String role;
	private String gender;

	public Person(String name, String role){

        this.name = name;
        this.role = role;
       

        }

	public void showPersonDetails(){

        System.out.println("Name: " + name + ", Role: " + role + ", Gender: " + gender);
      
	
	}

}
