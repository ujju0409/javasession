package javasession;

public class ObjectArrayConcept {

	public static void main(String[] args) {

		Object o[]= new Object[5];
		
		o[0]= "ujjval";
		o[1]= "reema";
		o[3]= 25;
		o[2]=12.5;
		
		
		
		for(Object e:o) {
		
			System.out.println(e);
		}
		
		
	}

}
