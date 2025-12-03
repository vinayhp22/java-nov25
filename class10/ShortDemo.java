class ShortDemo{
	public static void main(String[] args){
		// size = 2bytes/16bits
		// range = -2^15 to 2^15-1(-32768 to 32767)
		int s1 = 10;
		short s2 = 32767;
		//short s3 = 32768; //CE: incompatible types: possible loosy conversion from int to short;
		
		byte b1 = 50;
		short s4 = b1; //Widening conversion
		
		// short s5 = "Rahul"; // CE: incompatible types: String cannot be converted to short
		short s6 = 'Z'; 
		// short s7 = true; // CE: incompatible types: boolean cannot be converted to short

		short[] shortNumbers = {10, -32768, 32767};
		for(int i = 0; i < shortNumbers.length; i++){
			System.out.println(shortNumbers[i]);
		}
	}
}

// Usage: We rarely use in modern programming
Why its Rare?
- Originally used in 16-bit processors (like Intel 8086) to save memory
- Now, its replaced mostly by int(because Modern processors are 32 bits or 64 bits)

Note: Use short whenever we require memory optimization is critical..


