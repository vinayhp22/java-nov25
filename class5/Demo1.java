import java.util.Arrays;

class Demo1 {
	public static void main(String[] args){
		String[] names = {"Rahul", "Manoj", "Vinay"};
		
		Arrays.stream(names).forEach(System.out::println);
	}
}