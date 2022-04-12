package mx.com.gruposalinas.constantes;

/**
 * Constantes status http.
 * 
 * @author Omar Balbuena
 *
 */
public final class HttpStatus {

	/** No contenido. */
	public static final int NO_CONTENT = 204;

	/** Recurso no encontrado. */
	public static final int NOT_FOUND = 404;

	/** OK. */
	public static final int OK = 200;

	/** OK. */
	public static final int CREATED = 201;

	/** Solicitud invalida o mal formada. */
	public static final int BAD_REQUEST = 400;

	/** Ocurrio un error desconocido. */
	public static final int UNEXPECTED_ERROR = 500;

	/**
	 * Constructor privado para evitar instancias de clase de constantes.
	 */
	private HttpStatus() {
	}

}
