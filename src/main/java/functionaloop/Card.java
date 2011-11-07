package functionaloop;

public class Card {

	public final String number;

	public final String suit;

	private Card(String number, String suit) {
		this.number = number;
		this.suit = suit;
	}

	public static Card of(String card) {
		return new Card(new NumberOfACardFunction().apply(card),
				new SuitOfACardFunction().apply(card));
	}

}
