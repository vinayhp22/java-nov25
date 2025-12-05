class CheckDemo {
	public static void main(String[] args){
		byte b1  = 'A' + 1; 
		short b2 = 'A' + 'B'; // CE: incompatible types: possible lossy conversion from int to byte
		// 65 + 66 = 131
		
		System.out.println(b1);
		System.out.println(b2); // 6
		char b = 65; //'A'
		char bb = 66; //'B';
		char bbb = 'A' + 1; // 'B'
		System.out.println(b1);

		//+ -> String Concatenation -> found right String
		//+ -> Arithmetic addition
		
		System.out.println("Manoj"+1+2+3); //Manoj123
		System.out.println(1+2+3+"Manoj"); //6Manoj
		
	}
}