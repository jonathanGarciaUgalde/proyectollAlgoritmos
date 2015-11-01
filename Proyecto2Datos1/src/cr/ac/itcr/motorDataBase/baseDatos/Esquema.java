package cr.ac.itcr.motorDataBase.baseDatos;

public class Esquema {
	private String nombre;
	private String localizacion;
	private String share_secret;
	private boolean join;
	
	
	/**
	 * Constructor del Esquema
	 * 
	 */
	public Esquema(String nombre, String localizacion, String share_secret){
		this.nombre=nombre;
		this.localizacion=localizacion;
		this.share_secret=share_secret;	
	}
	
	/**
	 * M�todo para comprobar si est� unido a otro esquema
	 * @return Retorna  un  tipo de dato boolean
	 * 
	 */
	public boolean isJoin(){
		return join;
	}
	
	
}
