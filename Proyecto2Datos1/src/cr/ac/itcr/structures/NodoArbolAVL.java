package cr.ac.itcr.structures;

public class NodoArbolAVL<T extends Comparable<T>> {
	 T dato;
	int fe;
	NodoArbolAVL<T> hijoIzquierdo,hijoDerecho;
	
	public NodoArbolAVL(T d){
		this.dato=d;
		this.fe=0;
		this.hijoIzquierdo=null;
		this.hijoDerecho=null;
	}
	
}
