class JavaDevelopers{
	public static void main(String args[]){
		System.out.println("Hello amazing developer!!, What's the bug today...");


		String[] names = {"Rahul", "Manoj"};
		System.out.println(names.length);
		String returnValue = sayHello(names);
		System.out.println(returnValue);
		System.out.println("Main method finished!!!");
		
		String name = "Manoj";
		String tempName = name;
		
	}
	
	private static String sayHello(String[] students){
		System.out.println("Hello "+students[1]+" and "+students[0]);
		return "Thank You, Vtech";
	}
}

//public - access modifier : public, private, protected, default
//class - keyword, used to mark this as Class object

//main 
//public -> JVM's entry point is main method to execute the program
//main() should be public to access by JVM
//static -> keyword, indicates it belongs to Class, not to Object
// void -> return type, nothing returning back to JVM
// Class -> Blueprint of object(.java) 
// Object ->  Actual thing
// main -> methodName
