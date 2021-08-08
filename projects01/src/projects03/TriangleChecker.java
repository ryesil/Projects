package projects03;

public class TriangleChecker {

	public static void main(String[] args) {

		triangle(3.33,4.44,5.55);
		
	}

	static void triangle(double aa, double bb, double cc) {
		double side1 = (int) (aa * 100) / 100.0;
		double side2 = (int) (bb * 100) / 100.0;
		double side3 = (int) (cc * 100) / 100.0;
		double angle1 = (int) ((Math.toDegrees(
				Math.acos((Math.pow(side2, 2) + Math.pow(side3, 2) - Math.pow(side1, 2)) / (2 * side2 * side3)))) * 100)
				/ 100.0;
		double angle2 = (int) (Math.toDegrees(
				Math.acos((Math.pow(side3, 2) + Math.pow(side1, 2) - Math.pow(side2, 2)) / (2 * side1 * side3))) * 100)
				/ 100.0;
		double angle3 = (int) (Math.toDegrees(
				Math.acos((Math.pow(side2, 2) + Math.pow(side1, 2) - Math.pow(side3, 2)) / (2 * side2 * side1))) * 100)
				/ 100.0;

		boolean a = (Math.abs(side1 - side2) < side3) && (side3 < (side1 + side2));
		boolean b = (Math.abs(side2 - side3) < side1) && (side1 < (side2 + side3));
		boolean c = (Math.abs(side1 - side3) < side2) && (side2 < (side1 + side3));
		boolean d = side1 == side2;
		boolean e = side1 == side3;
		boolean f = side2 == side3;
		boolean g = angle1 > 90;
		boolean h = angle2 > 90;
		boolean k = angle3 > 90;
		boolean l = angle1 == 90;
		boolean m = angle2 == 90;
		boolean n = angle3 == 90;
		String result1 = "";
		String result2 = "";

		if (g || h || k) {
			result2 = "obtuse";
		} else if (l || m || n) {
			result2 = "right";
		} else {
			result2 = "acute";
		}

		if (a && b && c) {

			if (d && e && f) {
				result1 = String.format(
						"The given sides %.2f, %.2f, %.2f form an %s-angled equilateral triangle with angles %.2f, %.2f, %.2f.",
						side1, side2, side3, result2, angle1, angle2, angle3);
			} else if (d || e || f) {
				result1 = String.format(
						"The given sides %.2f, %.2f, %.2f form an %s-angled isoscelles triangle with angles %.2f, %.2f, %.2f.",
						side1, side2, side3, result2, angle1, angle2, angle3);
			} else {
				result1 = String.format(
						"The given sides %.2f, %.2f, %.2f form an %s-angled scalene triangle with angles %.2f, %.2f, %.2f.",
						side1, side2, side3, result2, angle1, angle2, angle3);
			}
		} else {
			result1 = String.format("The given sides %.2f, %.2f, %.2f don't form a triangle ", side1, side2, side3);
		}
		System.out.println(result1);
	}
}
