package cr.ac.itcr.structures;

public class BinaryTree {

	
	public static class ArbolBinarioOrdenado {
	    class Nodo
	      {
	        int info;
	        Nodo izq, der;
	      }
	      Nodo raiz;

	      public ArbolBinarioOrdenado() {
	          raiz=null;
	      }
	      
	      public void insertar (int info)
	      {
	          Nodo nuevo;
	          nuevo = new Nodo ();
	          nuevo.info = info;
	          nuevo.izq = null;
	          nuevo.der = null;
	          if (raiz == null)
	              raiz = nuevo;
	          else
	          {
	              Nodo anterior = null, reco;
	              reco = raiz;
	              while (reco != null)
	              {
	                  anterior = reco;
	                  if (info < reco.info)
	                      reco = reco.izq;
	                  else
	                      reco = reco.der;
	              }
	              if (info < anterior.info)
	                  anterior.izq = nuevo;
	              else
	                  anterior.der = nuevo;
	          }
	      }


	      private void imprimirPre (Nodo reco)
	      {
	          if (reco != null)
	          {
	              System.out.print(reco.info + " ");
	              imprimirPre (reco.izq);
	              imprimirPre (reco.der);
	          }
	      }

	      public void imprimirPre ()
	      {
	          imprimirPre (raiz);
	          System.out.println();
	      }

	      private void imprimirEntre (Nodo reco)
	      {
	          if (reco != null)
	          {    
	              imprimirEntre (reco.izq);
	              System.out.print(reco.info + " ");
	              imprimirEntre (reco.der);
	          }
	      }

	      public void imprimirEntre ()
	      {
	          imprimirEntre (raiz);
	          System.out.println();
	      }


	      private void imprimirPost (Nodo reco)
	      {
	          if (reco != null)
	          {
	              imprimirPost (reco.izq);
	              imprimirPost (reco.der);
	              System.out.print(reco.info + " ");
	          }
	      }


	      public void imprimirPost ()
	      {
	          imprimirPost (raiz);
	         
	      }

	      public static void main (String [] ar)
	      {
      
	      }      
	      public void borrarMenor() {
	          if (raiz!=null) {
	              if (raiz.izq==null)
	                  raiz=raiz.der;
	              else {
	                  Nodo atras=raiz;
	                  Nodo reco=raiz.izq;
	                  while (reco.izq!=null) {
	                      atras=reco;
	                      reco=reco.izq;
	                  }
	                  atras.izq=reco.der;
	              }                  
	          }
	      }
	      public void borrarMayor() {
	          if (raiz!=null) {
	              if (raiz.der==null)
	                  raiz=raiz.der;
	              else {
	                  Nodo atras=raiz;
	                  Nodo reco=raiz.der;
	                  while (reco.der!=null) {
	                      atras=reco;
	                      reco=reco.der;
	                  }
	                  atras.der=reco.der;
	              }                  
	          }
	      }
	      public boolean borrar(int valor) {
	    	  Nodo auxiliar = raiz;
	    	  Nodo padre = raiz;
	    	  boolean esHijoIzq = true;
	    	  while(auxiliar.info!=valor){
	    		  padre=auxiliar;
	    		  if (valor<auxiliar.info){
	    			  esHijoIzq=true;
	    			  auxiliar=auxiliar.izq;
	    		  }else{
	    			  esHijoIzq=false;
	    			  auxiliar=auxiliar.der;
	    		  }
	    		  if (auxiliar==null){
	    			  return false;
	    		  }  
	    	  }//Fin del while
	    	  if (auxiliar.izq==null && auxiliar.der==null){
	    		  if (auxiliar==raiz){
	    			  raiz=null;
	    			  
	    		  }else if(esHijoIzq){
	    			  padre.izq=null;
	    			  
	    		  }else{
	    			  padre.der=null;
	    		  }
	    	  }else if(auxiliar.der==null){
	    		  if (auxiliar==raiz){
	    			  raiz=auxiliar.izq;
	    			  
	    		  }else if(esHijoIzq){
	    			  padre.izq=auxiliar.izq;
	    			  
	    		  }else{
	    			  padre.der=auxiliar.izq;
	    		  }
	    	  }else if(auxiliar.izq==null){
	    		  if (auxiliar==raiz){
	    			  raiz=auxiliar.der;
	    			  
	    		  }else if(esHijoIzq){
	    			  padre.izq=auxiliar.der;
	    			  
	    		  }else{
	    			  padre.der=auxiliar.izq;
	    		  }
	    	  }else{
	    		  Nodo reemplazo=obtenerNodoReemplazo(auxiliar);
	    		  if (auxiliar==raiz){
	    			  raiz=reemplazo;
	    		  }else if(esHijoIzq){
	    			  padre.izq=reemplazo;
	    		  }else{
	    			  padre.der=reemplazo;
	    		  }
	    		  reemplazo.izq=auxiliar.izq;
	    	  }
	    	  return true;
	    }
	    //Metodo encargado de delvolvernos el nodo Reemplazo
	    public Nodo obtenerNodoReemplazo (Nodo nodoReemp){
	    	Nodo reemplazarPadre=nodoReemp;
	    	Nodo reemplazo=nodoReemp;
	    	Nodo auxiliar=nodoReemp.der;
	    	while(auxiliar!=null){
	    		reemplazarPadre=reemplazo;
	    		reemplazo=auxiliar;
	    		auxiliar=auxiliar.izq;
	    	}
	    	if (reemplazo!=nodoReemp.der){
	    		reemplazarPadre.izq=reemplazo.der;
	    		reemplazo.der=nodoReemp.der;
	    	}
	    	return reemplazo;
	    			
	    }
	  public void buscar(int valor){
		  Nodo temp = raiz;
		  if (valor==raiz.info){
			  //System.out.println("El nodo es la Raiz: " + raiz.info);
		  }else{
			  while (temp!=null){
				  if (temp.info==valor){
					  //System.out.println("El nodo es: " + temp.info);
					  break;
				  }else if(temp.info>valor){
					  temp=temp.izq;
				  }else{
					  temp=temp.der;
				  }
			  }
		  }
	  }
	      
	      
	}

}
