package XML;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

public class XmlParse {
    public static void main(String[] args) throws DocumentException {
        //获取document对象
        SAXReader saxReader=new SAXReader();
        Document document = saxReader.read(new File("step2/xml/student.xml"));

        Element rootElement = document.getRootElement();
        List<Element> studentElements = rootElement.elements("student");

        for (Element element : studentElements) {
            Attribute id = element.attribute("id");
            String value = id.getValue();
            Element name = element.element("name");
            Element age = element.element("age");
            String nameText = name.getText();
            String ageText = age.getText();

            System.out.println(value);
            System.out.println(nameText);
            System.out.println(ageText);


        }
    }
}
