package functionaloop;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class NumberOfACardFunctionTest {

	@Test
	public void getSuitOfACard() {
		assertThat(new NumberOfACardFunction().apply("Jc"), is("J"));
	}

}
