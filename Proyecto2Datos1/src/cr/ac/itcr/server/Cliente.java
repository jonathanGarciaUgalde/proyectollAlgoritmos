package cr.ac.itcr.server;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;


public class Cliente extends  Thread {
    int puerto = 8080;
    String ip;
    Socket socket;
    BufferedReader lector;
    DataOutputStream salida;
    DataInputStream puente;


    public Cliente(String ip){
        this.ip = ip;
    }

    public void run(){
        String texto;
        try{
            socket = new Socket(this.ip, puerto); // conexion

            puente = new DataInputStream(socket.getInputStream()); //codificar lo que manda el server
            //lector = new BufferedReader(puente); //para guardar ya lo que mandó la mica esa
            //----- Escuchar
            salida = new DataOutputStream(socket.getOutputStream());//Codificar lo que va a mandar
            //salida.writeUTF("Hello");

            while(true){ //listener
                try {
                    texto = puente.readUTF();
                    if (texto!=null && cliente.verificador != 1) {
                        cliente.caja.setText(cliente.caja.getText() + "\n" + texto);

                    }
                    else{
                        Chat_Activity.arrayList.add("Server: \n" + texto);
                        Chat_Activity.adapter.notifyDataSetChanged();
                        Chat_Activity.listView.setSelection(Chat_Activity.listView.getAdapter().getCount() - 1);
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
