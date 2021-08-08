package projects03;

public class ThreePointsOnCircle {
public static void main(String[] args) {
	
	threePointsOnCircle();
	
}

	static void threePointsOnCircle() {
		double r=40;
		double degree=Math.round(1+Math.random()*89);
		double angle1=Math.round(Math.toRadians(degree));
		double degree2=Math.round(degree+Math.random()*(90-degree));
		double angle2=Math.round(Math.toRadians(degree2));
		double degree3=180-(degree+degree2);
		double angle3=Math.round(Math.toRadians(degree3));
		double xCor1=40*Math.cos(angle1);
		double yCor1=40*Math.sin(angle1);
		double xCor2=40*Math.cos(angle2);
		double yCor2=40*Math.sin(angle2);
		double xCor3=40*Math.cos(angle3);
		double yCor3=40*Math.sin(angle3);

		System.out.printf("Three points of a triangle that are on a circle with %.0f radius are (%.0f,%.0f), (%.0f,%.0f), (%.0f,%.0f)",r,xCor1,yCor1,xCor2,yCor2,xCor3,yCor3);
		
	}

}
