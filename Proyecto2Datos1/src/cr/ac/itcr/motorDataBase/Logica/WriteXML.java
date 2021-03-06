package cr.ac.itcr.motorDataBase.Logica;

import java.io.File;

import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import cr.ac.itcr.motorDataBase.baseDatos.Esquema;
import cr.ac.itcr.structures.*;

import org.w3c.dom.*;

public class WriteXML {

//	public static void main(String argv[]) {
//
//		  try {
//
//			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
//			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
//
//			// root elements
//			Document doc = docBuilder.newDocument();
//			Element rootElement = doc.createElement("company");
//			doc.appendChild(rootElement);
//
//			// staff elements
//			Element staff = doc.createElement("Staff");
//			rootElement.appendChild(staff);
//
//			// set attribute to staff element
//			Attr attr = doc.createAttribute("id");
//			attr.setValue("1");
//			staff.setAttributeNode(attr);
//
//			// shorten way
//			// staff.setAttribute("id", "1");
//
//			// firstname elements
//			Element firstname = doc.createElement("firstname");
//			firstname.appendChild(doc.createTextNode("yong"));
//			staff.appendChild(firstname);
//
//			// lastname elements
//			Element lastname = doc.createElement("lastname");
//			lastname.appendChild(doc.createTextNode("mook kim"));
//			staff.appendChild(lastname);
//
//			// nickname elements
//			Element nickname = doc.createElement("nickname");
//			nickname.appendChild(doc.createTextNode("mkyong"));
//			staff.appendChild(nickname);
//
//			// salary elements
//			Element salary = doc.createElement("salary");
//			salary.appendChild(doc.createTextNode("100000"));
//			staff.appendChild(salary);
//
//			// write the content into xml file
//			TransformerFactory transformerFactory = TransformerFactory.newInstance();
//			Transformer transformer = transformerFactory.newTransformer();
//			DOMSource source = new DOMSource(doc);
//			StreamResult result = new StreamResult(new File("file.xml"));
//
//			// Output to console for testing
//			// StreamResult result = new StreamResult(System.out);
//
//			transformer.transform(source, result);
//
//			System.out.println("File saved!");
//
//		  } catch (ParserConfigurationException pce) {
//			pce.printStackTrace();
//		  } catch (TransformerException tfe) {
//			tfe.printStackTrace();
//		  }
//		  
//		}
	public  void estructurarEsquemas(ListaDoble esquemas){
		try {
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			Document doc = docBuilder.newDocument();
			
			Element rootElement = doc.createElement("esquemas");
			doc.appendChild(rootElement);
			
			NodoDoble nodoIterador=(NodoDoble) esquemas.inicio;
			int i=0;
			
			while(i!=esquemas.length()){
			Esquema primer_esquema=(Esquema) nodoIterador.dato;
			Element esquema = doc.createElement(primer_esquema.nombre);
			rootElement.appendChild(esquema);
			nodoIterador=(NodoDoble) nodoIterador.siguiente;
			i++;
			}

			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File("prueba.xml"));

			// Output to console for testing
			// StreamResult result = new StreamResult(System.out);

			transformer.transform(source, result);

			System.out.println("File saved!");
			
			
			
		} catch (ParserConfigurationException pce) {
		  pce.printStackTrace();
		} catch (TransformerException tfe) {
		  tfe.printStackTrace();
		}
	}
	
	public  void escribirEsquema(Esquema esquema){
		try {
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			Document doc = docBuilder.newDocument();
			
			Element rootElement = doc.createElement(esquema.nombre);
			doc.appendChild(rootElement);

			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File(esquema.localizacion+".xml"));

			// Output to console for testing
			// StreamResult result = new StreamResult(System.out);

			transformer.transform(source, result);

			System.out.println("File saved!");	
			
		} catch (ParserConfigurationException pce) {
		  pce.printStackTrace();
		} catch (TransformerException tfe) {
		  tfe.printStackTrace();
		}
	}
	
	
	
	
	
	
	
}
