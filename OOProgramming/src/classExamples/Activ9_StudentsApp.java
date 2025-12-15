package classExamples;

public class Activ9_StudentsApp {

	public static void main(String[] args) {
		float avg=0;
				
		Activity9_Students stu1 = new Activity9_Students("Diego", 24);
		Activity9_Students stu2 = new Activity9_Students("Pablo", 26);
		Activity9_Students stu3 = new Activity9_Students("Abel", 23);

		avg = (float)(stu1.getAge() + stu2.getAge() + stu3.getAge())/ 3f; 
		
		System.out.println("The average age is: " + avg);
	}

	
}
