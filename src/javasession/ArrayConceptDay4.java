package javasession;

import javax.security.auth.kerberos.KerberosCredMessage;

public class ArrayConceptDay4 {

	public static void main(String[] args) {
	int a[]= new int[10];
	a[0]=1;
	a[1]=2;
	a[2]=3;
	a[3]=40;
	//a[4]=10; AIOB 
	
	
	System.out.println(a[0]);
	//System.out.println(a[5]);  AIOB 
	
	int b =a.length;
	int c= a.length-1;
	
	
	System.out.println(b);
	System.out.println(c);
	  System.out.println("--------------------");
	  
	  
	double d[]=new double[4];
	d[0]=12.33;
	d[1]=33.33;
	d[2]=43.43;
	d[3]=45.45;
	for(int k=0;k<d.length;k++ ) {
		System.out.println(d[k]);
	}
	
	System.out.println("--------------------");
	
	for(double e:d) {
		System.out.println(e);
		
	}

	System.out.println("--------------------");
	
	char f[]= new char[5];
	f[0]='a';
	f[1]='g';
	f[2]='@';
	
	for(int e =0; e<f.length;e++) {
		System.out.println(f[e]);
	}
	
	System.out.println("--------------------");
	
	
	String s[] =new String[3];
	s[0]= "java";
	s[1]="naveem";
	s[2]="kaka";
	
	for(String h:s) {
		System.out.println(h);
		System.out.println("--------------------");
		
		
		for (int g =s.length-1;g>0;g--) {
			System.out.println(s[g]);
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
