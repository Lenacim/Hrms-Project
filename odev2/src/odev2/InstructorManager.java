package odev2;

public class InstructorManager extends UserManager{
	
	public void getList(Instructor[] instructors) {
		for(Instructor instructor: instructors) {
		System.out.println("E�itmen : "+" "+instructor.getFirstName()+" "+instructor.getLastName()+" " +instructor.email+" "+" eklendi!");
	}
	

}
}