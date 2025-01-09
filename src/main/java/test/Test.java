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
            svg.setWidth("1000");
            svg.setHeight("600");
            svgdoc.appendChild(svg);

            Circle circle = svgdoc.createCircle();
            svg.appendChild(circle);
            circle.setCX("200");
            circle.setCY(300);
            circle.setR(SVGLength.TYPE_PER, 15);
            circle.setFill("blue");

            Ellipse ellipse = svgdoc.createEllipse();
            svg.appendChild(ellipse);
            ellipse.setCX(700);
            ellipse.setCY("600");
            ellipse.setRX("10%");
            ellipse.setRY((float)50.5);

            Line line = svgdoc.createLine();
            svg.appendChild(line);
            line.setX1((float)10.5);
            line.setY1("200pc");
            line.setX2(800);
            line.setY2(SVGLength.TYPE_UNKNOWN, 200);
            line.setStroke("green");
            line.setStrokeWidth(5);

            Polygon polygon = svgdoc.createPolygon();
            svg.appendChild(polygon);
            polygon.setPoints("900 500");
            polygon.appendPoints("600", "200");
            polygon.appendPoints((float)400.5, (float)600);
            polygon.setFill("yellow");
            polygon.setStroke("none");

            Polyline polyline = svgdoc.createPolyline();
            svg.appendChild(polyline);
            polyline.setPoints("100 10");
            polyline.appendPoints("900", "500");
            polyline.appendPoints("20", "100");
            polyline.setStroke("black");
            polyline.setStrokeWidth("7.5");
            polyline.setFill("none");

            Rect rect = svgdoc.createRect();
            svg.appendChild(rect);
            rect.setX("600");
            rect.setY(200);
            rect.setWidth(SVGLength.TYPE_PC, 20);
            rect.setHeight((float)90.5);
            rect.setStroke("red");
            rect.setFill("pink");

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
