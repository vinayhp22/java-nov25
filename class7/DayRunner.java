class DayRunner {
	public static void main(String[] args){
		Day today = Day.THURSDAY;
		
		System.out.println(today);
		
		Day[] days = Day.values();
		for(int i = 1; i< days.length; i=i++){
			 System.out.println(days[i]);
		}
	}
}