package xml;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
/*
 * ʹ��SAX������������xml�ļ������
 */
public class Demo9{
	public static void main(String[] args)throws Exception {
		SAXParser parser=SAXParserFactory.newInstance().newSAXParser();
		Demo11 hb=new Demo11();
		parser.parse("./src/xml/Contact.xml",hb);
		hb.getContext();
	}
	
	
}
