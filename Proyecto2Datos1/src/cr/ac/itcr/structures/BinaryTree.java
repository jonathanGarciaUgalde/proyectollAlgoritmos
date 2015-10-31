package cr.ac.itcr.structures;

import java.util.Random;

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
	          ArbolBinarioOrdenado abo = new ArbolBinarioOrdenado ();
	          abo.insertar(500);
	          for (int i = 0; i<=1000; i++){
	        	  Random arreglo = new Random ();
	        	  int n  = arreglo.nextInt(1001);
	        	  abo.insertar(n);
	        	  
	          }
	          System.out.println("Busqueda:");
//-----------Busqueda peor caso---------------------// 
	          long startTime2 = System.nanoTime();
	          abo.buscar(1000);
	          long finalTime2 = System.nanoTime();
			  long totalTime2 = finalTime2 - startTime2;
			  System.out.println("Peor Caso: " +totalTime2 + " nanosegundos");
//-----------Busqueda mejor caso---------------------//			  
			  long startTime = System.nanoTime();
	          abo.buscar(500);
	          long finalTime = System.nanoTime();
			  long totalTime = finalTime - startTime;
			  System.out.println("Mejor Caso: " +totalTime + " nanosegundos");
//-----------Busqueda caso promedio---------------------//				  
			  long startTime3 = System.nanoTime();
	          abo.buscar(780);
	          long finalTime3 = System.nanoTime();
			  long totalTime3 = finalTime3 - startTime3;
			  System.out.println("Caso Promedio: " +totalTime3 + " nanosegundos");
			  
			  System.out.println("Borrado:");
//-----------Borrado peor caso---------------------// 
	          long startTime4 = System.nanoTime();
	          abo.borrar(1000);
	          long finalTime4 = System.nanoTime();
			  long totalTime4 = finalTime4 - startTime4;
			  System.out.println("Peor Caso: " +totalTime4 + " nanosegundos");
//-----------Borrado mejor caso---------------------//			  
			  long startTime5 = System.nanoTime();
	          abo.borrar(780);
	          long finalTime5 = System.nanoTime();
			  long totalTime5 = finalTime5 - startTime5;
			  System.out.println("Mejor Caso: " +totalTime5 + " nanosegundos");
//-----------Borrado caso promedio---------------------//				  
			  long startTime6 = System.nanoTime();
	          abo.borrar(500);
	          long finalTime6 = System.nanoTime();
			  long totalTime6 = finalTime6 - startTime6;
			  System.out.println("Caso Promedio: " +totalTime6 + " nanosegundos");
			  
			  System.out.println("Insertar:");
//-----------Insertar peor caso---------------------// 
	          long startTime7 = System.nanoTime();
	          abo.insertar(55000);
	          long finalTime7 = System.nanoTime();
			  long totalTime7 = finalTime7 - startTime7;
			  System.out.println("Peor Caso: " +totalTime7 + " nanosegundos");
//-----------Insertar mejor caso---------------------//			  
			  long startTime8 = System.nanoTime();
	          abo.insertar(0);
	          long finalTime8 = System.nanoTime();
			  long totalTime8 = finalTime8 - startTime8;
			  System.out.println("Mejor Caso: " +totalTime8 + " nanosegundos");
//-----------Insertar caso promedio---------------------//				  
			  long startTime9 = System.nanoTime();
	          abo.insertar(780);
	          long finalTime9 = System.nanoTime();
			  long totalTime9 = finalTime9 - startTime9;
			  System.out.println("Caso Promedio: " +totalTime9 + " nanosegundos");
	          //System.out.println ("Impresion preorden: ");
	          //abo.imprimirPre ();
	          //System.out.println ("Impresion entreorden: ");
//			  long startTime = System.nanoTime();
//	          abo.borrar(500);
//	          long finalTime = System.nanoTime();
//			  long totalTime = finalTime - startTime;
//			  System.out.println(totalTime + " nanosegundos");
	          //abo.borrarMayor();
	          //System.out.println ("Impresion preorden: ");
	          //abo.imprimirPre ();
	          //abo.imprimirEntre ();
	          //System.out.println ("Impresion postorden: ");
	          //abo.imprimirPost ();        
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
