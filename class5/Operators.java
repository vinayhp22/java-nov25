class Operators {
		static String usn = "vtech";
		static int pwd = 1234;
	public static void main(String[] args){
		
	
		if(!(usn=="vtech" || pwd == 123)){
			System.out.println("Successfully Logged In...");
		} else {
			System.out.println("incorrect credentials...");
		}
		
		if(usn=="vtech" && pwd != 123){
			System.out.println("Successfully Logged In...");
		} else {
			System.out.println("incorrect credentials...");
		}
		
		int age = 10;
		System.out.println(++age); //first increment then use
		System.out.println(age); 
		
		int num = 10;
		String result = (num%2==0)?"Even":"Odd";
		System.out.println(result); 
		
		int[] numbers = {1, 3, 4};
		for(int i = 0; i< numbers.length; i++){
			System.out.println(numbers[i]);
		}
		
		for(int num10 : numbers){
			System.out.println(num10);
		}
	}
}