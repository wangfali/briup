package xml;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

/*
 * ʹ��SAX����XML�ĵ�
 * 1.����ȡ���ص��Ǽ���һ���һ�㣬���ڴ���Ż��кܴ�İ���
 */
public class Demo8 {
	public static void main(String[] args) throws Exception, SAXException {
		SAXParser parser=SAXParserFactory.newInstance().newSAXParser();
		parser.parse("./src/xml/Contact.xml",new Demo10());
	}
}
