package projects03;

public class QuadraticEquationSolver {
public static void main(String[] args) {
	quadratic(1,2,3);
	
	
}
static void quadratic(double a, double b, double c) { //solves a quadratic equation in the form of ax^2 + bx+ c=0.
	double discriminant=Math.round((Math.pow(b, 2)-4*a*c)*100)/100.0;
	double r1=discriminant>=0?Math.round(((-1*b+Math.pow(discriminant,0.5))/(2*a))*100)/100.0:0;//if discriminant is less than 0, it outputs 0.
	double r2=discriminant>=0?Math.round(((-1*b-Math.pow(discriminant,0.5))/(2*a))*100)/100.0:0;
	System.out.println("Discriminant : "+ discriminant);
	
	if(discriminant>0) {
		System.out.printf("has two roots. Roots are %.2f and %.2f",r1,r2);
	
	}else if(discriminant==0) {
		System.out.printf("has one root. Root is %.2f",r1);
	} else {
		System.out.println("Has no roots.");
	}
	
}
}
