package projects03;

public class Income_tax {

	public static void main(String[] args) {
		incomeTax(123344,"head");

	}

	static void incomeTax(double income,String status) {// calculates income tax based on (int) income and 
														//(String) status {single, marriedJoint, marriedSep, head}
		double taxBreaks[]= {0.1,0.15,0.25,0.28,0.33,0.35};
		double tax;
		if(status.equals("single")) {
			if(income<8351) {
				tax=income*0.1;
				
			} else if(income<33951) {
				tax=8350*0.1+(income-8350)*0.15;
				
			}else if(income<82251) {
				tax=8350*0.1+(33950-8350)*0.15+(income-33950)*0.25;
				
			}else if(income<171551) {
				tax=8350*0.1+(33950-8350)*0.15+(82250-33950)*0.25+(income-82250)*0.28;
			}else if(income<372951) {
				tax=8350*0.1+(33950-8350)*0.15+(82250-33950)*0.25+(171550-82250)*0.28+(income-171550)*0.33;
			}else {
				tax=8350*0.1+(33950-8350)*0.15+(82250-33950)*0.25+(171550-82250)*0.28+(372950-171550)*0.33+(income-372950)*0.35;
				
			}
			System.out.printf("$%.2f",tax);
			
		}else if(status.equals("marriedJoint")) {
		
			if(income<16701) {
				tax=income*0.1;
				
			} else if(income<67901) {
				tax=16700*0.1+(income-16700)*0.15;
				
			}else if(income<137051) {
				tax=16700*0.1+(67900-16700)*0.15+(income-67900)*0.25;
				
			}else if(income<208851) {
				tax=16700*0.1+(67900-16700)*0.15+(137050-67900)*0.25+(income-137050)*0.28;
			}else if(income<372951) {
				tax=16700*0.1+(67900-16700)*0.15+(137050-67900)*0.25+(208850-137050)*0.28+(income-208850)*0.33;
			}else {
				tax=16700*0.1+(67900-16700)*0.15+(137050-67900)*0.25+(208850-137050)*0.28+(372950-208850)*0.33+(income-372950)*0.35;
				
			}
			
		} else if (status.equals("marriedSep")) {
			
			if(income<8351) {
				tax=income*0.1;
				
			} else if(income<33951) {
				tax=8350*0.1+(income-8350)*0.15;
				
			}else if(income<68526) {
				tax=8350*0.1+(33950-8350)*0.15+(income-33950)*0.25;
				
			}else if(income<104426) {
				tax=8350*0.1+(33950-8350)*0.15+(68525-33950)*0.25+(income-68525)*0.28;
			}else if(income<186476) {
				tax=8350*0.1+(33950-8350)*0.15+(68525-33950)*0.25+(104425-68525)*0.28+(income-104425)*0.33;
			}else {
				tax=8350*0.1+(33950-8350)*0.15+(68525-33950)*0.25+(104425-68525)*0.28+(186475-104425)*0.33+(income-186475)*0.35;
				
			}
			
		} else if (status.equals("head")) {
			if(income<11951) {
				tax=income*0.1;
				
			} else if(income<45501) {
				tax=11950*0.1+(income-11950)*0.15;
				
			}else if(income<117451) {
				tax=11950*0.1+(45500-11950)*0.15+(income-45500)*0.25;
				
			}else if(income<190201) {
				tax=8350*0.1+(45500-11950)*0.15+(117450-45500)*0.25+(income-117450)*0.28;
			}else if(income<372951) {
				tax=8350*0.1+(45500-11950)*0.15+(117450-45500)*0.25+(190200-117450)*0.28+(income-190200)*0.33;
			}else {
				tax=8350*0.1+(45500-11950)*0.15+(117450-45500)*0.25+(190200-117450)*0.28+(372950-190200)*0.33+(income-372950)*0.35;
				
			}
			
			
		}
		
		
	}
}
