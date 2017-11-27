package johnBJackMedTest;


import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class BlackJack {
	static int number = 0;
	static Deck deckObj = new Deck();
	static boolean stand = true;

	private BlackJack() {
	}

	private static BlackJack instance = new BlackJack();

	public static BlackJack getInstance() {
		if (instance == null) {
			synchronized (BlackJack.class) {
				if (instance == null) {
					instance = new BlackJack();
				}
			}
		}
		return instance;
	}

	public void init() {

		Deck.newDeck();
		deckObj.shuffle();

		Hand.draw(number);
		Hand.draw(number);
		System.out.println("Dina kort är " + Hand.minHand);
		System.out.println("Din totala poäng är " + points(Hand.minHand) + ".");

		go();
	
	}

	public static void input() {
		int p = 0;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Vad vill du göra?\n1. Hit 2. Stand");
			p = scan.nextInt();
		} catch (InputMismatchException e) {

		}

		switch (p) {
		case 1:
			Hand.draw(number);

			break;
		case 2:
			System.out.println("Stand");
			stand = false;
			dealer();

			break;
		default:
			System.out.println("Felaktigt val");
			input();
		}

		
	}

	public static int points(List<String> giv) {
		int total = 0;
		for (int i = 0; i < giv.size(); i++) {
			String p = giv.get(i);
			p = p.substring(1);
			int q = Integer.parseInt(p);

			if (q > 10) {
				q = 10;
			} else if (q == 1) {
				q = 11;
			}
			total += q;
		}

		return total;

	}

	public static boolean go() {
		while (stand) {
			if (points(Hand.minHand) > 21) {
				System.out.println("Du är tjock. Dealern Vinner");
				stand = false;

			} else if (points(Hand.minHand) == 21) {

				System.out.println("Du fick 21!");
				dealer();
				break;
			} else {
				input();
				System.out.println("Din totala poäng är " + points(Hand.minHand) + ".");

			}

		}
		return stand;
	}

	public static void dealer() {
		while (points(Hand.dinHand) < 17) {
			Hand.dealerDraw(number);
		}
		if (points(Hand.minHand) <= points(Hand.dinHand) && points(Hand.dinHand) < 22) {
			System.out.println("Dealern fick " + points(Hand.dinHand) + " poäng och du fick " + points(Hand.minHand)
					+ " poäng. Dealern vann.");
		} else {
			System.out.println("Dealern fick " + points(Hand.dinHand) + " poäng och du fick " + points(Hand.minHand)
					+ " poäng. Du vann.");
		}
	}

}
