package cr.ac.itcr.motorDataBase.baseDatos;

import java.util.Arrays;

import org.apache.commons.codec.binary.Base64;

public class MainBase64 {
	
	public static void main(String[] args){
		
		//String para codificar
		String holaMundo = "Hola Mundo";
		
		//Codificando se usa getBytes
		
		holaMundo = Base64.encodeBase64String(holaMundo.getBytes());
		
		System.out.println("Codificado: " + holaMundo);
		
		//Decodificando devolvera un arreglo de bytes, cada posicion en la que se encuentra
		
		byte[] decodificado = Base64.decodeBase64(holaMundo);
		
		System.out.println("Decodificado en bytes: " + Arrays.toString(decodificado));
		
		//Convirtiendo de nuevo a String
		
		String decodificacion = new String(decodificado);
		
		System.out.println("Decodificado a String: " + decodificacion);
	}

}
