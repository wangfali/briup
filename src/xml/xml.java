package xml;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/*
 * 使用xml解析文件
 */
public class xml {
	public static void main(String[] args) {
		/*SAXReader reader=new SAXReader();
		try {
		Document doc=reader.read(new File("./src/xml/Contact.xml"));
		@SuppressWarnings("unchecked")
		Iterator<Node> it= doc.nodeIterator();
		while(it.hasNext()){
			Node node= it.next();
			System.out.println(node.getName());
			if(node instanceof Element){
			Element	Ele=(Element)node;
			Iterator<Element> ite= Ele.elementIterator();
			while(ite.hasNext()){
				Element it2=ite.next();
				System.out.println(it2.getName());
			}
			}
		}
		} catch (DocumentException e) {
			e.printStackTrace();
		}*/
		//使用根节点的出其他子节点
		SAXReader reader=new SAXReader();
		try {
			Document doc=reader.read(new File("./src/xml/Contact.xml"));
			Element rootEle = doc.getRootElement();
			//System.out.println(rootEle.getName());
			@SuppressWarnings("unchecked")
			List<Element> eles = rootEle.elements("Contact");
			//通过3种方式遍历List集合
			for(int i=0;i<eles.size();i++){
				System.out.println(eles.get(i).getName());
				@SuppressWarnings("unchecked")
				Iterator<Element> iterator = eles.get(i).elementIterator();
				while(iterator.hasNext()){
					//System.out.println(iterator.next().getName());
					@SuppressWarnings("unchecked")
					Iterator<Attribute> attributeIterator = iterator.next().attributeIterator();
					while(attributeIterator.hasNext()){
						System.out.println(attributeIterator.next().getValue());
						
					}
				}
			}
			for(Element el :eles){
				System.out.println(el.getName());
			}
			Iterator<Element> it = eles.iterator();
			while(it.hasNext()){
				System.out.println(it.next().getName());
			}
		} catch (DocumentException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
