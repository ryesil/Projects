package projects03;

public class FutureTuitonWithFourYearCost {

	public static void main(String[] args) {
// Finds tuition after given year along with the cost of fourth year.

	}
	
	static void financial(int year, double tuition, double rate) {
		int count=0;
		double total=0;
		while (count<=year) {
			tuition+=tuition*(rate/100);
			count++;
		if(count==4) {
			total=tuition;
		}
			
		}
		System.out.println("Four year :$"+((int)(total*100))/100.0);
		System.out.println("Total :$"+((int)(tuition*100))/100.0);
		
	}

}
