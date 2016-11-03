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
		SAXReader reader=new SAXReader();//Ӧ��Dom4j
		try {
			Document doc = reader.read(new File("./src/xml/Contact.xml"));//��ȡDom����
			Element rootElem = doc.getRootElement();//�ҵ�����ǩ
			StringBuilder sb=new StringBuilder();//���������ַ�����������
			getChildNode(rootElem, sb);//���÷���
			System.out.println(sb.toString());//��ӡ���ַ�����������
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		
	}
	private static void getChildNode(Element elem,StringBuilder sb){
		//��ʼ��ǩ
		sb.append("<"+elem.getName());//��ӿ�ʼ��ǩ
		//�õ���ǩ�������б�
		@SuppressWarnings("unchecked")
		List<Attribute> atts = elem.attributes();//��ȡ������ǩ�����ԣ�ʹ�÷���
		if(atts!=null){//�ж��Ƿ�������
			for(Attribute at:atts){//��ǿforѭ��
				sb.append(" "+at.getName()+"=\""+at.getValue()+"\"");//������������������ӽ��ַ�������
			}
		}
		sb.append(">");//��ĩβ�ı����ӽ����ַ�������
		//�õ��ı�
		@SuppressWarnings("unchecked")
		Iterator<Node> nodeIterator = elem.nodeIterator();//ͨ�����ڵ��ҳ��ӽ��
		while(nodeIterator.hasNext()){//ʹ��ѭ������������
			Node node=nodeIterator.next();//�õ�һ���ӽ��
			if(node instanceof Element){//�жθý���ǲ��Ǳ�ǩ
				Element ele=(Element)node;//����Ǳ�ǩ�򽫱�ǩת��
				getChildNode(ele, sb);//ʹ�õݹ�ķ���
			}
			if(node instanceof Text){//�ж˸ý���Ƿ�Ϊ�ı���ǩ
				Text text=(Text)node;//�����ת��Ϊ�ı���ǩ
				sb.append(text.getText());//���ı����ݼ����ַ������鵱��
			}
		}
		sb.append("</"+elem.getName()+">");//��ӽ�����ǩ
	}
}
