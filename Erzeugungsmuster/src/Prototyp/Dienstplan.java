package Prototyp;

import java.io.File;
import java.util.HashMap;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.*;

public class Dienstplan 
{
	HashMap<String, Urlaub> urlaubObjekte = new HashMap<String, Urlaub>(); 
	
	public Dienstplan()
	{
		try 
		{
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document xml = dBuilder.parse(new File("dienstplanobjekte.xml"));
			xml.getDocumentElement().normalize();
			
	
			NodeList urlaubNodes = xml.getElementsByTagName("urlaube").item(0).getChildNodes();
			for (int i=0; i<urlaubNodes.getLength(); i++)
			{
				Node node = urlaubNodes.item(i);
				if (node.getNodeType() == Node.ELEMENT_NODE)
				{
					Element element = (Element)node;
					Urlaub urlaub = Urlaub.erzeugeVonXML(element);
					urlaubObjekte.put(urlaub.getObjektName(), urlaub);
				}
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public Urlaub kloneUrlaubsObjekt(String key)
	{
		if (urlaubObjekte.containsKey(key))
			return urlaubObjekte.get(key).klone();
		else
			return null;
	}
}
