package xml;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.Text;
import org.dom4j.io.SAXReader;

/*
 * @author wfl
 */
public class exercise {
	public static void main(String[] args) {
		SAXReader reader=new SAXReader();//应用Dom4j
		try {
			Document doc = reader.read(new File("./src/xml/Contact.xml"));//读取Dom对象
			Element rootElem = doc.getRootElement();//找到根标签
			StringBuilder sb=new StringBuilder();//创建创建字符串缓冲数组
			getChildNode(rootElem, sb);//调用方法
			System.out.println(sb.toString());//打印出字符串缓冲数组
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		
	}
	private static void getChildNode(Element elem,StringBuilder sb){
		//开始标签
		sb.append("<"+elem.getName());//添加开始标签
		//得到标签的属性列表
		@SuppressWarnings("unchecked")
		List<Attribute> atts = elem.attributes();//读取出根标签的属性，使用泛型
		if(atts!=null){//判断是否有属性
			for(Attribute at:atts){//增强for循环
				sb.append(" "+at.getName()+"=\""+at.getValue()+"\"");//将遍历出来的属性添加进字符串数组
			}
		}
		sb.append(">");//将末尾的标记添加进入字符串数组
		//得到文本
		@SuppressWarnings("unchecked")
		Iterator<Node> nodeIterator = elem.nodeIterator();//通过根节点找出子结点
		while(nodeIterator.hasNext()){//使用循环将将结点输出
			Node node=nodeIterator.next();//得到一个子结点
			if(node instanceof Element){//判段该结点是不是标签
				Element ele=(Element)node;//如果是标签则将标签转换
				getChildNode(ele, sb);//使用递归的方法
			}
			if(node instanceof Text){//判端该结点是否为文本标签
				Text text=(Text)node;//将结点转化为文本标签
				sb.append(text.getText());//将文本内容加入字符串数组当中
			}
		}
		sb.append("</"+elem.getName()+">");//添加结束标签
	}
}
