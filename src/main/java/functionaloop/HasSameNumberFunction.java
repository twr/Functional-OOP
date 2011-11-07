package functionaloop;

public class HasSameNumberFunction implements
		Function<Card, Function<Card, Boolean>> {

	@Override
	public Function<Card, Boolean> apply(final Card firstCard) {
		return new Function<Card, Boolean>() {
			
			@Override
			public Boolean apply(Card secondCard) {
				return firstCard.number.equals(secondCard.number);
			}
			
		};
	}

}
