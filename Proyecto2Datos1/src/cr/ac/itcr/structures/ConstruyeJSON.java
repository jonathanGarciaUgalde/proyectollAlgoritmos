/**
 *    Esta clase  consiste  en    contruir  y darle formato de tipo JSON  que se utilizar�  para que  se le envien los datos  al cliente.
 *    esta  clase se  comunica con la clase de lista doblemente  enlazada  para asignar los elemento en formato JSON  que   se crearon. 
 * 
 *
 * @author Dilan Castro Enriquez
 *
 * 
 *@since 11/09/2015
 * 
 *@version  7.0
 * 
 * 
 * */


package cr.ac.itcr.structures;

import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONException;
public class ConstruyeJSON {

	public static void main (String [] args) throws JSONException{
	
//	//Pruebas con el JSON
//	Scanner input = new Scanner(System.in);
//	System.out.print("Enter cabecera");
//	String cabecera = input.nextLine();
//	System.out.print("Enter element");
//	String name = input.nextLine();
//	
//	//Se crea un objeto JSON y se le agregan elementos
//	FabJSON json =new FabJSON();
//	json.addElement(cabecera,name);
	JSONArray array = new JSONArray();
	array.put("Hola");
	array.put("rayos");
//	json.addArray("array", array);
	int tama�o= array.length();
//	JSONArray array2  = json.getArray("array");
//	System.out.print(array2);
	ListaDoble lista = new ListaDoble();
	
	// Aqui pasa todos los elementos de un array a una lista
	ListaDoble recibe=lista.enlistar_Array(array,null); 
	System.out.print(recibe.mostrarInicioFin());

	



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/**
 * Agrega  elementos a la lista doblemente  enlaza mediante una estructura de   control llamada switch
 * 
 * 
 */
	
//	ListaDoble listita = new ListaDoble();
//	int opcion=0;
//	String elemento;
//	System.out.print("1.Agregar nodo al frente \n 2.Agregar nodo al final \n 3.Mostrar lista de inicio a fin\n "
//			+ "4.Mostrar lista de fin a inicio\n 5.Encontrar nodo \n 6.Borrar nodo");
//	
//	do{
//		try {
//			Scanner input = new Scanner(System.in);
//			opcion = input.nextInt();
//			Scanner input2 = new Scanner(System.in);
//
//			switch(opcion){
//			
//			case 1:
//				System.out.println("Inserte el elemento");
//				elemento= input2.nextLine();
//				listita.agregarInicio(elemento);
//				break;
//			case 2:
//				System.out.println("Inserte el elemento");
//				elemento= input2.nextLine();
//				listita.agregarFinal(elemento);
//				break;
//			case 3:
//				if (!listita.estaVacia()){
//					listita.mostrarInicioFin();
//					
//				}else{
//					System.out.println("No hay nodos");
//				}
//				
//				break;
//			case 4:
//				if (!listita.estaVacia()){
//					listita.mostrarFinInicio();
//					
//				}else{
//					System.out.println("No hay nodos");
//				}
//				
//	
//				break;
//			case 5:
//				if(!listita.estaVacia()){
//					System.out.println("Digite el elemento a buscar");
//					elemento=input2.nextLine();
//					String encontrado=listita.buscar(elemento);
//					System.out.println("Aqu� est�:"+encontrado);
//					
//				}else{
//					System.out.println("Est� vac�a");
//				}
//				break;
//			case 6:
//				if(!listita.estaVacia()){
//					System.out.println("Digite el elemento a borrar");
//					Scanner input3 = new Scanner(System.in);
//					elemento=input3.nextLine();
//					listita.borrar(elemento);
//					System.out.println("borrado"+elemento);
//					
//				}else{
//					System.out.println("Est� vac�a");
//				}
//				break;
//			}
//			
//			
//		} catch (NumberFormatException n) {
//			System.out.println("Error"+n.getMessage());
//		}
//	} while (opcion!=7);
//	
//	
//	}
//	
//
//	}
	}
}