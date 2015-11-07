package cr.ac.itcr.motorDataBase.Logica;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import cr.ac.itcr.motorDataBase.baseDatos.Esquema;
import cr.ac.itcr.structures.*;


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
	
	
//	public void agregarIndice(ArbolAVL indice,Esquema esquema){
//		//Se crea un SAXBuilder para poder parsear el archivo
//				SAXBuilder builder = new SAXBuilder();
//				File xmlFile = new File( esquema.localizacion );
//				if( xmlFile.exists() )
//				{
//					try
//					{
//						//Se crea el documento a traves del archivo
//						Document document = (Document) builder.build( xmlFile );
//						
//						//Se obtiene la raiz 
//						Element rootNode = document.getRootElement();
//						
//						
//					}
//					
//				}
//	}
	

}
