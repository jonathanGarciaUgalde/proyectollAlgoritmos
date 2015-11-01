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
		}else if(tipo.compareTo("float")==0){
			float tipo_float=Float.parseFloat(tipo);
			this.tipo=tipo_float;	
		}else if(tipo.compareTo("long")==0){
			long tipo_long=Long.parseLong(tipo);
			this.tipo=tipo_long;
		}else if(tipo.compareTo("double")==0){
			double tipo_double=Double.parseDouble(tipo);
			this.tipo=tipo_double;	
		}
	}
	
}
