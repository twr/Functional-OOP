package functionaloop;

public class NumberOfACardFunction implements Function<String, String> {

	@Override
	public String apply(String input) {
		return String.valueOf(input.charAt(0));
	}

}
