class Java7Enhancements {
	public static void main(String[] args){
		int i1 = 0b10;
		int i2 = 0B111;
		int i3 = 1_00_00_000;
		//int i4 = _1_00_00_000; //error: cannot find symbol
		int i4 = 1_00_00_000_; // error: illegal underscore
		double d1 = 1_00_00_000.00_50_3;
		//double d2 = 1_00_00_000.00_50_3_; // error: illegal underscore
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
	
	}
}