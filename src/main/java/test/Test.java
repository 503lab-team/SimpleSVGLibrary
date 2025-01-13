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
            svg.setWidth("800");
            svg.setHeight("500");
            svgdoc.appendChild(svg);

            Path path = svgdoc.createPath();
            svg.appendChild(path);
            path.setId("path");
            path.setD("M 300 260 C 320 90 360 60 400 150");
            path.setStroke("blue");
            path.setFill("none");

            Text text1 = svgdoc.createText();
            svg.appendChild(text1);
            text1.setTextNode(document, "これは普通の文章です");
            text1.setX((float)20);
            text1.setY((float)50);

            Text text2 = svgdoc.createText();
            svg.appendChild(text2);
            text2.setTextNode(document, "これは");
            text2.setX("20");
            text2.setY("200");
            text2.setFontSize(25);
            text2.setFontWeight("bold");

                Tspan tspan = svgdoc.createTspan();
                text2.appendChild(tspan);
                SVGNumberList numberlist = new SVGNumberList();
                numberlist.appendItem("20");
                numberlist.appendItem("40");
                numberlist.appendItem("60");
                tspan.setRotate(numberlist);
                tspan.setTextNode(document, "テキストに");

                TextPath textpath = svgdoc.createTextPath();
                text2.appendChild(textpath);
                textpath.setTextNode(document, "修飾を施した文章です");
                textpath.setHref("#" + path.getId());

            Polygon polygon1 = svgdoc.createPolygon();
            svg.appendChild(polygon1);
            polygon1.setPoints("0 0");
            polygon1.appendPoints("0", "500");
            polygon1.appendPoints("800", "500");
            polygon1.appendPoints("800", "0");
            polygon1.setStroke("black");
            polygon1.setStrokeWidth("0.5");
            polygon1.setFill("none");

            Transformer transformer
                    = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            Result result = new StreamResult(new File("text.svg"));
            DOMSource source = new DOMSource();
            source.setNode(svgdoc.getDocument());
            transformer.transform(source, result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
