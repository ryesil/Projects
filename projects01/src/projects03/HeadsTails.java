package projects03;

public class HeadsTails {
public static void main(String[] args) {
	
	headsTails("t");
	headsTails("heads");
}

static void headsTails(String flip) {
	int x = (int) (Math.random()*2);// generates 0 or 1.
	String y=x==1?"Tails":"Heads";// converts 0 to heads, 1 to tails.
	String toss=flip.equalsIgnoreCase("Heads")||flip.equalsIgnoreCase("h")?"Heads":
		flip.equalsIgnoreCase("Tails")||flip.equalsIgnoreCase("t")?"Tails":"wrong entry";// Assigns heads or tails to toss based on the users entry.
	System.out.println(y);
	System.out.println(toss);
	if(y.equals(toss)) { //decides who won the game
		System.out.println("You won");
	} else {
		System.out.println("I won");
	}
}
}
