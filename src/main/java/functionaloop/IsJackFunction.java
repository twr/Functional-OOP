package functionaloop;

public final class IsJackFunction implements Function<Card, Boolean> {

	@Override
	public Boolean apply(Card input) {
		return new HasSameNumberFunction().apply(Card.of("J*")).apply(input);
	}

}