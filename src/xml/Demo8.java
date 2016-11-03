package xml;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

/*
 * 使用SAX解析XML文档
 * 1.它读取的特点是加载一点读一点，对内存的优化有很大的帮助
 */
public class Demo8 {
	public static void main(String[] args) throws Exception, SAXException {
		SAXParser parser=SAXParserFactory.newInstance().newSAXParser();
		parser.parse("./src/xml/Contact.xml",new Demo10());
	}
}
