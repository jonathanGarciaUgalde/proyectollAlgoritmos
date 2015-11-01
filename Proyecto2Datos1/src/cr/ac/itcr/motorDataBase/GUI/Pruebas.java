package cr.ac.itcr.motorDataBase.GUI;

import cr.ac.itcr.motorDataBase.baseDatos.Esquema;
import cr.ac.itcr.structures.ListaDoble;

public class Pruebas {

	public static void main(String[] args) {
		// Esto es solo para probar
		
		ListaDoble prueba= new ListaDoble();
		Esquema base1= new Esquema("Base1", "Mis Documentos", "kldjfdvndufh656<<<d");
		base1.indices.agregarFinal("Hola");
		prueba.agregarFinal(base1);
		System.out.print(prueba.mostrarInicioFin()); // Aquí estoy imprimiendo los esquemas
		System.out.println();
		System.out.print(base1.indices.mostrarFinInicio()); // Aquí estoy imprimiendo la lista de índices que tiene el esquema
	}
	
	

}
