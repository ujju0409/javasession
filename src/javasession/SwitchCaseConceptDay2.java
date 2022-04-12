package javasession;

public class SwitchCaseConceptDay2 {

	public static void main(String[] args) {
		
		String browser="chromen";
		switch (browser.toLowerCase().trim()) {
		
		case "chrome" :
			System.out.println("lunch chrome");
			break;
			
		case "firefox" :
			System.out.println("lunch ff");
			break;
		case "safari" :
			System.out.println(" lunch safari");
			break;
		case "opera" :
			System.out.println("lunch opera");
			break;
			
		
		default: System.out.println("please pass the right browser");
			break;
		}
		
		 int  marks =1;
		switch (marks) {
		case 90:
          System.out.println("gared A++");			
			break;
		case 80:
	     System.out.println("gared A");			
				break;
				
		case 70:
			System.out.println("grade b");
			break;
			
		default: System.out.println("fail");
			break;
		}
		
		
		}}

	
	
	
	
	

