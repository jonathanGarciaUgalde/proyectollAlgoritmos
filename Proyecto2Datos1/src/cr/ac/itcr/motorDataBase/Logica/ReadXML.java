package cr.ac.itcr.motorDataBase.Logica;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;


public class ReadXML {
	
	
	public void borrarDato(Object dato,String nombre_indice){
		File archivo=new File("archivo.xml");
		SAXBuilder build=new SAXBuilder();
		try{
			Document doc=build.build(archivo);
			Element raiz=doc.getRootElement();
			
			List indice=raiz.getChildren(nombre_indice);
			Iterator iter=indice.iterator();
			
			while(iter.hasNext()){
				Element elemento=(Element)iter.next();
				if (elemento.equals(dato)){
					iter.remove();
				}
				
			}
		}
		catch(Exception e){
			System.out.println("No se pudo borrar el elemento");
		}
	}
	

}
