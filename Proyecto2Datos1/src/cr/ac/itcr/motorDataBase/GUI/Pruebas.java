package cr.ac.itcr.motorDataBase.GUI;

import cr.ac.itcr.motorDataBase.baseDatos.Esquema;
import cr.ac.itcr.motorDataBase.baseDatos.Indice;
import cr.ac.itcr.structures.*;

public class Pruebas {

	public static void main(String[] args) {
		// Esto es solo para probar
		
		ListaDoble prueba= new ListaDoble();
		Esquema base1= new Esquema("Base1", "Mis Documentos", "kldjfdvndufh656<<<d");
		prueba.agregarFinal(base1);
		Indice Nombre=new Indice("long", 7, "Nombre");
		System.out.print(prueba.mostrarInicioFin()); // Aquí estoy imprimiendo los esquemas
		System.out.println();
		base1.agregarIndice(Nombre);
		System.out.print(base1.indices.mostrarInicioFin());
		System.out.println();
		base1.borrarIndice(Nombre);
		System.out.print(base1.indices.mostrarInicioFin());
		System.out.println();
		System.out.println(Nombre.nombre);
	}
	
	

}
