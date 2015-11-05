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
	 * M�todo para comprobar si est� unido a otro esquema
	 * @return Retorna  un  tipo de dato boolean
	 * 
	 */
	public boolean isJoin(){
		return join;
	}
	
	public void agregarIndice(Indice indice){
		this.indices.agregarFinal(indice);
	}
	
	public void borrarIndice(Indice indice){
		this.indices.borrar(indice);
	}
	

	
}
