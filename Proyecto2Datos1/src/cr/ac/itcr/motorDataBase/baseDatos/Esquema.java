package cr.ac.itcr.motorDataBase.baseDatos;

import cr.ac.itcr.structures.ListaDoble;

public class Esquema {
	public String nombre;
	public String localizacion;
	public boolean join;
	public ListaDoble indices=new ListaDoble();
	
	
	/**
	 * Constructor del Esquema
	 * 
	 */
	public Esquema(String nombre, String localizacion){
		this.nombre=nombre;
		this.localizacion=localizacion;
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
