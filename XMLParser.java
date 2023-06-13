package com.oracle;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.*;


public class XMLParser {
    public static void main(String[] args) {
        String filePath = "src/com/oracle/datasheets_final.xml";
        File xmlFile = new File(filePath);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;
        try {
            dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nodeList = doc.getElementsByTagName("Question");
            // now XML is loaded as Document in memory, lets convert it to Object List
            List < Question > questionList = new ArrayList < Question > ();

            for (int i = 0; i < nodeList.getLength(); i++) {
                questionList.add(getQuestion(nodeList.item(i)));
            }
            // lets print Question list information
            for (Question emp: questionList) {
                System.out.println(emp.toString());
            }
        } catch (SAXException | ParserConfigurationException | IOException e1) {
            e1.printStackTrace();
        }

    }

    private static Question getQuestion(Node node) {
        // XMLReaderDOM domReader = new XMLReaderDOM();
        Question question = new Question();
        if (node.getNodeType() == Node.ELEMENT_NODE) {
            Element element = (Element) node;
            question.setId(parseInt(getTagValue("id", element)));
            question.setQuestionClassification(getTagValue("QuestionClassification", element));
            question.setQuestionTitle(getTagValue("QuestionTitle", element));
            question.setQuestionAnswer(parseInt(getTagValue("QuestionAnswer", element)));
            question.setQuestionAnswerExpected(parseInt(getTagValue("QuestionAnswerExpected", element)));
            question.setQuestionAnswerText(getTagValue("QuestionAnswerText", element));
        }
        return question;
    }

    private static String getTagValue(String tag, Element element) {
        NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
        Node node = (Node) nodeList.item(0);
        return node.getNodeValue();
    }
}
