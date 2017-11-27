package johnBJackMedTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	static List<String> deck = new ArrayList<>();
	
	
		public static List<String> newDeck() {
			Suit suit = Suit.C;
			
			for(int i = 1; i <= 13; i++) {
				for(int j = 0; j < 4; j++) {
					if(j==0) {
						suit = Suit.C;
					}
					if(j==1) {
						suit = Suit.D;
					}
					if(j==2) {
						suit = Suit.S;
					}
					if(j==3) {
						suit = Suit.H;
					}
					String combo = suit + "" + i;
					deck.add(combo);
				}
			}
				    					
					return deck;
				}
	public Deck() {
		
	}



	public void shuffle() {
		Collections.shuffle(deck);
	}

}
