package projects03;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		multiplicationTable();
		

	}
	static void multiplicationTable() {
		System.out.println("Multiplication Table");
		System.out.println("   -------------------------------------");
		for(int i=1;i<10;i++) {
			System.out.print(i+" | ");
			for(int j=1;j<10;j++) {
				System.out.printf("%4d",i*j);
				
			}
			System.out.println();
		}
		
	}

}
