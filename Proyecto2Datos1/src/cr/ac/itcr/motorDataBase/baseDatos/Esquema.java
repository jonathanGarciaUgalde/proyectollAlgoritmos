package cr.ac.itcr.motorDataBase.baseDatos;

import cr.ac.itcr.structures.ListaDoble;

public class Esquema {
	public String nombre;
	public String localizacion;
	public String share_secret;
	public boolean join;
	
	
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
	 * Método para comprobar si está unido a otro esquema
	 * @return Retorna  un  tipo de dato boolean
	 * 
	 */
	public boolean isJoin(){
		return join;
	}
	
	
}
