class PrintDemo{
	public static void main(String[] args){
		System.out.println("======println() - new line =======");

		System.out.println("Name - 1: Mannoj");
		System.out.println("Name - 2: Rahul");
		
		System.out.println("======print() - no new line=======");

		System.out.print("Name - 1: Mannoj");
		System.out.print("Name - 2: Rahul");
		
		System.out.println("======printf() - formating =======");
		System.out.printf("%5s%-15s%d","Name - 1: Mannoj", "Temp", 1);
		
		System.out.println("======printf() - Billing System =======");
		System.out.println();
		System.out.printf("%-10s%5s%10s%n","Item", "Qty", "Price");
		System.out.printf("%-10s%5d%10.2f%n","Apple", 3, 60.50);
		System.out.printf("%-10s%5d%10.2f%n","Banana", 2, 25.00);
	}
}
	