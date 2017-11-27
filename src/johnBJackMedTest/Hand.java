package johnBJackMedTest;

import java.util.ArrayList;
import java.util.List;

public class Hand {
	static Hand handObj = new Hand();

	static List<String> minHand = new ArrayList<>();
	static List<String> dinHand = new ArrayList<>();

	@SuppressWarnings("static-access")
	public static List<String> draw(int kort1) {
		minHand.add(BlackJack.deckObj.deck.get(kort1));
		System.out.println("Du drog: " + BlackJack.deckObj.deck.get(kort1));
		BlackJack.number++;
		return minHand;
	}

	@SuppressWarnings("static-access")
	public static List<String> dealerDraw(int kort1) {
		dinHand.add(BlackJack.deckObj.deck.get(kort1));
		System.out.println("Dealern drog: " + BlackJack.deckObj.deck.get(kort1));
		BlackJack.number++;
		return dinHand;
	}
}
