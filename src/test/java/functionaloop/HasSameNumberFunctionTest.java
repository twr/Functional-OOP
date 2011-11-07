package functionaloop;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class HasSameNumberFunctionTest {

	@Test
	public void sameNumber() {
		assertThat(new HasSameNumberFunction().apply(Card.of("Jd")).apply(
				Card.of("Jc")), is(true));
	}

}
