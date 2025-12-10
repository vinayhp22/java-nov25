class IntegerLiterals {
	public static void main(String[] args){
		//Decimal Literals
		int d1 = 10;
		int d2 = 108;
		
		//Octal Literals
		int o1 = 010; //8
		int o2 = 020; //16
		//int o3 = 08; CE: ; expected
		
		System.out.println(o1 + " - "+o2);
		
		//hexadecimal Literals
		int h1 = 0X10; // 16
		int h2 = 0xf; // 15
		int h3 = 0xface;
		//int h4 = 0xbeer;  // CE: ; expected
		int h5 = 0xffffffff;
	
		System.out.println(h1 + " - "+h2 + " - "+h3+ " - "+h5);
		byte b1 = 10;
		byte b2 = 010;
		byte b3 = 0x10;
		//byte b4 = 0xfff; //CE: incompatible types: possible loosy conversion from int to byte
		System.out.println(b1 + " - "+b2 + " - "+b3);
		
		short s1 = 10;
		short s2 = 010;
		short s3 = 0x10;
		//short s4 = 0xffff;
		System.out.println(s1 + " - "+s2 + " - "+s3);
		
		long l1 = 10; //widening conversion
		long l2 = 010;
		long l3 = 0x10;
		long l4 = 0xfffffffffl;
		System.out.println(l1 + " - "+l2 + " - "+l3 + " - "+l4);
		
		
	}
}