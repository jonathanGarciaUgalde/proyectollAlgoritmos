package cr.ac.itcr.motorDataBase.Logica;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

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
	
	
	public void agregarIndice(ArbolAVL indice,Esquema esquema){

        //Get the JDOM document
        try {
			Document doc = useSAXParser(esquema.localizacion+".xml");
			 //Get root element
	        Element rootElement = doc.getRootElement();
	        Element nombre_indice= new Element(indice.nombre);
	        rootElement.addContent(nombre_indice);
//	        Element nombre_Indice=rootElement.getChild(indice.nombre);
//	        nombre_Indice.addContent("Hola");
	        
	        XMLOutputter xmlOutputter = new XMLOutputter(Format.getPrettyFormat());
	        xmlOutputter.output(doc, new FileOutputStream(esquema.localizacion+".xml"));
			
			
			
			
		} catch (JDOMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static org.jdom2.Document useSAXParser(String fileName) throws JDOMException,IOException {
		SAXBuilder saxBuilder = new SAXBuilder();
		return saxBuilder.build(new File(fileName));
	}
	

}
