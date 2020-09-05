package in.jk;

import java.util.Date;
import java.util.function.Function;

public class FunctionInterfaceApplication {
	
	/*
	 Function interface :- Function is a functional interface . it have on method
	 
	 public interface Function<T,R>{
	 public R apply(T t);
	 }+
	 
	 which takes an generic T type input object and map it to generic  R type output object.
	  
	 */
	
	
	public static void main(String[] args) {
		
		InputObject inputObject = InputObject.getInputObject();
		
		Function<InputObject, OutputObject> function = (input)->{
			OutputObject outputObject = new OutputObject();
			outputObject.setId(input.getId());
			outputObject.setOutputBy(input.getInputBy());
			outputObject.setOutputDate(new Date());
			return outputObject;
			
			};
		
		
	OutputObject object=	map(inputObject, function);
	System.out.println(object);
	
		
	}
	
	
	public static OutputObject map(InputObject inputObject ,Function<InputObject, OutputObject> function) {
		return function.apply(inputObject);
	
	}

}


class InputObject{
	
	private int id ;
	private String inputBy;
	private Date inputDate;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getInputBy() {
		return inputBy;
	}
	public void setInputBy(String inputBy) {
		this.inputBy = inputBy;
	}
	public Date getInputDate() {
		return inputDate;
	}
	public void setInputDate(Date inputDate) {
		this.inputDate = inputDate;
	}
	
	public static InputObject  getInputObject() {
		InputObject  inputObject = new  InputObject();
		
		inputObject.setId(1);
		inputObject.setInputBy("J K");
		inputObject.setInputDate(new Date());
		
		return inputObject;
		
		
	}
	
	@Override
	public String toString() {
		return "InputObject [id=" + id + ", inputBy=" + inputBy + ", inputDate=" + inputDate + "]";
	}
	
	
	
}


class OutputObject{
	
	private int id ;
	private String outputBy;
	private Date outputDate;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOutputBy() {
		return outputBy;
	}
	public void setOutputBy(String outputBy) {
		this.outputBy = outputBy;
	}
	public Date getOutputDate() {
		return outputDate;
	}
	public void setOutputDate(Date outputDate) {
		this.outputDate = outputDate;
	}
	
	@Override
	public String toString() {
		return "OutputObject [id=" + id + ", outputBy=" + outputBy + ", outputDate=" + outputDate + "]";
	}
	
	
	
}
