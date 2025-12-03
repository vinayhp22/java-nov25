class ByteDemo{
	public static void main(String[] args){
		byte b1 = 10;
		//byte b2 = -129; //CE: Incompatible types: possible loosy conversion from int to byte
		
		//byte b3 = 10.5; //CE: Incompatible types: possible loosy conversion from double to byte
		
		//byte b4 = "Rahul"; //CE: incompatible types: String cannot be converted to byte
		
		byte b5 = 'R';
		
		//byte b6 = 'null'; // asci value
		//byte b6 = null; // CE: incompatible types: <null> cannot be converted to byte
		
		byte[] byteNumbers = {10, 20, 30, 150}; // CE: incompatible types: possible lossy conversion from int to byte
		
		System.out.println(byteNumbers[2]);
		for(int i = 0; i < byteNumbers.length; i++){
			System.out.println(byteNumbers[i]);
		}
	}
}

//Byte is best when handling raw binary data
//1. File operations(Reading/Writing bytes)
//2. Network Data Transfer(Streams)

