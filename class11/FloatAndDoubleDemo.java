class FloatAndDoubleDemo {
	public static void main(String[] args){
		double d1 = 10.5; // double is default for all decimal values
		//float f1 = 10.5;  //CE: incompatible types: possible loosy conversion from double to float
		
		float f2 = 10; // internally converts from int to float
		float f3 = 'A'; // internally converts from char to int, then int to float
		byte b1 = 10;
		float f4 = b1;
		short s1 = 1000;
		float f5 = s1;
		float f6 = 10000L;
		float f7 = 10.5f;
		//float f8 = true;  //CE: incompatible types: boolean cannot be converts to float
		float f9 = 22/7f;
		System.out.println("Float: "+f9); //Float: 3.142857 => 5-6 decimal places accuracy
		double d2 = 10; // int
		double d3 = 'A'; // char
		double d4 = b1; //byte
		double d5 = s1; //short
		double d6 = 10.5f; //float
		//double d7 = false; //CE: incompatible types: boolean cannot be converts to double
		double d8 = 22/7d;
		System.out.println("Double: "+d8); //Double: 3.142857142857143
			
									// => 14-15 decimal places accuracy
		
		
		long l1=-89864111L;
		System.out.println("long l1= "+l1);
		float f8= l1;
		System.out.println("float f8: " +f8);
		
		
		float f10 = 8.899729728972969f;
		System.out.println("float f10: " +f10);
		double d10 = 8.899729728972969f;
		System.out.println("float d10: " +d10);
	}
}	
