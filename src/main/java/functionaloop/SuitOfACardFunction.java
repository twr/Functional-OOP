package functionaloop;

public class SuitOfACardFunction implements Function<String, String> {

	@Override
	public String apply(String input) {
		return String.valueOf(input.charAt(1));
	}

}
