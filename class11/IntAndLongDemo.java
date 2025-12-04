class IntAndLongDemo {
	public static void main(String[] args){
		int i1 = 100000;
		long l1 = 100000; //int value is converting long data
		// int i2 = 9234567890; - out of range
		long l2 = 9234567890l; // directly assigning long value using prefix L/l
		int i1 = 10l; // long value cannot be convert to int

		System.out.println(i1);
		System.out.println(l1);
		System.out.println(l2);
		
		int i3 = 'a'; // internally it convert from charcter to ascii value(65)
		int i4 = true; //CE: incompatible types: boolean cannot converted to int
		int i5 = 10.5; //CE: incompatible types: possible loosy convertion from double to int
		
		byte b1 = 10; // internally it convert from int to byte because int is default type
	}
}