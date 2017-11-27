package johnBJackMedTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class JohnTest1 { 
	static int testnr = 1;

	@BeforeAll 
	static void beforeA() {
		
		
		Deck.newDeck();	
	}
	
	@RepeatedTest(5)
	void test() {
		Hand.draw(testnr);
		assertEquals(testnr++, BlackJack.number, "Testar att number räknar upp när vi drar kort");
	
	}
	@Test
	void rtest() {
		assertFalse(BlackJack.go(), "Kollar att go() into loopar i evighet");
		assertNotNull(BlackJack.getInstance(), "Testar att vi verkligen skapar vårt BlackJack objekt");
	}
	@ParameterizedTest
	@CsvSource({"C1, 0", "D1, 1", "S1, 2", "H1, 3"})
	void testP(String x, int y) {
		List<String> list = Deck.newDeck();
		assertEquals(x, list.get(y),  "Kollar att vi skapar kort i alla färger");

	}
}
