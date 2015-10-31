package cr.ac.itcr.structures;

public class BinarySearch {
	public static int busquedaBinaria(int  nu[], int dato){
		  int n = nu.length;
		  int centro,inf=0,sup=n-1;
		   while(inf<=sup){
		     centro=(sup+inf)/2;
		     if(nu[centro]==dato) return centro;
		     else if(dato < nu [centro] ){
		        sup=centro-1;
		     }
		     else {
		       inf=centro+1;
		     }
		   }
		   return -1;
		   
		 }

		 public static void main(String []args){
			 int[]nu = new int [10000];
			 for (int i = 0; i < nu.length; i++){
				 nu[i]=i+1;
			 }
		  long startTime = System.nanoTime();
		  System.out.println(busquedaBinaria(nu,10000));
		  long finalTime = System.nanoTime();
		  long totalTime = finalTime - startTime;
		  System.out.println("Peor Caso: " + totalTime + " nanosegundos");
		  
//		  long startTime2 = System.nanoTime();
//		  System.out.println(busquedaBinaria(nu,250));
//		  long finalTime2 = System.nanoTime();
//		  long totalTime2 = finalTime2 - startTime2;
//		  System.out.println("Caso Promedio: " + totalTime2 + " nanosegundos");
//		  
//		  long startTime3 = System.nanoTime();
//		  System.out.println(busquedaBinaria(nu,500));
//		  long finalTime3 = System.nanoTime();
//		   long totalTime3 = finalTime3 - startTime3;
//		   System.out.println("Mejor Caso: " +totalTime3 + " nanosegundos");
		 } 

}
