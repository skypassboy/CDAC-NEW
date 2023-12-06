package customexceptions;

public class InvalidUsernameException extends Exception {
	
	private String msg;
	
	public InvalidUsernameException() {
		msg = "Can only have alphabets,numbers,dot and underscore character";
	}

	@Override
	public String getMessage() {
		return msg;
	}

	@Override
	public String toString() {
		return "InvalidUsernameException : "+msg;	
	}
	
	

}
