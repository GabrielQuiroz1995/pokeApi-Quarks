package cl.forum.arq.bts.exception;

public class ResponseExceptionA extends Exception {

	private static final long serialVersionUID = 1L;
	protected final StatusResponseEnum statusResponseEnum;
	protected final boolean handled;

	/**
	 * ResponseException Respuesta generica cuando se produce una excepcion
	 * 
	 * @autor Arquitectura
	 * @param message
	 * @param responseStatusEnum
	 * @return field
	 */
	public ResponseExceptionA(String message, StatusResponseEnum responseStatusEnum) {
		super(message);
		this.statusResponseEnum = responseStatusEnum;
		this.handled = false;
	}

	/**
	 * ResponseException Respuesta controlada generica cuando se produce una
	 * excepcion
	 * 
	 * @autor Arquitectura
	 * @param message
	 * @param responseStatusEnum
	 * @param handled
	 * @return field
	 */
	public ResponseExceptionA(String message, StatusResponseEnum responseStatusEnum, boolean handled) {
		super(message);
		this.statusResponseEnum = responseStatusEnum;
		this.handled = handled;
	}

	public StatusResponseEnum getStatusResponseEnum() {
		return statusResponseEnum;
	}

	public boolean isHandled() {
		return handled;
	}

}
