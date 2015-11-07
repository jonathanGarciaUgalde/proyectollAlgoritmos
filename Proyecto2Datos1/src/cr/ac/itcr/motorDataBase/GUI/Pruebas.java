package cr.ac.itcr.motorDataBase.GUI;

import org.w3c.dom.Element;

import cr.ac.itcr.motorDataBase.Logica.*;
import cr.ac.itcr.motorDataBase.baseDatos.*;
import cr.ac.itcr.structures.*;
import cr.ac.itcr.motorDataBase.GUI.interfaz;;

public class Pruebas {

	public static void main(String[] args) {
		// Esto es solo para probar 
		
		ListaDoble prueba= new ListaDoble();
		Esquema base1= new Esquema("Base1", "Mis Documentos");
		Esquema base2= new Esquema("Base2", "Mis Documentos");
		Esquema base3= new Esquema("Base3", "Mis Documentos");
		Esquema base4= new Esquema("Base4", "Mis Documentos");
		Esquema base5= new Esquema("Base5", "Mis Documentos");
		prueba.agregarFinal(base1);
		prueba.agregarFinal(base2);
		prueba.agregarFinal(base3);
		prueba.agregarFinal(base4);
		prueba.agregarFinal(base5);

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


		
		NodoArbolAVL nodo= new NodoArbolAVL("Hola");
		System.out.println(nodo.dato.getClass().getTypeName());
		
		ArbolAVL<Integer> arbol = new ArbolAVL("Nombres");
		arbol.insertar(4);
		arbol.insertar(5);
		arbol.insertar(6);
		arbol.insertar(7);
		
		System.out.print(arbol.raiz.dato);
		System.out.println();
		System.out.println();
		System.out.print(arbol.retornar_valores(arbol.raiz));
		System.out.println();
		System.out.println();
		WriteXML xml=new WriteXML();
		xml.escribirEsquema(base1);
		
		ReadXML xml2=new ReadXML();
		xml2.agregarIndice(arbol, base1);
//		
//		new interfaz();
	
	}
	
	
	
	
	
	

}
