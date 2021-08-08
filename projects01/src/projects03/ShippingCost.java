package projects03;

public class ShippingCost {
public static void main(String[] args) {
	cost(50);
	cost(50.1);
}
static void cost(double weight) {
	double cost=0;
	String warning="";
	if(weight>0&&weight<=1) {
		cost=3.5;
	}else if(weight>1&&weight<=3) {
		cost=5.5;
	}else if(weight>3&&weight<=10) {
		cost=8.5;
	}else if(weight>10&&weight<=20) {
		cost=10.5;
	}else if(weight>20&&weight<=50) {
		double weight2=weight%20;
		double cost1=0;
		if(weight2>0&&weight2<=1) {
			cost1=3.5;
		}else if(weight2>1&&weight2<=3) {
			cost1=5.5;
		}else if(weight2>3&&weight2<=10) {
			cost1=8.5;
		}else if(weight2>10&&weight2<=20) {
			cost1=10.5;
		}
		cost= (int)(weight/20)*10.5+cost1;
	}else {
		warning="It cannot be shipped";
	}
	System.out.println(weight<=50?"$"+cost+"0":warning);

	
}
}
