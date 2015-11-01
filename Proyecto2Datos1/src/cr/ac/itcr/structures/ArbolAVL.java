package cr.ac.itcr.structures;

public class ArbolAVL <T extends Comparable<T>> {
	private NodoArbolAVL<T> raiz;
	public ArbolAVL(){
		raiz=null;
	}
	
	//Método de buscar
	public NodoArbolAVL<T> buscar(T d, NodoArbolAVL<T> r){
		if (raiz==null){
			return null;
		}
		else if(r.dato==d){
			return r;
		}
		else if((r.dato.compareTo(d))<0){
			return buscar(d,r.hijoDerecho);
		}
		else{
			return buscar(d,r.hijoIzquierdo);
		}
	}
	
	//Obtener el factor de equilibrio
	public int obtenerFE(NodoArbolAVL<T> x){
		if (x==null){
			return -1;
		}
		else{
			return x.fe;
		}
	}
	
	public NodoArbolAVL<T> obtenerRaiz(){
		return raiz;
	}
	
	//Rotación simple izquierda
	public NodoArbolAVL<T> rotacionIzquierda(NodoArbolAVL<T> c){
		NodoArbolAVL<T> auxiliar = c.hijoIzquierdo;
		c.hijoIzquierdo=auxiliar.hijoDerecho;
		auxiliar.hijoDerecho=c;
		c.fe=Math.max(obtenerFE(c.hijoIzquierdo), obtenerFE(c.hijoDerecho))+1;
		auxiliar.fe=Math.max(obtenerFE(auxiliar.hijoIzquierdo), obtenerFE(auxiliar.hijoDerecho))+1;
		return auxiliar;
	}
	
	//Rotación simple derecha
		public NodoArbolAVL<T> rotacionDerecha(NodoArbolAVL<T> c){
			NodoArbolAVL<T> auxiliar = c.hijoDerecho;
			c.hijoDerecho=auxiliar.hijoIzquierdo;
			auxiliar.hijoIzquierdo=c;
			c.fe=Math.max(obtenerFE(c.hijoIzquierdo), obtenerFE(c.hijoDerecho))+1;
			auxiliar.fe=Math.max(obtenerFE(auxiliar.hijoIzquierdo), obtenerFE(auxiliar.hijoDerecho))+1;
			return auxiliar;
		}
		
	//Rotación doble derecha
		public NodoArbolAVL<T> rotacionDobleIzquierda (NodoArbolAVL<T> c){
			NodoArbolAVL<T> temporal;
			c.hijoIzquierdo = rotacionDerecha(c.hijoIzquierdo);
			temporal = rotacionIzquierda(c);
			return temporal;
		}
		
	//Rotación doble izquierda
		public NodoArbolAVL<T> rotacionDobleDerecha (NodoArbolAVL<T> c){
			NodoArbolAVL<T> temporal;
			c.hijoDerecho = rotacionIzquierda(c.hijoDerecho);
			temporal = rotacionDerecha(c);
			return temporal;
		}
	//Método para insertar AVL
		public NodoArbolAVL<T> insertarAVL(NodoArbolAVL<T> nuevo, NodoArbolAVL<T> subAr){
			NodoArbolAVL<T> nuevoPadre=subAr;
			if((nuevo.dato.compareTo(subAr.dato))<0){
				if(subAr.hijoIzquierdo==null){
					subAr.hijoIzquierdo=nuevo;
				}
				else{
					subAr.hijoIzquierdo=insertarAVL(nuevo,subAr.hijoIzquierdo);
					if((obtenerFE(subAr.hijoIzquierdo)- obtenerFE(subAr.hijoDerecho)==2)){
						if((nuevo.dato.compareTo(subAr.hijoIzquierdo.dato))<0){
							nuevoPadre=rotacionIzquierda(subAr);
						}
						else{
							nuevoPadre=rotacionDobleIzquierda(subAr);
						}
					}
				}
			}
			else if ((nuevo.dato.compareTo(subAr.dato))>0){
				if (subAr.hijoDerecho==null){
					subAr.hijoDerecho=nuevo;
				}
				else{
					subAr.hijoDerecho=insertarAVL(nuevo,subAr.hijoDerecho);
					if((obtenerFE(subAr.hijoDerecho)- obtenerFE(subAr.hijoIzquierdo)==2)){
						if((nuevo.dato.compareTo(subAr.hijoDerecho.dato))>0){
							nuevoPadre=rotacionDerecha(subAr);
						}
						else{
							nuevoPadre=rotacionDobleDerecha(subAr);
						}
					}
				}
			}
			else{
				System.out.println("Nodo duplicado");
			}
			
			//Actualizando la altura
			if ((subAr.hijoIzquierdo==null) && (subAr.hijoDerecho!=null)){
				subAr.fe=subAr.hijoDerecho.fe+1;
			}
			else if ((subAr.hijoDerecho==null) && (subAr.hijoIzquierdo!=null)){
				subAr.fe=subAr.hijoIzquierdo.fe+1;
			}
			else{
				subAr.fe=Math.max(obtenerFE(subAr.hijoIzquierdo), obtenerFE(subAr.hijoDerecho))+1;
			}
			return nuevoPadre;
		}
		
		//Método insertar 
		public void insertar (T d){
			NodoArbolAVL<T> nuevo = new NodoArbolAVL<T>(d);
			if (raiz==null){
				raiz=nuevo;
			}
			else{
				raiz=insertarAVL(nuevo,raiz);
			}
		}
		
		//Método para recorrer el árbol InOrden
		public void inOrden(NodoArbolAVL<T> r){
			if(r!=null){
				inOrden(r.hijoIzquierdo);
				System.out.println(r.dato+", ");
				inOrden(r.hijoDerecho);
			}
		}
		
		//Método para recorrer el árbol en preOrden
		public void preOrden (NodoArbolAVL<T> r){
			if (r!=null){
				System.out.println(r.dato + ", ");
				preOrden(r.hijoIzquierdo);
				preOrden(r.hijoDerecho);
			}
		}
		
		//Método para recorrer el árbol en postOrden
		public void  postOrden (NodoArbolAVL<T> r){
			if (r!=null){
				postOrden(r.hijoIzquierdo);
				postOrden(r.hijoDerecho);
				System.out.println(r.dato+", ");
			}
		}
}
