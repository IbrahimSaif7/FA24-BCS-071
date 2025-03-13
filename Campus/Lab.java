public class Lab{

	private String name;
	private Person staff;
       	Pc computers[]= new Pc[20];

	Lab(String name, Person staff){

		this.name=name;
		this.staff=staff;
		for(int i=0;i<computers.length;i++){

			computers[i]=new Pc(i+1, "i"+ i+1);
		}

	}
	
	
	public void showLabDetails(){

		System.out.println("Lab name: "+ name);
		System.out.println("Staff: ");
		staff.showPersonDetails();
		System.out.println(" ");

		for(int i=0;i<computers.length;i++){

			computers[i].showPc();
		}

		
		

	}




}