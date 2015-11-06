package cr.ac.itcr.motorDataBase.baseDatos;

import cr.ac.itcr.structures.*;


public class Indice {
	public Object tipo;
	public int largo;
	public String nombre;
	public ListaDoble padres;
	
	/**
	 * Constructor del Indice
	 * 
	 */
	public Indice(Object tipo, int largo,String nombre_del_indice){
		this.largo=largo;
		this.tipo=tipo;
		this.nombre=nombre_del_indice;
	}
	
	
	public void agregarEsquema(Esquema padre_esquema){
		this.padres.agregarFinal(padre_esquema);
	}
	
	
	
}
