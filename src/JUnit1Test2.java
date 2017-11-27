import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

class JUnit1Test2 {
	static JUnit1 junit;
	@BeforeAll
	static void beforeA() {
		junit = new JUnit1();
	}
	@BeforeEach
	void beforeE() {
		junit = new JUnit1();
	}
	@RepeatedTest(5)
	void metodTest() {
//		JUnit1 junit = new JUnit1();
		assertEquals(6, junit.metod(3,3), "3 + 3 = 6");
		junit.metod(2, 2);
	}

}
