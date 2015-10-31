package cr.ac.itcr.structures;

public class NodoDoble {
	public Object dato;
	NodoDoble siguiente,anterior;
	
	//Constructor para cuando aun no hay nodos
	public NodoDoble(Object ele){
		this(ele,null,null);
	}
	
	//Constructor para cuando ya hay nodos
	public NodoDoble(Object ele, NodoDoble sig, NodoDoble ant) {
		dato=ele;
		siguiente=sig;
		anterior=ant;
	}
	
}