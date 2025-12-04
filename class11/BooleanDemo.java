class BooleanDemo {
	public static void main(String[] args){
		boolean b1 = true;
		boolean b2 = false;
		//boolean b3 = 0; // incompatible types: int cannot be converted to boolean
		//boolean b4 = 1; // incompatible types: int cannot be converted to boolean
		//boolean b5 = "true";  //incompatible types: String cannot be converted to boolean
		// boolean b6 = 'true'; //CE: unclosed character literal
		//boolean b7 = True;
		
		int x = 10;
		//if(x){ //  error: incompatible types: int cannot be converted to boolean
		if(x != 10){
			System.out.println("Hello");
		} else {
			System.out.println("Hi");
		}
		
		//while(x){ // error: incompatible types: int cannot be converted to boolean
		while(x>0){
			System.out.println(x);
			x--;
		}

	}
}