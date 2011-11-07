package functionaloop;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CardTest {

	@Test
	public void createNewInstanceFromString() {
		// given
		Card card = Card.of("Js");

		// then
		assertThat(card.number, is("J"));
		assertThat(card.suit, is("s"));
	}

}
