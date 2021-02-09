package com.xml;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import javax.xml.transform.stax.StAXResult;
import java.util.List;

public class Dom4jTest {
    @Test
    public void Test1() throws DocumentException {
        SAXReader saxReader = new SAXReader();
        Document doc = saxReader.read("src/com/xml/book.xml");
        System.out.println(doc);
    }
    @Test
    public void test2(){
        SAXReader saxReader = new SAXReader();
        Document doc = null;
        try {
            doc = saxReader.read("src/com/xml/book.xml");
            Element rootElement = doc.getRootElement();
            System.out.println(rootElement);
            List<Element> books = rootElement.elements("book");
            for(Element book:books){
                //asXML把标签对象转为标签字符串
                //System.out.println(book.asXML());
                //直接获取文本elementText
                book.attribute("sn");
                Element nameElement = book.element("name");
                String nameText = nameElement.getText();
                System.out.println(nameText);
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

}
