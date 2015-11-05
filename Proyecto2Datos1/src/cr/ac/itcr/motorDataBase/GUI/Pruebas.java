package cr.ac.itcr.motorDataBase.GUI;

import org.w3c.dom.Element;

import cr.ac.itcr.motorDataBase.Logica.*;
import cr.ac.itcr.motorDataBase.baseDatos.*;
import cr.ac.itcr.structures.*;

public class Pruebas {

	public static void main(String[] args) {
		// Esto es solo para probar 
		
		ListaDoble prueba= new ListaDoble();
		Esquema base1= new Esquema("Base1", "Mis Documentos", "kldjfdvndufh656<<<d");
		Esquema base2= new Esquema("Base2", "Mis Documentos", "kldjfdvndufh656<<<d");
		Esquema base3= new Esquema("Base3", "Mis Documentos", "kldjfdvndufh656<<<d");
		Esquema base4= new Esquema("Base4", "Mis Documentos", "kldjfdvndufh656<<<d");
		Esquema base5= new Esquema("Base5", "Mis Documentos", "kldjfdvndufh656<<<d");
		prueba.agregarFinal(base1);
		prueba.agregarFinal(base2);
		prueba.agregarFinal(base3);
		prueba.agregarFinal(base4);
		prueba.agregarFinal(base5);
		Indice Nombre=new Indice("long", 7, "Nombre");

		System.out.print(prueba.mostrarInicioFin()); // Aquí estoy imprimiendo los esquemas

		
		System.out.println();
		NodoDoble nodoIterador=(NodoDoble) prueba.inicio;
		int i=0;
		while(i!=prueba.length()){
			Esquema primer_esquema=(Esquema) nodoIterador.dato;
			System.out.println(primer_esquema.nombre);
			nodoIterador=(NodoDoble) nodoIterador.siguiente;
			i++;
			}
//		System.out.println(ultimo_esquema.nombre);
		
//		WriteXML xml=new WriteXML();
//		xml.estructurarEsquemas(prueba);
		
//		Object tipo;
//		tipo=45454;
//		System.out.println(tipo.getClass().getTypeName());
		
		NodoArbolAVL nodo= new NodoArbolAVL(3);
		System.out.println(nodo.dato.getClass());
		
		
	}
	
	
	
	

}
