class GitToken {
	private final String name = "Rahul"; // non-static or instance or object type
	public static void main(String[] arhs){
		boolean b1 = true;
		boolean b2 = false;
		
		GitToken gt = new GitToken();
		
		System.out.println("b1: "+b1);
		System.out.println("b2: "+b2);
		System.out.println("name: "+gt.name);
		
		gt.name = "Manoj";
		System.out.println("name: "+gt.name);

	
	}
}