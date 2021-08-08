package projects03;

public class AreaOfPentagon {

	public static void main(String[] args) {
	
	pentagon(4.5);	

	}
	static void pentagon(double r) {
		
		double s= 2*r*Math.sin(Math.PI/5);
		
		double area=Math.round(((5*Math.pow(s, 2))/(4*Math.tan(Math.PI/5))*100))/100.0;
		System.out.println("The area of the pantegon with "+r+"0"+ " radius is "+area+" sq" );
		System.out.printf("The area of the pantegon with %.2f radius is %.2f sq",r,area );
	}
}
