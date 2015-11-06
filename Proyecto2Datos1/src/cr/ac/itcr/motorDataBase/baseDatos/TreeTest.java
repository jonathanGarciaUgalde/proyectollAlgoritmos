package cr.ac.itcr.motorDataBase.baseDatos;
import cr.ac.itcr.structures.*;

public class TreeTest {

	public static void main(String[] args) {
		
		ArbolAVL<Integer> arbol=new ArbolAVL<Integer>();
		arbol.insertar(3);	
		arbol.insertar(4);
		System.out.println();
		arbol.preOrden(arbol.raiz);

	}

}
