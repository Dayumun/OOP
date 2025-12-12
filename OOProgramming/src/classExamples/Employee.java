package classExamples;
/*
 * name
 * salary
 * ----------------
 * toString()
 * getSalary()
 * setSalay(float sal)
 */

/*
 * App
 * 2xEmployee
 * ----------------
 * comparing salaries() {telling the employee with biggest salary}
 */
public class Employee {
	
	//employee
	
	private String name;
	private float salary;
	
	public Employee(String nombre, float sal) {
		name = nombre;
		setSalary(sal);
	}
	
	public void setSalary(float sal) {
		if(sal >= 1184f) {
			salary = sal;
		}else {
			System.err.println("Dude, so low salary don't be a rat");
			salary= 1184;
		}
	}
	
	public float getSal() {
		return salary;
	}
	
	public String toString() {
		String auxStr= "name = " + name + ", and salary = " + salary;
		return auxStr;
	}
	
	public String getName() {
		return name;
	}
	
	
}
