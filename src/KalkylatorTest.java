import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class KalkylatorTest {
	@Test
	void testAdd() {
		Kalkylator kalkylator = new Kalkylator();
		assertEquals(4, kalkylator.Add(2,2), "2+2 =4");
		kalkylator.Add(2,2);
	}

}
