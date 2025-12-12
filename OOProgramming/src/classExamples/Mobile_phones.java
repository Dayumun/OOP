package classExamples;
/*
 * brand
 * screen size
 * color
 * messageNumber
 * ----------------
 * sendMessage(print screen)
 */
public class Mobile_phones {

	String brand, color;
	private int scrSize, messNum;	//nadie puede ver las propiedades, solo podemos modificar los valores dentro de la clase
	
//	brand= "POCO";
//	color= "pink";
//	scrSize = 6;
//	messNum= 0;
//	
	
//	public Mobile_phones() {	//creamos el constructor, con el que damos valores default a nuestro objeto, al que añadimos parámetros
//		brand= "POCO";
//		color= "pink";
//		scrSize = 6;
//		messNum= 0;
//	}
	
	//creamos el constructor, con el que damos valores 
	//default a nuestro objeto, al que añadimos parámetros
	
	public Mobile_phones(String marca, String col, int size) {
		brand = marca;
		color = col;
		setScrSize(size);
		messNum= 0;
	}
	public void sendMessage(String message) {
		System.out.println(message);
		messNum++;
	}
	
	public void resetMessageNum() {
		messNum=0;
	}
	
	public int getScrSize() {	//para poder tener acceso a ver la variable
		return scrSize;
	}
	
	public void setScrSize(int size) {	//para controlar la entrada de valores a la variable
		if(size > 1) {
			scrSize= size;	
		}else {
			System.err.println("Negative size");
			scrSize = 0;
		}
	}
	
	public String toString() {
		String auxStr= "brand = "+brand+ ", color= " +color+ ", size= " +  scrSize+ ", message send= " + messNum;
		return auxStr;
	}
}
