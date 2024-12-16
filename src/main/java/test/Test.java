package test;

import sokadalab.svgdomtest.*;

import java.io.*;
import org.w3c.dom.Document;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.stream.*;
import javax.xml.transform.dom.*;

/**
 * 動作確認用
 */
public class Test {
    /**
     * メインのクラス
     * @param args 意味はありません
     */
    public static void main(String[] args) {
        try {
            DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document = builder.newDocument();
            SVGDocument svgdoc = new SVGDocument(document);
            SVG svg = svgdoc.createSVG();
            svg.setWidth("2000");
            svg.setHeight("1600");
            svgdoc.appendChild(svg);

            Title title = svgdoc.createTitle();
            svg.appendChild(title);
            title.setTextNode(document, "SimpleSVGLibrary");

            LinearGradient linear = svgdoc.createLinearGradient();
            svg.appendChild(linear);
            linear.setId("linear");

                Stop stop1 = svgdoc.createStop();
                linear.appendChild(stop1);
                stop1.setOffset("5%");
                stop1.setStopColor("yellow");

                Stop stop2 = svgdoc.createStop();
                linear.appendChild(stop2);
                stop2.setOffset("95%");
                stop2.setStopColor("green");

            Circle circle = svgdoc.createCircle();
            svg.appendChild(circle);
            circle.setCX("200");
            circle.setCY(300);
            circle.setR(SVGLength.TYPE_PER, 15);
            circle.setFill("url('#linear')");

            Desc desc1 = svgdoc.createDesc();
            svg.appendChild(desc1);
            desc1.setTextNode(document, circle.getR().getValueAsString());

            Desc desc2 = svgdoc.createDesc();
            svg.appendChild(desc2);
            desc2.setTextNode(document, stop1.getOffset());

            System.out.println("Test.java");

            Transformer transformer
                    = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            Result result = new StreamResult(new File("test.svg"));
            DOMSource source = new DOMSource();
            source.setNode(svgdoc.getDocument());
            transformer.transform(source, result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
