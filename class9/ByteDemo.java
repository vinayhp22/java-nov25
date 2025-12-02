class ByteDemo{
	public static void main(String[] args){
		byte b1 = 1;
		byte b2 = 127;
		//byte b3 = 128; // CE: incompatible types: possible lossy conversion from int to byte
		byte b4 = -128;
		// byte b5 = -129; // CE: incompatible types: possible lossy conversion from int to byte
		System.out.println(b1 +" - "+ b2 + " - " + b4);
	
		// byte b6 = 10.5; // CE: incompatible types: possible lossy conversion from double to byte
		
		// byte b7 = "Manoj"; //  CE: incompatible types: String cannot be converted to byte
		
		// byte b8 = true; //CE: incompatible types: boolean cannot be converted to byte
		
		byte b9 = 'A';
		byte b10 = '*';
		byte b11 = 'a';
		System.out.println(b9 +" - "+ b10 + " - " + b11); // 65 - 42
		
		byte a1 = 9;
		byte a2 = '9';
		System.out.println(a1 + " - "+ a2); // 9 - 57
		
	}
}