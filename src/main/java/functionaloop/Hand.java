package functionaloop;

public class Hand {

	private final FunctionalList<Card> cards;

	public Hand(String string) {
		this.cards = FunctionalList.of(string.split(" ")).map(
				new Function<String, Card>() {
					@Override
					public Card apply(String input) {
						return Card.of(input);
					}
				});
	}

	public Card find(Function<Card, Boolean> function) {
		return cards.find(function);
	}

	public boolean hasPair() {
		return twoOfSameNumber(cards);
	}

	private boolean twoOfSameNumber(FunctionalList<Card> hand) {
		return hand.isEmpty() //
		? false //
				: hand.tail().find(
						new HasSameNumberFunction().apply(hand.head())) != null //
				? true //
						: twoOfSameNumber(hand.tail());
	}

}
