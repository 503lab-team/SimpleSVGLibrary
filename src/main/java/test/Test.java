// 動作確認用

package test;

import sokadalab.svgdomtest.*;
import java.io.*;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.stream.*;
import javax.xml.transform.dom.*;

public class Test {
    public static void main(String[] args) {
        try {
            DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document = builder.newDocument();
            SVGDocument svgdoc = new SVGDocument(document);
            SVG svg = svgdoc.createSVG();
            svg.setWidth("1000");
            svg.setHeight("600");
            svgdoc.appendChild(svg);

            Ellipse c = svgdoc.createEllipse();
            c.setCX(SVGLength.TYPE_IN, (float)10.2);
            c.setCY("20.5pt");
            c.setRX(18);
            c.setRY(SVGLength.TYPE_CM, (float)0.8);

            c.setStroke("blue");
            c.setStrokeWidth((float)3.8);
            c.setFill("none");
            svg.appendChild(c);

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
