package cr.ac.itcr.motorDataBase.GUI;

import cr.ac.itcr.motorDataBase.baseDatos.Esquema;
import cr.ac.itcr.structures.ListaDoble;

public class Pruebas {

	public static void main(String[] args) {
		// Esto es solo para probar
		
		ListaDoble prueba= new ListaDoble();
		Esquema base1= new Esquema("Base1", "Mis Documentos", "kldjfdvndufh656<<<d");
		prueba.agregarFinal(base1);
		System.out.print(prueba.mostrarInicioFin()); // Aquí estoy imprimiendo los esquemas
		System.out.println();
	}
	
	

}
