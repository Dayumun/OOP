package classExamples;

public class Activ9_StudentsApp {

	public static void main(String[] args) {
		float avg=0;
		
		
//		//esto podemos acortarlo con un vector, porque si tenemos que meter valores 40 veces estamos jodidos
//		Activity9_Students stu1 = new Activity9_Students("Diego", 24);
//		Activity9_Students stu2 = new Activity9_Students("Pablo", 26);
//		Activity9_Students stu3 = new Activity9_Students("Abel", 23);

		Activity9_Students[]daw1= new Activity9_Students[10];
		
		for(int i=0; i<daw1.length; i++) {
			daw1[i]=new Activity9_Students(/*ask name*/, /*ask age*/);
		}
		
		avg = (float)(stu1.getAge() + stu2.getAge() + stu3.getAge())/ 3f; 
		
		System.out.println("The average age is: " + avg);
	}

	
}
