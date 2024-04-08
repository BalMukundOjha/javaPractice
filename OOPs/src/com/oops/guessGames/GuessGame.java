package com.oops.guessGames;

public class GuessGame {
	
	Players p1;
	Players p2;
	Players p3;
	
	public void startGame() {
		
		p1 = new Players();
		p2 = new Players();
		p3 = new Players();
		
		int guess1 = 0;
		int guess2 = 0;
		int guess3 = 0;
		
		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;
		
		int tragetNumber = (int) (Math.random() * 10);
		System.out.println("Iam thinking of number between 0 to 9...");
		
		
		while(true) {
			System.out.println("Number to guess it "+tragetNumber);
			p1.guess();
			p2.guess();
			p3.guess();
			
			guess1 = p1.number;
			System.out.println("Player1 is gussed "+guess1);
			guess2 = p2.number;
			System.out.println("Player2 is gussed "+guess2);
			guess3 = p3.number;
			System.out.println("Player3 is gussed "+guess3);
			
			if(guess1 == tragetNumber) {
				p1isRight = true;
			}
			if(guess2 == tragetNumber) {
				p2isRight = true;
			}
			if(guess3 == tragetNumber) {
				p3isRight = true;
			}
			
			if(p1isRight || p2isRight || p3isRight) {
				
				System.out.println("We have a Winner");
				System.out.println("Player one got it right ? "+p1isRight);
				System.out.println("Player two got it right ? "+p2isRight);
				System.out.println("Player three got it right ?"+p3isRight);
				System.out.println("Game Over");
				break;
			}else {
				System.out.println("Player will have to try again");
			}
		}
	}
}
