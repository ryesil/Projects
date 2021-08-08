package projects03;
class Timmer{
	long millisec=System.currentTimeMillis();
	int hour;
	int minute;
	int second;
	void Timmer() {
		long secThan=millisec/100;
		long minThan=secThan/60;
		int minNow=(int) (minThan%60);
		long hrsThan=minThan/60;
		long daysThan=hrsThan/24;
		
		
	}
}

public class Time {
public static void main(String[] args) {
	long millisec=System.currentTimeMillis();
	
	
	
	
}
}
