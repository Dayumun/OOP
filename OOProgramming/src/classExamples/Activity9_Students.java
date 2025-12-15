package classExamples;

public class Activity9_Students {
	/*
	 * Write a program that asks for the data of 3 students whose name and age we
	 * are interested in. Subsequently, the program must show the average age of the
	 * three students. ​ Note: it is necessary to create two classes: one with the
	 * main ClaseApp method and another Alumno that has the data and methods of the
	 * students.​
	 */

	/*
	 * 3 students names and ages -------------- average of age
	 */

	int avg;
	private int age;
	private String name;

	//debemos acostumbrar a tener un constructor por defecto
	public Activity9_Students() {
		age=0;
		name="Pancracio";
	}
	
	
	public Activity9_Students(String name, int age) {
		setName(name);
		setAge(age);
	}

	public void setName(String nombre) {
		name = nombre;
	}

	//conviene que los setters y los getters no sean void y nos devuelvan el valor
	public void setAge(int age) {
		if (age > 0 && age < 120) {
			this.age = age;
		} else {
			System.err.println("wrong age");
			this.age = -1;
		}
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

}
