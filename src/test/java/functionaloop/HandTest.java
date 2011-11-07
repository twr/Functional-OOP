package functionaloop;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class HandTest {

	private final Function<Card, Boolean> jack = new IsJackFunction();

	@Test
	public void findASuitOfAJack() {
		assertThat(handOf("Jc").find(jack).suit, is("c"));
	}

	@Test
	public void findASuitOfAJackInHand() {
		assertThat(handOf("2h 5s 5c 9d Td Jc Ks").find(jack).suit, is("c"));
	}

	@Test
	public void isThereAPair() {
		assertThat(handOf("Jc Jd").hasPair(), is(true));
	}

	@Test
	public void isThereAPairInLongHand() {
		assertThat(handOf("Qc Jc 9d Jd").hasPair(), is(true));
	}

	@Test
	public void handWithNoPair() {
		assertThat(handOf("Qc Jc").hasPair(), is(false));
	}

	@Test
	public void lookForAPairInHandWithOneCard() {
		assertThat(handOf("Qc").hasPair(), is(false));
	}

	private Hand handOf(String cards) {
		return new Hand(cards);
	}

}
