public class School{


	private String name;
        private String address;
   	private Principal principal;
  	private Classroom[] classRooms;
   	private int classCount;
  	private static final int MAX_CLASSES = 10;


	public School(String name, String address, Principal principal){

        	this.name = name;
        	this.address = address;
        	this.principal = principal;
        	this.classRooms = new Classroom[MAX_CLASSES];
        	this.classCount = 0;

        }

	public void addClassRoom(Classroom classRoom){

        	if(classCount < MAX_CLASSES){
            		classRooms[classCount++] = classRoom;
        	}
    	}

	@Override
        public String toString(){
        	String classList = "";
        	for(int i = 0; i < classCount; i++){
            		classList += classRooms[i] + "\n";
        	}
        	return "School: " + name + "\nAddress: " + address + "\n" +
                "Principal: " + principal + "\n\n" +
                "Classes:\n" + classList;
    }


}