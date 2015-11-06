package cr.ac.itcr.server;

//import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.DataInputStream;
//import java.io.IOException;
import java.net.Socket;


public class Conector extends  Thread {
    int puerto = 8080;
    String ip;
    Socket socket;
//    BufferedReader lector;
    DataOutputStream salida;
    DataInputStream puente;


    public Conector(String ip){
        this.ip = ip;
    }

    public void run(){
        String texto;
        try{
            socket = new Socket(this.ip, puerto); // conexion

            puente = new DataInputStream(socket.getInputStream()); //codificar lo que manda el server
            //lector = new BufferedReader(puente); //para guardar ya lo que mandó
            //----- Escuchar
            salida = new DataOutputStream(socket.getOutputStream());//Codificar lo que va a mandar

            while(true){ //listener
                try {
                    texto = puente.readUTF();
                    if (texto!=null) {
                    	salida.writeUTF(texto);
                    	System.out.println(texto);
                        //Cliente.caja.setText(Cliente.caja.getText() + "\n" + texto);

                    }
                    else{
                    	System.out.println("SERVER: " + texto);
                        }

                }catch(Exception e){};
            }
        }catch(Exception e){};
    }

    public void enviar(String msg){
        while (msg!=null)
            try {
                salida.writeUTF(msg + "\n");
                break;
            }catch (Exception e){};
    }
}
