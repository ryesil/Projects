package projects03;

public class CalendarCalc {
	public static void main(String[] args) {
		calendar(1995,13);
	}
	static void calendar(int year, int month) {
		String x="";//takes up the month.
		//String mnth=month.toUpperCase().substring(0,1).concat(month.toLowerCase().substring(1));
		boolean isLeap=year%400==0||(year%100!=0 && year%4==0);
		int y=0;// takes up the number of days.
		switch(month) {
		case 1: x="January"; y=31;
		break;
		case 2: x="February"; y=isLeap?29:28; 
		break;
		case 3: x="March"; y=31;
		break;
		case 4: x="April"; y=30;
		break;
		case 5: x="May"; y=31;
		break;
		case 6: x="June"; y=30;
		break;
		case 7: x="July"; y=31;
		break;
		case 8: x="August"; y=31;
		break;
		case 9: x="September"; y=30;
		break;
		case 10: x="October"; y=31;
		break;
		case 11: x="November"; y=30;
		break;
		case 12: x="December"; y=31;
		default:
		x="Month should be between 1 and 12 inclusive.";
		}
		if(month<1||month>12) {
			System.out.println(x);
		}else
		System.out.println( x +" "+year+ " had "+y+" days.");
	}
}
