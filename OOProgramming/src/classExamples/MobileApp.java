package classExamples;

public class MobileApp {

	public static void main(String[] args) {
		Mobile_phones diegoMob = new Mobile_phones("POCO", "pink", -6);

//		diegoMob.scrSize=-6;	//aquí le podemos dar un valor negativo y eso es un fallo
		
		diegoMob.setScrSize(-6);
		
		//aqui entran los visibility modifiers, para evitar que se modifiquen los valores
		//solo podemos visualizarlo, no modificarlo al convertir la variable en private
		System.out.println(diegoMob.getScrSize());
		
		Mobile_phones inesMob = new Mobile_phones("Samsung", "grey", 8);

		Mobile_phones paulaPhone= new Mobile_phones("iPhone", "blue", 7);
		
		System.out.println("diego --> " + diegoMob.toString());
		System.out.println("ines --> " + inesMob.toString());
		System.out.println("paula --> " + paulaPhone.toString());
		
//		//diegoMob
//		System.out.println(diegoMob.toString());
//		
//		diegoMob.sendMessage("First Message");
//		System.out.println(diegoMob.messNum);
//		diegoMob.resetMessageNum();
//		System.out.println(diegoMob.messNum);
//		
//		diegoMob.messNum=6;
//		
//		System.out.println();
//		
//		
//		//inesMob
//		
//		System.out.println(inesMob.toString());
//		
//		inesMob.sendMessage("First Message");
//		System.out.println(inesMob.messNum);
//		inesMob.resetMessageNum();
//		System.out.println(inesMob.messNum);
	}

}
