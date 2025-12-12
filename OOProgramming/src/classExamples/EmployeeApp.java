package classExamples;

public class EmployeeApp {

	public static void main(String[] args) {
		Employee empl1 = new Employee("diego", 2434.54f);
		Employee empl2 = new Employee("paco", 1234.45f);
		Employee auxEmpl = salaryComparation(empl1, empl2);
		
		System.out.println("the salary is: " + empl1.getSal());
		System.out.println(empl1.toString());

		System.out.println("---------------------------");
		
		System.out.println("the salary is: " + empl2.getSal());
		System.out.println(empl2.toString());

		//compare salaries
		
		System.out.println();
		
		//System.out.println(salaryComparation(empl1, empl2) + " has the bigger salary");
		System.out.println(">>"+auxEmpl.toString());
	}
	
	//creando métodos, en los parámetros tambien podemos usar clases para crear nuestros propios tipos de variable, se llaman tipos propios
	public static Employee salaryComparation(Employee empl1, Employee empl2) {
		if(empl1.getSal()> empl2.getSal()) {
			return empl1;
		}else {
			return empl2;
		}
	}

}
