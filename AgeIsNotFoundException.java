public class AgeIsNotFoundException extends Exception {
	String errorMessage;

	public AgeIsNotFoundException(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	@Override
	public String toString() {
		return errorMessage;
	}
}