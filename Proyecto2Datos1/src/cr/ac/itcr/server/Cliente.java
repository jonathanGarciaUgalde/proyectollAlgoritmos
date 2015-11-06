package cr.ac.itcr.server;

public class Cliente {
	 public static String ip;
	 public static Conector connect;


	 public void iniciar() {
	    ip = "192.168.0.7";
	    connect = new Conector(Cliente.ip);
	    connect.start();
	    connect.enviar("conectar");
	    }

}
