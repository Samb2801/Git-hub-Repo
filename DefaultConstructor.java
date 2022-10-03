//Default Constructor:= It is constructor that either has no paramater or if it has parameter, all parameter have default values. 
//If there is no constructor in a class, compiler automatically creates a default constructor. 
//It is called as default constructor beacuse it can not passes any parameters.

package constructor;

public class DefaultConstructor {

	public static void main(String[] args) {
		Test Te = new Test(); // declaration

	}

}
	class Test
	{
		int a;
		Test(){
			a=10;
			System.out.println("A:= "+a);
			System.out.println("Default constructor invoked");
		}
	}