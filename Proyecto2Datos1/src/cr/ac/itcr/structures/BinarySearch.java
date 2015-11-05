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

		 } 

}
