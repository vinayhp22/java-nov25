class Demo {
	public static void main(String[] args){
		System.out.println("Hello World");
		System.out.println("Length: "+args.length);
		//java.lang.System.out.println(args[0]);
		//java.lang.System.out.println(args[1]);
		//java.lang.System.out.println(args[2]);
		int x = 3;
		System.out.println(x == 1 + 1 ? "Correct" : "Incorrect");
	}
}

/*

class = keyword, to mark this as Class, blueprint of object, variables, methods
Demo = identifier/Class Name, this represent a class
public = access modifier, its visibility from anywhere
static = keyword, belongs to class, not object
void = no return value
main = identifier/methodName
String = Collection of Characters()
[] = array- index based, fixed, collection of same data.(homogenous data)
String[] args = {"Rahul", "Manoj"};
args = identifier/parameter name
*/

