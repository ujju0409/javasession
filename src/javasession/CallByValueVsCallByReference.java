package javasession;

public class CallByValueVsCallByReference {
String name ;
int age;
	public static void main(String[] args) {

		
		 CallByValueVsCallByReference obj= new CallByValueVsCallByReference();
		 obj.add(10,20);
		 obj.name="jay";
		 obj.age=25;
		 obj.sendmail(obj);// obj and t1 both at same location
		 
		
		
		
	}
		public void add(int a, int b) {
			
			System.out.println(a+b);
			
		}
		
		public void sendmail(CallByValueVsCallByReference t1) {
			System.out.println(t1.name);
			System.out.println(t1.age);
			
			
			
			
		}
		
		
		
	}


