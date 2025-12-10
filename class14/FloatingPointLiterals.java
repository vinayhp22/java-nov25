class FloatingPointLiterals {
	public static void main(String[] args){
		float f1 = 10;
		float f2 = 10.5f;
		float f3 = 010; //8.0
		float f4 = 010.5f; //10.5
		float f5 = 0x10;
		//float f6 = 0x10.5f; // CE: malformed floating-point literal
		//float f6 = 0x10.5;
		
		System.out.println(f1 + " - "+f2 + " - "+f3+"-"+f4 + " - " + f5 );
		
		//Scientific Notation / Exponential Notation
		float f6 = 2e2f; //2*10^2 = 200  => 0.02 => 2*10^-2
		float f7 = 2e-2f; //0.02 => 2.02 => 
		float f8 = 202e-2f;
		float f9 = 2.02f;
		System.out.println(f6 + " - "+f7+ " - "+f8);
		
		double d1 = 10;
		double d2 = 10.5d;
		double d3 = 010; //8.0
		double d4 = 010.5;  //10.5
		double d5 = 0x10; //16.0
		//double d6 = 0x10.5; //error: malformed floating-point literal
		double d6 = 2e2; //200.0
		double d7 = 2e-2; // 0.02
		double d8 = 202e-2; //2.02
		double d9 = 10.6f;
		
		System.out.println(d1 + " - "+d2 + " - "+d3+"-"+d4 + " - " + d5 );
		System.out.println(d6 + " - "+d7 + " - "+d8+" - "+d9 );
		

	}
}