package xml;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
/*
 * 使用SAX解析出完整的xml文件并输出
 */
public class Demo9{
	public static void main(String[] args)throws Exception {
		SAXParser parser=SAXParserFactory.newInstance().newSAXParser();
		Demo11 hb=new Demo11();
		parser.parse("./src/xml/Contact.xml",hb);
		hb.getContext();
	}
	
	
}
