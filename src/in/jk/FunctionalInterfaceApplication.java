package in.jk;

/* 
 
 Functional Interface :- Functional Interface is an interface that only define one abstract method .
 
 

*/

@FunctionalInterface
 interface Adder{

	 public int add(int a,int b);
	
}


public class FunctionalInterfaceApplication {
	
	public static void main(String[] args) {
		
		
		Adder adder = (a,b)->a+b; // inline of implementation o functional interface 
		
		System.out.println(adder.add(10, 10));
		
	}

}
