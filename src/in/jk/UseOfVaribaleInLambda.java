package in.jk;

public class UseOfVaribaleInLambda {
	
	int id=0;
	String name="JK";
	
	public static void main(String[] args) {
		
		String company ="Google";
		
		UseOfVaribaleInLambda varibaleInLambda = new UseOfVaribaleInLambda();
		
		varibaleInLambda.id=1;
		varibaleInLambda.name="JK";
		
		
		// Not Allowed with Lambda
		//company ="Jet Brains"; // Local variable company defined in an enclosing scope must be final or effectively 
		
		Runnable runnable = ()->System.out.println(varibaleInLambda.id+ " "+ varibaleInLambda.id +" " +company);
		
		runnable.run();
		
		// Not Allowed with Lambda here too .
		//company ="Jet Brains"; // Local variable company defined in an enclosing scope must be final or effectively 

	}

}
