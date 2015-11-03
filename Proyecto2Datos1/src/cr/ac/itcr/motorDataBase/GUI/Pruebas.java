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
		prueba.agregarFinal(base1);
		prueba.agregarFinal(base2);
		Indice Nombre=new Indice("long", 7, "Nombre");

		System.out.print(prueba.mostrarInicioFin()); // Aquí estoy imprimiendo los esquemas

		
		System.out.println();
		Esquema primer_esquema=(Esquema) prueba.inicio.dato;
		Esquema ultimo_esquema=(Esquema) prueba.fin.dato;
		while(primer_esquema!=ultimo_esquema){
			System.out.println(primer_esquema.nombre);
			primer_esquema=(Esquema) prueba.inicio.siguiente.dato;
			}
		System.out.println(ultimo_esquema.nombre);
		
		WriteXML xml=new WriteXML();
		xml.estructurarEsquemas(prueba);
	}
	
	

}
