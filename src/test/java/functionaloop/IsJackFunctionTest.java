package functionaloop;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class IsJackFunctionTest {

	@Test
	public void shouldTellIfItIsAJack() {
		assertThat(new IsJackFunction().apply(Card.of("Js")), is(true));
	}

	@Test
	public void shouldTellIfItIsNotAJack() {
		assertThat(new IsJackFunction().apply(Card.of("Qs")), is(false));
	}

}
