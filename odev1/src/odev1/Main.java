package odev1;



    public class Main {
	public static void main(String[] args) {
		
		Course course1 = new Course(1,"Programlamaya Giri� ��in Temel Kurs", "Engin Demiro�","5 saat");
		Course course2 = new Course(2,"Yaz�l�m Geli�tirici Yeti�tirme Kamp�(C# + ANGULAR)", "Aleyna Isn�k","50 saat");
		Course course3 = new Course(3,"Yaz�l�m Geli�tirici Yeti�tirme Kamp�(JAVA+REACT)", "Emir K���k","100 saat");
		 
		
	
        
          
        CourseManager courseManager = new CourseManager();
        
  		courseManager.sendEmail(course1);
  		
  		courseManager.sendEmail(course2);
  		
  		courseManager.sendEmail(course3);
		
		
	}

}
