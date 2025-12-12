package classExamples;

public class Bottle {
	int capacity= 33, height= 14;
	String material="plastic", color="transparent";
	
	public Bottle(int cap, int hei, String mat, String col) {
		capacity = cap;
		material = mat;
		height = hei;
		color = col;
	}
	
	//fill
	public void fill() {
		capacity = 33;
		
	}
	
	//empty
	public void empty() {
		capacity = 0;
		
	}
	
	//drink
	public void drink(int trago) {
		capacity-= trago;
		
	}
	
	
	//print
	public void printBottle() {
		System.out.println(">>capacity = " + capacity);
		System.out.println(">>height = " + height);
		System.out.println(">>material = " + material);
		System.out.println(">>color = " + color);
	}
	

}
