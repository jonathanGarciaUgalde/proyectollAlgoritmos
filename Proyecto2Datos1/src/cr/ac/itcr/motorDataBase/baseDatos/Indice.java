package cr.ac.itcr.motorDataBase.baseDatos;

public class Indice {
	public Object tipo;
	public int largo;

	public Indice(String tipo, int largo){
		this.largo=largo;
		if(tipo.compareTo("String")==0){
			this.tipo=tipo;
		}else if(tipo.compareTo("int")==0){
			int tipo_int=Integer.parseInt(tipo);
			this.tipo=tipo_int;
		}
		
	}
	
}
