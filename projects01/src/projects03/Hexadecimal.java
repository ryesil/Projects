package projects03;

public class Hexadecimal {

	public static void main(String[] args) {
	hexadecimal(1234);

	}
	static void hexadecimal(int num) {	
		String str="";
		int reminder=0;
		while(num>0) {
			reminder=num%16;
			num=num/16;
			System.out.println(reminder);
			if(reminder<10) {
				str=reminder+str;
			}else if(reminder==10) {
				str='A'+str;
			}else if(reminder==11) {
				str='B'+str;
			}else if(reminder==12) {
				str='C'+str;
			}else if(reminder==13) {
				str='D'+str;
			}else if(reminder==14) {
				str='E'+str;
			}else if(reminder==15) {
				str='F'+str;
			}
		}
		System.out.println(str);
			
		}
}
