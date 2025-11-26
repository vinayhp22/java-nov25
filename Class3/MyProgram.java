class MyProgram{
	
	public static void main(String args[]){
		String name = null;
		char c = 'A';
		int num = 1;
		double dec = 10.5;
		System.out.println("Name: "+name);
		System.out.println("num: "+num);
		//num = num + 100; // 101
		//num += 100;
		System.out.println("Sum: "+2+ 3);

		
		for(int i = 1; i<=5; i++){
			num += 5;
			System.out.println("num at "+i+" is "+num);
		}
		
	}
}

