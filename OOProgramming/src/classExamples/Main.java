package classExamples;

public class Main {

	public static void main(String[] args) {
		Bottle bott1 = new Bottle();
		Bottle bott2 = new Bottle();
		Bottle diegoBottle = new Bottle(50, 25, "steel", "grey");	//así si cambiamos los parámetros
		
		//vamos a cambiar los parámetros de nuestro objeto, pero así no conviene hacerlo
//		diegoBottle.capacity = 50;
//		diegoBottle.material = "Steel";
//		diegoBottle.height = 25;
//		diegoBottle.color = "grey";
		
		System.out.println("capacity = " + bott1.capacity);
		System.out.println("height = " + bott1.height);
		System.out.println("material = " + bott1.material);
		System.out.println("color = " + bott1.color);
	
		System.out.println();
		
		bott2.printBottle();	//mucho más limpio que arriba, y si tengo que cambiar algo lo cambiamos en común en el método printBottle()

		bott2.drink(13);
		
		System.out.println("bott2 after dry:");
		System.out.println("capacity= " + bott2.capacity);
		System.out.println();
		
		bott1.drink(23);
		System.out.println("capacity = " + bott1.capacity);
		
		bott1.empty();
		System.out.println("capacity = " + bott1.capacity);
	
		
		
	
	}

}
