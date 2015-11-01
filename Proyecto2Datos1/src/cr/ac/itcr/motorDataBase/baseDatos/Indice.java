package cr.ac.itcr.motorDataBase.baseDatos;

import cr.ac.itcr.structures.*;


public class Indice {
	public Object tipo;
	public int largo;
	public String nombre;
	
	/**
	 * Constructor del Indice
	 * 
	 */
	public Indice(Object tipo, int largo,String nombre_del_indice){
		this.largo=largo;
		this.tipo=tipo;
		this.nombre=nombre_del_indice;
	}
	
	
	
	
	
	
}
