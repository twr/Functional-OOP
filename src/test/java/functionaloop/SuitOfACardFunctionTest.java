package functionaloop;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SuitOfACardFunctionTest {

	@Test
	public void getSuitOfACard() {
		assertThat(new SuitOfACardFunction().apply("Jc"), is("c"));
	}

}
