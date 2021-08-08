package projects03;

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		

	}
	static void RPS() {
		Scanner in=new Scanner(System.in);
		System.out.println("Rock, Paper, Scissors");
		String str=in.next();// player makes his/her choice.
		int computerChoice=(int) (Math.random()*3); //Computer choice: 0 is for Scissors, 1 is for Rock, 2 is for Paper.
		boolean rock=str.toLowerCase().startsWith("r"); //True if player selects rock.
		boolean scissors=str.toLowerCase().startsWith("s"); //True if player selects scissors.
		boolean paper=str.toLowerCase().startsWith("p"); //True if player selects paper.
		
		String result="";
		switch(computerChoice) {
		case 0: result=rock?"Player wins":paper?"Computer wins":"draw";
		
		break;
		case 1: result=paper?"Player wins":scissors?"Computer wins":"draw";
		break;
		case 2: result=scissors?"Player wins":rock?"computer wins":"draw";
		break;
		default:
		result="Wrong entry";
		}
		System.out.println(result);
		in.close();
	}
}
