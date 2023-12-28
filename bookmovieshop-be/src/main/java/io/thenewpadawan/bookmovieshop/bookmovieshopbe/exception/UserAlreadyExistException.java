package io.thenewpadawan.bookmovieshop.bookmovieshopbe.exception;

public class UserAlreadyExistException extends Exception {
	public UserAlreadyExistException() {
		super("The email address is alredy assigned to an other user");
	}
}
