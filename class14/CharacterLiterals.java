class CharacterLiterals {
	public static void main(String[] args){
		// char -> a single 16 bit unicode character
		//ASCII -> only from English -> 1byte(0 - 256)
		// Unicode -> from all over the world langauges(0-65535)
		
		// 1. single character in single quotes
		char s1 = 'A';
		//char s2 = "A"; // error: incompatible types: String cannot be converted to char
		//char s2 = 'Aa'; //error: unclosed character literal
		//char s2 = "Aa"; // error: incompatible types: String cannot be converted to char
		char s2 = '1';
		int add = s2 + 1; //50
		System.out.println(s1 +" - "+s2+" - "+add );
		int s3 = ' ';
		System.out.println(s3);
		
		//2. Using integers
		char i1 = 65;
		char i2 = 97;
		char i3 = 0102; //66 -> B
		char i4 = 0x55; //85 -> U
		System.out.println(i1+" - "+i2 + " - "+ i3+ " - "+ i4); //A - a
		
	
	}
}