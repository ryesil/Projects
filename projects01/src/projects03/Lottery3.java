package projects03;

public class Lottery3 {

	public static void main(String[] args) {
		lottery1(234);
lottery1(222);
	}
	static void lottery1(int num) {// took me all day. 
		int random=(int) (Math.random()*1000);
		StringBuffer random1=new StringBuffer(String.format("%03d",Integer.toString(random,8).length()<3?Integer.parseInt(Integer.toString(random,8)):random));
		String random2=random1.toString();
		StringBuffer num1=new StringBuffer(String.format("%03d", Integer.toString(num,8).length()<3?Integer.parseInt(Integer.toString(num,8)):num));
		String num2=num1.toString();
//		char[] random1=String.format("%03d",21).toCharArray();
//		char[] num1=String.format("%03d", num).toCharArray();
		char[] store= {'a','a','a'};

		int suprise=0;
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(random1.charAt(i)==num1.charAt(j)) {
					store[i]=num1.charAt(j);
					num1.replace(j, j+1,"b");
					random1.replace(i,i+1,"c");
				}	
			}
			
		}
		String finale =(""+store[0]+store[1]+store[2]).replaceAll("[a]","");
		if((""+store[0]+store[1]+store[2]).equals(num2)){
			suprise=10000;
		}else if (finale.length()==3) {
			suprise=3000;
		}else if(finale.length()>0) {
			suprise=1000;
		}else {
			suprise=0;
		}
		System.out.println("The big suprise is "+"$"+suprise);
//		System.out.println((""+store[0]+store[1]+store[2]).equals(num2));
//		System.out.println(""+store[0]+store[1]+store[2]);
//		System.out.println(random1); 
//		System.out.println(random2);
//		System.out.println(num1);
//		System.out.println(num2);
		
	}
}
