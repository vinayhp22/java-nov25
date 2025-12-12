class Demo {
	static int staticVariable = 10;
	int instanceVariable = 20;

	Demo(){
		System.out.println("Default Contructor of Demo Called...");
	}
	
	public static void main(String[] args){
		int localVariable = 40;
		//To access static variable -> className
		System.out.println(localVariable);
		System.out.println(Demo.staticVariable);
		
		//To access instance variable -> Object
		// To create an object - we use new keyword //instantiation
		Demo obj = new Demo();
		System.out.println(obj.instanceVariable);
		int temp =  obj.display();
		System.out.println(temp);
		
		Demo obj2 =  new Demo();
		obj2.instanceVariable = 1000;
		System.out.println(obj2.instanceVariable);
		System.out.println(obj.instanceVariable);
		
		System.out.println(obj.staticVariable);
		System.out.println(obj2.staticVariable);
		
		obj.staticVariable = 2000;
		System.out.println(obj.staticVariable);
		System.out.println(obj2.staticVariable);
		
		
		//System.out.println(Demo.localVariable); //Can't possible to local variable using obj reference or class name

		
		// System.out.println(Demo.instanceVariable); //Can't possible to access instance variable using Class Name	
	}
	
	int display(){
		int value = 100;
		return value;
	}
	
}