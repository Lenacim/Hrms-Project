package odev2;

public class Main {
	public static void main(String[] args) {
		
		 Instructor instructor = new Instructor();
	        instructor.setId(1);
	        instructor.setFirstName("Engin");
	        instructor.setLastName("Demiro�");
	        instructor.setEmail("engindemirog@gmail.com");
	        instructor.setPassword("*******");
		
	        Instructor[] instructors = {instructor};
	        InstructorManager instructorManager=new InstructorManager();
	        instructorManager.getList(instructors);

			
	
	
		    Student student = new Student();
	        student.setId(2);
	        student.setFirstName("Aleyna");
	        student.setLastName("Isn�k");
	        student.setEmail("aleynaisnik@gmail.com");
	        student.setPassword("*****");
	        
	        Student student2 = new Student();
	        student2.setId(2);
	        student2.setFirstName("Aleyna");
	        student2.setLastName("Isn�k");
	        student2.setEmail("aleynaisnik@gmail.com");
	        student2.setPassword("*****");
	        
	        Student[] students = {student,student2};
	        StudentManager studentManager=new StudentManager();
	        studentManager.getList(students);
	 
			
			

			

			
			
		
		
	      
		
	}

}
