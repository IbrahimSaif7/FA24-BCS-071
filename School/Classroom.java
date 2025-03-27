public class Classroom{

	private String name;
	private String code;
	private Teacher teacher;
	private Student[] students;
	private int studentCount;
        private static final int MAX_STUDENTS = 5;


	public Classroom(String name, String code, Teacher teacher){

        	this.name = name;
        	this.code = code;
        	this.teacher = teacher;
        	this.students = new Student[MAX_STUDENTS];
        	this.studentCount = 0;
        }

	public boolean enrollStudent(Student student){

       	 	if(studentCount >= MAX_STUDENTS){
            		System.out.println("Cannot enroll " + student.name + ", class is full.");
            		return false;
        	}
        	students[studentCount++] = student;
        	return true;
        }

	@Override
    	public String toString(){
        	String studentList = "";
        	for (int i = 0; i < studentCount; i++) {
            		studentList += students[i].toString() + "\n";
        	}
        	return "Class: " + name + " (" + code + ")\n" +
                "Teacher: " + teacher + "\n" +
                "Students:\n" + studentList;
    
}


	





}