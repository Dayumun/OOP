package classExamples;
import java.util.Scanner;

public class RenctangApp {

	public static void main(String[] args) {
		int option, side1, side2;
		float area;
		
		Rectangle rectan= null;
		
		String[] menu= {"1- give rectangle data", "2- area", "3- perimeter", "4- exit"};
		
		//otra manera de hacer un menu
		for(int i=0; i<menu.length; i++) {
			System.out.println(menu[i]);
		}

		option = askInt("Give me an option: ");
		
		switch (option) {
			case 1:	//ask rectangle data
				System.out.println("Gvie me both sides: ");
				side1= askInt("Give me the first side: ");
				side2 = askInt("Give me the second side: ");
				
				rectan = new Rectangle(side1, side2);
		
				break;

			case 2:	//calculate the area
				if(rectan != null) {
					area = side1
				}else {
					System.err.println("First give values");
				}

		
			default:
				System.err.println("not a valid option");
				break;
			
		
		}
		
	}
	
	public static int askInt(String message) {
		int num;
		System.out.println(message);
		Scanner keyboard = new Scanner(System.in);
		num = keyboard.nextInt();
		return num;
	}

}
