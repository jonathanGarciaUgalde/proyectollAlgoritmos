package cr.ac.itcr.motorDataBase.baseDatos;

import cr.ac.itcr.structures.ListaDoble;

public class Esquema {
	public String nombre;
	public String localizacion;
	public String share_secret;
	public boolean join;
	public ListaDoble indices=new ListaDoble();
	
	
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
	
	
	public void agregarIndice(Indice nuevo_indice){
		this.indices.agregarInicio(nuevo_indice);
	}
	
	public void borrarIndice(Indice indice_a_borrar){
		this.indices.borrar(indice_a_borrar);
	}
	
}
