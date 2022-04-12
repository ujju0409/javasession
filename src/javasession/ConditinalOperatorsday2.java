package javasession;

public class ConditinalOperatorsday2 {

	public static void main(String[] args) {
		int a = 10;
		int b =20;
		
		
		
		if (a>b) {
			System.out.println("a is big number ");	
		}
		
		else {
			System.out.println("b is big number ");
		}
		
		//dead code 
		if (true) {
			System.out.println("hi");
		}
		else {
			System.out.println("bye");
		}
		
		
		if(false) {
			System.out.println("hiii");
		}
		else {
			System.out.println("byee");
		}
		
        boolean  flag = true;
        if(flag) {
        	System.out.println("hi");
        }
        else {
        	System.out.println("byee");
        }
		
		int marks = 96;
		if (marks>=95) {
			System.out.println("grade a++");
		}
		else if (marks>=90) {
			System.out.println("grade a");
		}
		else {
			System.out.println("grade b");
		}
		
		//wap to find out max number in given three number 
		
		int x =100;
		int y=200;
		int z=300;
		
		if (x>y&&x>z) {
			System.out.println("x is greatset number ");
		}
		if (y>z) {
			System.out.println("y is greatst number ");
		}
		else {
			System.out.println("z is gratest number ");
		}

		/*String browser="firefox";
		if(browser.equals("chrome")) {
			System.out.println("lunch chrome ");
		}
		if (browser.equals("safari")) {
			System.out.println("lunch safari");
		}
		if (browser.equals("firefox")) {
			System.out.println("lunch ff");
		}
		else {
			System.out.println("plase pass right browser");
		}*/
		
		
		String browser="chrome";
		
		if (browser.equals("chrome")) {
		System.out.println("lunch chrome ");
		}
		else if (browser.equals("firefox")) {
			System.out.println("lunch firefox");
		}
		else if (browser.equals("safari")) {
			System.out.println("lunch safari");
		}
		else {
			System.out.println("plase pass the right browser");
		} 
			
		
	}

}
