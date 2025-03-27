public class Main{

	 public static void main(String[] args){

		Principal principal = new Principal("Maryam Rashid", 50, 25);
		School school = new School("CUI LAHORE", "LDA Avenue", principal);
		
		Teacher teacher1 = new Teacher("Saad Imran", 35, "Math", 101);
        	Teacher teacher2 = new Teacher("Imran Latif", 40, "DSA", 102);

		Classroom class1 = new Classroom("Grade 10", "G10", teacher1);
        	Classroom class2 = new Classroom("Grade 11", "G11", teacher2);


		school.addClassRoom(class1);
        	school.addClassRoom(class2);

		Student s1 = new Student("Cainoosh", 16, 201);
        	Student s2 = new Student("Asad", 17, 202);
        	Student s3 = new Student("Wassam", 16, 203);
        	Student s4 = new Student("Minahil", 17, 204);
        	Student s5 = new Student("Fatima", 16, 205);
        	Student s6 = new Student("Amna", 17, 206);
	
		class1.enrollStudent(s1);
        	class1.enrollStudent(s2);
        	class1.enrollStudent(s3);
        	class1.enrollStudent(s4);
        	class1.enrollStudent(s5);
        	class1.enrollStudent(s6);

		System.out.println(school);

	}




}