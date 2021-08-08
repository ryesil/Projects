package projects03;

public class Plate {

	public static void main(String[] args) {
		
plateMaker();
	}

	static void plateMaker() {
		char let1= (char)((int)('A'+Math.random()*(1+'Z'-'A')));
		char let2= (char)((int)('A'+Math.random()*(1+'Z'-'A')));
		char let3= (char)((int)('A'+Math.random()*(1+'Z'-'A')));
		int dit1=(int)(Math.random()*10);
		int dit2=(int)(Math.random()*10);
		int dit3=(int)(Math.random()*10);
		int dit4=(int)(Math.random()*10);
		String platee=String.format("%c%c%c%d%d%d%d",let1,let2,let3,dit1,dit2,dit3,dit4);
		System.out.println(platee);
	}
}

