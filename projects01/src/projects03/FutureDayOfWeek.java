package projects03;

public class FutureDayOfWeek {
public static void main(String[] args) {
	futureDayOfWeek("Monday",123);
	
}
static void futureDayOfWeek(String day,int num) {// Enter today's date and the number of the day for a future day. 
												 //It outputs the future day of the given number.
	String[] week= {"Monday","Tuesday", "Wednesday","Thursday","Friday","Saturday","Sunday"};
	for(int i=0;i<7;i++) {
		if(week[i].equals(day.toUpperCase().substring(0,1).concat(day.toLowerCase().substring(1)))){
			int x=(num%7+i)%7;
			System.out.println(week[x]);
			
		}
	}
	
}
}
