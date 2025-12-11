class CharLiterals {
	public static void main(String[] args){
		//Unicode escape sequence
		// '\u0000' = 0
		// '\uffff' = 65535
		char c1 = '\u0041';
		char c2 = '\u0021'; //2*16 + 1 =  33
		char c3 = '\u000f'; //15
		System.out.println(c1 +" - "+c2+" - " + '\n' +c3);
		
		// Escape sequence - defined by JAVA
		// \n -> new Line
		// \t -> tab	
		// \r -> carriage return
		// \f -> form feed
		// \b -> Backspace
		// \\ -> \ 
		// \" => "
		// \' => '
		
		char newLine = '\n';
		char tab = '\t';
		char carriage = '\r';
		char form = '\f';
		char backspace = '\b';
		char backslach = '\\';
		char doubleQuote = '\"';
		char singleQuote = '\'';
		//char e1 = '\v'; //CE: illegal escape character
		
		System.out.println("New Line: "+newLine+" Tab: "+tab+"Carriage: "+carriage
		+"Form feed: "+ form + "BackSpace: "+ backspace+ "backslach: "+ backslach+
		"doubleQuote: "+doubleQuote+ "singleQuote: " + singleQuote);
		
		System.out.println("Rahul says \"Don't be hessy\"");
		System.out.println("Rahul says " +'\"'+"Don't be hessy"+'\"');
		
		
	
	
	}
}